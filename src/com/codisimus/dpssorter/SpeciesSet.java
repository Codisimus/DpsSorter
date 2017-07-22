package com.codisimus.dpssorter;

import java.util.EnumSet;

public enum SpeciesSet {
    ALL(EnumSet.allOf(Species.class)),
    TYPES(EnumSet.of(Species.MEWTWO, Species.DRAGONITE, Species.HOOH,
            Species.GENGAR, Species.ZAPDOS, Species.TYRANITAR, Species.FLAREON,
            Species.RAIKOU, Species.KINGLER, Species.PINSIR, Species.GYARADOS,
            Species.SCIZOR, Species.URSARING, Species.MACHAMP, Species.HERACROSS,
            Species.EXEGGUTOR, Species.HOUNDOOM, Species.MAGNETON, Species.JYNX,
            Species.RYDON, Species.AERODACTYL, Species.KABUTOPS, Species.DODRIO,
            Species.SCYTHER, Species.DONPHAN, Species.GRANBULL, Species.GOLEM,
            Species.STARMIE, Species.CELEBI, Species.VICTREEBEL, Species.NIDOKING,
            Species.CROBAT, Species.KINGDRA, Species.LUGIA, Species.MRMIME,
            Species.ARTICUNO, Species.MUK, Species.SNEASEL, Species.CLOYSTER,
            Species.SUNFLORA, Species.QWILFISH, Species.POLIWRATH,
            Species.GIRAFARIG, Species.PILOSWINE, Species.VENOMOTH,
            Species.MURKROW, Species.SUDOWOODO, Species.MISDREAVUS,
            Species.PARASECT, Species.DRAGONAIR, Species.WIGGLYTUFF,
            Species.QUAGSIRE, Species.STEELIX, Species.SKARMORY, Species.LANTURN,
            Species.GLIGAR, Species.TOGETIC, Species.MAGCARGO, Species.UMBREON,
            Species.JUMPLUFF, Species.CORSOLA, Species.AZUMARILL, Species.SHUCKLE)),
    LEGENDARIES(EnumSet.of(Species.ARTICUNO, Species.ZAPDOS, Species.MOLTRES,
            Species.MEWTWO, Species.MEW, Species.RAIKOU, Species.ENTEI,
            Species.SUICUNE, Species.LUGIA, Species.HOOH, Species.CELEBI));

    private final EnumSet<Species> speciesSet;

    SpeciesSet(EnumSet<Species> speciesSet) {
        this.speciesSet = speciesSet;
    }

    public EnumSet<Species> getSpeciesSet() {
        return speciesSet;
    }
}
