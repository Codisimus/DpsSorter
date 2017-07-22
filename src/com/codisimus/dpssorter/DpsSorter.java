package com.codisimus.dpssorter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Stream;

public class DpsSorter {
    private static final int TEAM_COUNT = 10;
    private static final SpeciesSet SPECIES_SET = SpeciesSet.ALL;
    private static final Logger logger = Logger.getLogger(DpsSorter.class.getName());

    public static void main(String[] args) throws IOException {
        List<Pokemon> pokemonList = CsvLoader.load("pokemon.csv", Pokemon.class);
        File file = new File("output.txt");
        file.createNewFile();
        try (FileOutputStream fos = new FileOutputStream(file)) {
            for (Species species : SPECIES_SET.getSpeciesSet()) {
                sortAndPrint(pokemonList, species, new PrintWriter(fos));
            }
        }
    }

    public static List<Pokemon> loadPokemonList(String fileName) throws IOException {
        List<Pokemon> pokemonList = new LinkedList<>();
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            stream.forEach(line -> {
                String[] parameters = line.split(",");
                Species species = Species.valueOf(parameters[0]);
                int cp = Integer.parseInt(parameters[1]);
                double level = Double.parseDouble(parameters[2]);
                int atkIv = Integer.parseInt(parameters[3]);
                QuickMove quickMove = QuickMove.valueOf(parameters[4]);
                ChargeMove chargeMove = ChargeMove.valueOf(parameters[5]);
                Pokemon pokemon = new Pokemon(species, cp, level, atkIv, quickMove, chargeMove);
                pokemonList.add(pokemon);
            });
        }
        return pokemonList;
    }

    public static void sortAndPrint(List<Pokemon> pokemonList, Species species, PrintWriter out) {
        sortPokemonByDps(pokemonList, species);
        out.print(species);
        out.print(" [");
        out.print(species.getTypeOne());
        Type typeTwo = species.getTypeTwo();
        if (typeTwo != null) {
            out.print('|');
            out.print(typeTwo);
        }
        out.println("]:");
        print(pokemonList, species, out);
        out.println();
        out.flush();
    }

    public static List<Pokemon> sortPokemonByDps(List<Pokemon> pokemonList, Species species) {
        pokemonList.sort((Pokemon p1, Pokemon p2) -> {
            double p1Dps = p1.getDpsAgainst(species);
            double p2Dps = p2.getDpsAgainst(species);
            return Double.compare(p2Dps, p1Dps);
        });
        return pokemonList;
    }

    public static List<Species> sortSpeciesByPower() {
        List<Species> list = Arrays.asList(Species.values());
        list.sort((Species s1, Species s2) -> Integer.compare(s2.getBaseAtk(), s1.getBaseAtk()));
        return list;
    }

    public static void print(List<Pokemon> pokemonList, Species species, PrintWriter out) {
        for (int i = 0; i < TEAM_COUNT; i++) {
            Pokemon pokemon = pokemonList.get(i);
            out.print(pokemon.getName());
            out.print(" - ");
            out.printf("%.2f", pokemon.getDpsAgainst(species));
            out.print(" dps");
            if (pokemon.isChargeMoveUseless(species)) {
                out.print(" (no charge)");
            }
            out.println();
        }
    }
}
