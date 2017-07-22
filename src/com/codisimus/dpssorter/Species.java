package com.codisimus.dpssorter;

import java.util.EnumSet;

public enum Species {
    BULBASAUR(Type.GRASS, Type.POISON, 118, QuickMove.VINE_WHIP, QuickMove.TACKLE, ChargeMove.SLUDGE_BOMB, ChargeMove.POWER_WHIP, ChargeMove.SEED_BOMB),
    IVYSAUR(Type.GRASS, Type.POISON, 151, QuickMove.RAZOR_LEAF, QuickMove.VINE_WHIP),
    VENUSAUR(Type.GRASS, Type.POISON, 198, QuickMove.RAZOR_LEAF, QuickMove.VINE_WHIP),
    CHARMANDER(Type.FIRE, 116, QuickMove.SCRATCH, QuickMove.EMBER),
    CHARMELEON(Type.FIRE, 158, QuickMove.FIRE_FANG, QuickMove.SCRATCH, QuickMove.EMBER),
    CHARIZARD(Type.FIRE, Type.FLYING, 223, QuickMove.FIRE_SPIN, QuickMove.AIR_SLASH, QuickMove.WING_ATTACK, QuickMove.EMBER),
    SQUIRTLE(Type.WATER, 94, QuickMove.BUBBLE, QuickMove.TACKLE),
    WARTORTLE(Type.WATER, 126, QuickMove.BITE, QuickMove.WATER_GUN),
    BLASTOISE(Type.WATER, 171, QuickMove.BITE, QuickMove.WATER_GUN),
    CATERPIE(Type.BUG, 55, QuickMove.BUG_BITE, QuickMove.TACKLE),
    METAPOD(Type.BUG, 45, QuickMove.BUG_BITE, QuickMove.TACKLE),
    BUTTERFREE(Type.BUG, Type.FLYING, 167, QuickMove.CONFUSION, QuickMove.BUG_BITE, QuickMove.STRUGGLE_BUG),
    WEEDLE(Type.BUG, Type.POISON, 63, QuickMove.BUG_BITE, QuickMove.POISON_STING),
    KAKUNA(Type.BUG, Type.POISON, 46, QuickMove.BUG_BITE, QuickMove.POISON_STING),
    BEEDRILL(Type.BUG, Type.POISON, 169, QuickMove.POISON_JAB, QuickMove.BUG_BITE, QuickMove.INFESTATION),
    PIDGEY(Type.NORMAL, Type.FLYING, 85, QuickMove.QUICK_ATTACK, QuickMove.TACKLE),
    PIDGEOTTO(Type.NORMAL, Type.FLYING, 117, QuickMove.STEEL_WING, QuickMove.WING_ATTACK),
    PIDGEOT(Type.NORMAL, Type.FLYING, 166, QuickMove.AIR_SLASH, QuickMove.STEEL_WING, QuickMove.WING_ATTACK),
    RATTATA(Type.NORMAL, 103, QuickMove.QUICK_ATTACK, QuickMove.TACKLE),
    RATICATE(Type.NORMAL, 161, QuickMove.BITE, QuickMove.QUICK_ATTACK),
    SPEAROW(Type.NORMAL, Type.FLYING, 112, QuickMove.PECK, QuickMove.QUICK_ATTACK),
    FEAROW(Type.NORMAL, Type.FLYING, 182, QuickMove.STEEL_WING, QuickMove.PECK),
    EKANS(Type.POISON, 110, QuickMove.ACID, QuickMove.POISON_STING),
    ARBOK(Type.POISON, 167, QuickMove.ACID, QuickMove.BITE),
    PIKACHU(Type.ELECTRIC, 112, QuickMove.QUICK_ATTACK, QuickMove.THUNDER_SHOCK),
    RAICHU(Type.ELECTRIC, 193, QuickMove.VOLT_SWITCH, QuickMove.SPARK, QuickMove.THUNDER_SHOCK),
    SANDSHREW(Type.GROUND, 126),
    SANDSLASH(Type.GROUND, 182),
    NIDORAN_GIRL("Nidoran♀", Type.POISON, 86),
    NIDORINA(Type.POISON, 117),
    NIDOQUEEN(Type.POISON, Type.GROUND, 180),
    NIDORAN_BOY("Nidoran♂", Type.POISON, 105),
    NIDOINO(Type.POISON, 137),
    NIDOKING(Type.POISON, Type.GROUND, 204),
    CLEFAIRY(Type.FAIRY, 107),
    CLEFABLE(Type.FAIRY, 178),
    VULPIX(Type.FIRE, 96),
    NINETALES(Type.FIRE, 169),
    JIGGLYPUFF(Type.NORMAL, Type.FAIRY, 80),
    WIGGLYTUFF(Type.NORMAL, Type.FAIRY, 156),
    ZUBAT(Type.POISON, Type.FLYING, 83),
    GOLBAT(Type.POISON, Type.FLYING, 161),
    ODDISH(Type.GRASS, Type.POISON, 131),
    GLOOM(Type.GRASS, Type.POISON, 153),
    VILEPLUME(Type.GRASS, Type.POISON, 202),
    PARAS(Type.BUG, Type.GRASS, 121),
    PARASECT(Type.BUG, Type.GRASS, 165),
    VENONAT(Type.BUG, Type.POISON, 100),
    VENOMOTH(Type.BUG, Type.POISON, 179),
    DIGLETT(Type.GROUND, 109),
    DUGTRIO(Type.GROUND, 167),
    MEOWTH(Type.NORMAL, 92),
    PERSIAN(Type.NORMAL, 130),
    PSYDUCK(Type.WATER, 122),
    GOLDUCK(Type.WATER, 191),
    MANKEY(Type.FIGHTING, 148),
    PRIMEAPE(Type.FIGHTING, 207),
    GROWLITHE(Type.FIRE, 136),
    ARCANINE(Type.FIRE, 227),
    POLIWAG(Type.WATER, 101),
    POLIWHIRL(Type.WATER, 130),
    POLIWRATH(Type.WATER, Type.FIGHTING, 182),
    ABRA(Type.PSYCHIC, 195),
    KADABRA(Type.PSYCHIC, 232),
    ALAKAZAM(Type.PSYCHIC, 271),
    MACHOP(Type.FIGHTING, 137),
    MACHOKE(Type.FIGHTING, 177),
    MACHAMP(Type.FIGHTING, 234),
    BELLSPROUT(Type.GRASS, Type.POISON, 139),
    WEEPINBELL(Type.GRASS, Type.POISON, 172),
    VICTREEBEL(Type.GRASS, Type.POISON, 207),
    TENTACOOL(Type.WATER, Type.POISON, 97),
    TENTACRUEL(Type.WATER, Type.POISON, 166),
    GEODUDE(Type.ROCK, Type.GROUND, 132),
    GRAVELER(Type.ROCK, Type.GROUND, 164),
    GOLEM(Type.ROCK, Type.GROUND, 211),
    PONYTA(Type.FIRE, 170),
    RAPIDASH(Type.FIRE, 207),
    SLOWPOKE(Type.WATER, Type.PSYCHIC, 109),
    SLOWBRO(Type.WATER, Type.PSYCHIC, 177),
    MAGNEMITE(Type.ELECTRIC, Type.STEEL, 165),
    MAGNETON(Type.ELECTRIC, Type.STEEL, 223),
    FARFETCHD("Farfetch'd", Type.NORMAL, Type.FLYING, 124),
    DODUO(Type.NORMAL, Type.FLYING, 158),
    DODRIO(Type.NORMAL, Type.FLYING, 218),
    SEEL(Type.WATER, 85),
    DEWGONG(Type.WATER, Type.ICE, 139),
    GRIMER(Type.POISON, 135),
    MUK(Type.POISON, 190),
    SHELLDER(Type.WATER, 116),
    CLOYSTER(Type.WATER, Type.ICE, 186),
    GASTLY(Type.GHOST, Type.POISON, 186),
    HAUNTER(Type.GHOST, Type.POISON, 223),
    GENGAR(Type.GHOST, Type.POISON, 261),
    ONIX(Type.ROCK, Type.GROUND, 85),
    DROWZEE(Type.PSYCHIC, 89),
    HYPNO(Type.PSYCHIC, 144),
    KRABBY(Type.WATER, 181),
    KINGLER(Type.WATER, 240),
    VOLTORB(Type.ELECTRIC, 109),
    ELECTRODE(Type.ELECTRIC, 173),
    EXEGGCUTE(Type.GRASS, Type.PSYCHIC, 107),
    EXEGGUTOR(Type.GRASS, Type.PSYCHIC, 233),
    CUBONE(Type.GROUND, 90),
    MAROWAK(Type.GROUND, 144),
    HITMONLEE(Type.FIGHTING, 224),
    HITMONCHAN(Type.FIGHTING, 193),
    LICKITUNG(Type.NORMAL, 108),
    KOFFING(Type.POISON, 119),
    WEEZING(Type.POISON, 174),
    RYHORN(Type.GROUND, Type.ROCK, 140),
    RYDON(Type.GROUND, Type.ROCK, 222),
    CHANSEY(Type.NORMAL, 60),
    TANGELA(Type.GRASS, 183),
    KANGASKHAN(Type.NORMAL, 181),
    HORSEA(Type.WATER, 129),
    SEADRA(Type.WATER, 187),
    GOLDEEN(Type.WATER, 123),
    SEAKING(Type.WATER, 175),
    STARYU(Type.WATER, 137),
    STARMIE(Type.WATER, Type.PSYCHIC, 210),
    MRMIME("Mr. Mime", Type.PSYCHIC, Type.FAIRY, 192),
    SCYTHER(Type.BUG, Type.FLYING, 218),
    JYNX(Type.ICE, Type.PSYCHIC, 223),
    ELECTABUZZ(Type.ELECTRIC, 198),
    MAGMAR(Type.FIRE, 206),
    PINSIR(Type.BUG, 238),
    TAUROS(Type.NORMAL, 198),
    MAGIKARP(Type.WATER, 29),
    GYARADOS(Type.WATER, Type.FLYING, 237),
    LAPRAS(Type.WATER, Type.ICE, 165),
    DITTO(Type.NORMAL, 91),
    EEVEE(Type.NORMAL, 104),
    VAPOREON(Type.WATER, 205),
    JOLTEON(Type.ELECTRIC, 232),
    FLAREON(Type.FIRE, 246),
    PORYGON(Type.NORMAL, 153),
    OMANYTE(Type.ROCK, Type.WATER, 155),
    OMASTAR(Type.ROCK, Type.WATER, 207),
    KABUTO(Type.ROCK, Type.WATER, 148),
    KABUTOPS(Type.ROCK, Type.WATER, 220),
    AERODACTYL(Type.ROCK, Type.FLYING, 221),
    SNORLAX(Type.NORMAL, 190),
    ARTICUNO(Type.ICE, Type.FLYING, 192),
    ZAPDOS(Type.ELECTRIC, Type.FLYING, 253),
    MOLTRES(Type.FIRE, Type.FLYING, 251),
    DRATINI(Type.DRAGON, 119),
    DRAGONAIR(Type.DRAGON, 163),
    DRAGONITE(Type.DRAGON, Type.FLYING, 263),
    MEWTWO(Type.PSYCHIC, 330),
    MEW(Type.PSYCHIC, 210),

    CHIKORITA(Type.GRASS, 92),
    BAYLEEF(Type.GRASS, 122),
    MEGANIUM(Type.GRASS, 168),
    CYNDAQUIL(Type.FIRE, 116),
    QUILAVA(Type.FIRE, 158),
    TYPHLOSION(Type.FIRE, 223),
    TOTODILE(Type.WATER, 117),
    CROCONAW(Type.WATER, 150),
    FERALIGATR(Type.WATER, 205),
    SENTRET(Type.NORMAL, 79),
    FURRET(Type.NORMAL, 148),
    HOOTHOOT(Type.NORMAL, Type.FLYING, 67),
    NOCTOWL(Type.NORMAL, Type.FLYING, 145),
    LEDYBA(Type.BUG, Type.FLYING, 72),
    LEDIAN(Type.BUG, Type.FLYING, 107),
    SPINARAK(Type.BUG, Type.POISON, 105),
    ARIADOS(Type.BUG, Type.POISON, 161),
    CROBAT(Type.POISON, Type.FLYING, 194),
    CHINCHOU(Type.WATER, Type.ELECTRIC, 106),
    LANTURN(Type.WATER, Type.ELECTRIC, 146),
    PICHU(Type.ELECTRIC, 77),
    CLEFFA(Type.FAIRY, 75),
    IGGLYBUFF(Type.NORMAL, Type.FAIRY, 69),
    TOGEPI(Type.FAIRY, 67),
    TOGETIC(Type.FAIRY, Type.FLYING, 139),
    NATU(Type.PSYCHIC, Type.FLYING, 134),
    XATU(Type.PSYCHIC, Type.FLYING, 192),
    MAREEP(Type.ELECTRIC, 114),
    FLAAFY(Type.ELECTRIC, 145),
    AMPHAROS(Type.ELECTRIC, 211),
    BELLOSSOM(Type.GRASS, 169),
    MARILL(Type.WATER, Type.FAIRY, 37),
    AZUMARILL(Type.WATER, Type.FAIRY, 112),
    SUDOWOODO(Type.ROCK, 167),
    POLITOED(Type.WATER, 174),
    HOPPIP(Type.GRASS, Type.FLYING, 67),
    SKIPLOOM(Type.GRASS, Type.FLYING, 91),
    JUMPLUFF(Type.GRASS, Type.FLYING, 118),
    AIPOM(Type.NORMAL, 136),
    SUNKERN(Type.GRASS, 55),
    SUNFLORA(Type.GRASS, 185),
    YANMA(Type.BUG, Type.FLYING, 154),
    WOOPER(Type.WATER, Type.GROUND, 75),
    QUAGSIRE(Type.WATER, Type.GROUND, 152),
    ESPEON(Type.PSYCHIC, 261),
    UMBREON(Type.DARK, 126),
    MURKROW(Type.DARK, Type.FLYING, 175),
    SLOWKING(Type.WATER, Type.PSYCHIC, 177),
    MISDREAVUS(Type.GHOST, 167),
    UNOWN(Type.PSYCHIC, 136),
    WOBBUFFET(Type.PSYCHIC, 60),
    GIRAFARIG(Type.NORMAL, Type.PSYCHIC, 182),
    PINECO(Type.BUG, 108),
    FORRETRESS(Type.BUG, Type.STEEL, 161),
    DUNSPARCE(Type.NORMAL, 131),
    GLIGAR(Type.GROUND, Type.FLYING, 143),
    STEELIX(Type.STEEL, Type.GROUND, 148),
    SNUBBULL(Type.FAIRY, 137),
    GRANBULL(Type.FAIRY, 212),
    QWILFISH(Type.WATER, Type.POISON, 184),
    SCIZOR(Type.BUG, Type.STEEL, 236),
    SHUCKLE(Type.BUG, Type.ROCK, 17),
    HERACROSS(Type.BUG, Type.FIGHTING, 234),
    SNEASEL(Type.DARK, Type.ICE, 189),
    TEDDIURSA(Type.NORMAL, 142),
    URSARING(Type.NORMAL, 236),
    SLUGMA(Type.FIRE, 118),
    MAGCARGO(Type.FIRE, Type.ROCK, 139),
    SWINUB(Type.ICE, Type.GROUND, 90),
    PILOSWINE(Type.ICE, Type.GROUND, 181),
    CORSOLA(Type.WATER, Type.ROCK, 118),
    REMORAID(Type.WATER, 127),
    OCTILLERY(Type.WATER, 197),
    DELIBIRD(Type.ICE, Type.FLYING, 128),
    MANTINE(Type.WATER, Type.FLYING, 148),
    SKARMORY(Type.STEEL, Type.FLYING, 148),
    HOUNDOUR(Type.DARK, Type.FIRE, 152),
    HOUNDOOM(Type.DARK, Type.FIRE, 224),
    KINGDRA(Type.WATER, Type.DRAGON, 194),
    PHANPY(Type.GROUND, 107),
    DONPHAN(Type.GROUND, 214),
    PORYGON2(Type.NORMAL, 198),
    STANTLER(Type.NORMAL, 192),
    SMEARGLE(Type.NORMAL, 40),
    TYROGUE(Type.FIGHTING, 64),
    HITMONTOP(Type.FIGHTING, 173),
    SMOOCHUM(Type.ICE, Type.PSYCHIC, 153),
    ELEKID(Type.ELECTRIC, 135),
    MAGBY(Type.FIRE, 151),
    MILTANK(Type.NORMAL, 157),
    BLISSEY(Type.NORMAL, 129),
    RAIKOU(Type.ELECTRIC, 241),
    ENTEI(Type.FIRE, 235),
    SUICUNE(Type.WATER, 180),
    LARVITAR(Type.ROCK, Type.GROUND, 115),
    PUPITAR(Type.ROCK, Type.GROUND, 155),
    TYRANITAR(Type.ROCK, Type.DARK, 251),
    LUGIA(Type.PSYCHIC, Type.FLYING, 193),
    HOOH("Ho-Oh", Type.FIRE, Type.FLYING, 263),
    CELEBI(Type.PSYCHIC, Type.GRASS, 210);

    private final String displayName;
    private final Type typeOne;
    private final Type typeTwo;
    private final int baseAtk;
    private final EnumSet<QuickMove> quickMoves = EnumSet.noneOf(QuickMove.class);
    private final EnumSet<ChargeMove> chargeMoves = EnumSet.noneOf(ChargeMove.class);

    Species(Type typeOne, int baseAtk, Move... moves) {
        this(null, typeOne, null, baseAtk, moves);
    }

    Species(String displayName, Type typeOne, int baseAtk, Move... moves) {
        this(displayName, typeOne, null, baseAtk, moves);
    }

    Species(Type typeOne, Type typeTwo, int baseAtk, Move... moves) {
        this(null, typeOne, typeTwo, baseAtk, moves);
    }

    Species(String displayName, Type typeOne, Type typeTwo, int baseAtk, Move... moves) {
        this.displayName = displayName;
        this.typeOne = typeOne;
        this.typeTwo = typeTwo;
        this.baseAtk = baseAtk;
        for (Move move : moves) {
            if (move instanceof QuickMove) {
                quickMoves.add((QuickMove) move);
            } else if (move instanceof ChargeMove) {
                chargeMoves.add((ChargeMove) move);
            }
        }
    }

    public int getNumber() {
        return this.ordinal() + 1;
    }

    public Type getTypeOne() {
        return typeOne;
    }

    public Type getTypeTwo() {
        return typeTwo;
    }

    public int getBaseAtk() {
        return baseAtk;
    }

    public boolean isType(Type type) {
        return typeOne == type || typeTwo == type;
    }

    public static Species fromString(String string) {
        for (Species species : Species.values()) {
            if (species.toString().equals(string)) {
                return species;
            }
        }
        throw new EnumConstantNotPresentException(Species.class, string);
    }

    @Override
    public String toString() {
        return displayName == null
                ? Character.toUpperCase(name().charAt(0))
                    + name().substring(1).toLowerCase()
                : displayName;
    }
}
