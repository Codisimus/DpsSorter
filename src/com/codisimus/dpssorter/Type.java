package com.codisimus.dpssorter;

import java.util.HashMap;
import java.util.Map;

public enum Type {
    NORMAL,
    FIRE,
    WATER,
    GRASS,
    ELECTRIC,
    ICE,
    FIGHTING,
    POISON,
    GROUND,
    FLYING,
    PSYCHIC,
    BUG,
    ROCK,
    GHOST,
    DARK,
    DRAGON,
    STEEL,
    FAIRY;
    private static final double SUPER_EFFECTIVE = 1.4;
    private static final double NOT_VERY_EFFECTIVE = 0.714;
    private static final double IMMUNE = 0.51;

    static {
        NORMAL.setEffectiveness(ROCK, NOT_VERY_EFFECTIVE);
        NORMAL.setEffectiveness(STEEL, NOT_VERY_EFFECTIVE);
        NORMAL.setEffectiveness(GHOST, IMMUNE);

        FIGHTING.setEffectiveness(DARK, SUPER_EFFECTIVE);
        FIGHTING.setEffectiveness(ICE, SUPER_EFFECTIVE);
        FIGHTING.setEffectiveness(NORMAL, SUPER_EFFECTIVE);
        FIGHTING.setEffectiveness(ROCK, SUPER_EFFECTIVE);
        FIGHTING.setEffectiveness(STEEL, SUPER_EFFECTIVE);
        FIGHTING.setEffectiveness(BUG, NOT_VERY_EFFECTIVE);
        FIGHTING.setEffectiveness(FAIRY, NOT_VERY_EFFECTIVE);
        FIGHTING.setEffectiveness(FLYING, NOT_VERY_EFFECTIVE);
        FIGHTING.setEffectiveness(POISON, NOT_VERY_EFFECTIVE);
        FIGHTING.setEffectiveness(PSYCHIC, NOT_VERY_EFFECTIVE);
        FIGHTING.setEffectiveness(GHOST, IMMUNE);

        FLYING.setEffectiveness(BUG, SUPER_EFFECTIVE);
        FLYING.setEffectiveness(FIGHTING, SUPER_EFFECTIVE);
        FLYING.setEffectiveness(GRASS, SUPER_EFFECTIVE);
        FLYING.setEffectiveness(ELECTRIC, NOT_VERY_EFFECTIVE);
        FLYING.setEffectiveness(ROCK, NOT_VERY_EFFECTIVE);
        FLYING.setEffectiveness(STEEL, NOT_VERY_EFFECTIVE);

        POISON.setEffectiveness(GRASS, SUPER_EFFECTIVE);
        POISON.setEffectiveness(FAIRY, SUPER_EFFECTIVE);
        POISON.setEffectiveness(GHOST, NOT_VERY_EFFECTIVE);
        POISON.setEffectiveness(GROUND, NOT_VERY_EFFECTIVE);
        POISON.setEffectiveness(POISON, NOT_VERY_EFFECTIVE);
        POISON.setEffectiveness(ROCK, NOT_VERY_EFFECTIVE);
        POISON.setEffectiveness(STEEL, IMMUNE);

        GROUND.setEffectiveness(ELECTRIC, SUPER_EFFECTIVE);
        GROUND.setEffectiveness(FIRE, SUPER_EFFECTIVE);
        GROUND.setEffectiveness(POISON, SUPER_EFFECTIVE);
        GROUND.setEffectiveness(ROCK, SUPER_EFFECTIVE);
        GROUND.setEffectiveness(STEEL, SUPER_EFFECTIVE);
        GROUND.setEffectiveness(BUG, NOT_VERY_EFFECTIVE);
        GROUND.setEffectiveness(GRASS, NOT_VERY_EFFECTIVE);
        GROUND.setEffectiveness(FLYING, IMMUNE);

        ROCK.setEffectiveness(BUG, SUPER_EFFECTIVE);
        ROCK.setEffectiveness(FIRE, SUPER_EFFECTIVE);
        ROCK.setEffectiveness(FLYING, SUPER_EFFECTIVE);
        ROCK.setEffectiveness(ICE, SUPER_EFFECTIVE);
        ROCK.setEffectiveness(FIGHTING, NOT_VERY_EFFECTIVE);
        ROCK.setEffectiveness(GROUND, NOT_VERY_EFFECTIVE);
        ROCK.setEffectiveness(STEEL, NOT_VERY_EFFECTIVE);

        BUG.setEffectiveness(PSYCHIC, SUPER_EFFECTIVE);
        BUG.setEffectiveness(GRASS, SUPER_EFFECTIVE);
        BUG.setEffectiveness(DARK, SUPER_EFFECTIVE);
        BUG.setEffectiveness(FIGHTING, NOT_VERY_EFFECTIVE);
        BUG.setEffectiveness(FIRE, NOT_VERY_EFFECTIVE);
        BUG.setEffectiveness(FLYING, NOT_VERY_EFFECTIVE);
        BUG.setEffectiveness(GHOST, NOT_VERY_EFFECTIVE);
        BUG.setEffectiveness(POISON, NOT_VERY_EFFECTIVE);
        BUG.setEffectiveness(STEEL, NOT_VERY_EFFECTIVE);
        BUG.setEffectiveness(FAIRY, NOT_VERY_EFFECTIVE);

        GHOST.setEffectiveness(GHOST, SUPER_EFFECTIVE);
        GHOST.setEffectiveness(PSYCHIC, SUPER_EFFECTIVE);
        GHOST.setEffectiveness(DARK, NOT_VERY_EFFECTIVE);
        GHOST.setEffectiveness(NORMAL, IMMUNE);

        STEEL.setEffectiveness(FAIRY, SUPER_EFFECTIVE);
        STEEL.setEffectiveness(ICE, SUPER_EFFECTIVE);
        STEEL.setEffectiveness(ROCK, SUPER_EFFECTIVE);
        STEEL.setEffectiveness(ELECTRIC, NOT_VERY_EFFECTIVE);
        STEEL.setEffectiveness(FIRE, NOT_VERY_EFFECTIVE);
        STEEL.setEffectiveness(STEEL, NOT_VERY_EFFECTIVE);
        STEEL.setEffectiveness(WATER, NOT_VERY_EFFECTIVE);

        FIRE.setEffectiveness(BUG, SUPER_EFFECTIVE);
        FIRE.setEffectiveness(GRASS, SUPER_EFFECTIVE);
        FIRE.setEffectiveness(ICE, SUPER_EFFECTIVE);
        FIRE.setEffectiveness(STEEL, SUPER_EFFECTIVE);
        FIRE.setEffectiveness(DRAGON, NOT_VERY_EFFECTIVE);
        FIRE.setEffectiveness(FIRE, NOT_VERY_EFFECTIVE);
        FIRE.setEffectiveness(ROCK, NOT_VERY_EFFECTIVE);
        FIRE.setEffectiveness(WATER, NOT_VERY_EFFECTIVE);

        WATER.setEffectiveness(FIRE, SUPER_EFFECTIVE);
        WATER.setEffectiveness(GROUND, SUPER_EFFECTIVE);
        WATER.setEffectiveness(ROCK, SUPER_EFFECTIVE);
        WATER.setEffectiveness(DRAGON, NOT_VERY_EFFECTIVE);
        WATER.setEffectiveness(GRASS, NOT_VERY_EFFECTIVE);
        WATER.setEffectiveness(WATER, NOT_VERY_EFFECTIVE);

        GRASS.setEffectiveness(GROUND, SUPER_EFFECTIVE);
        GRASS.setEffectiveness(ROCK, SUPER_EFFECTIVE);
        GRASS.setEffectiveness(WATER, SUPER_EFFECTIVE);
        GRASS.setEffectiveness(BUG, NOT_VERY_EFFECTIVE);
        GRASS.setEffectiveness(DRAGON, NOT_VERY_EFFECTIVE);
        GRASS.setEffectiveness(FIRE, NOT_VERY_EFFECTIVE);
        GRASS.setEffectiveness(FLYING, NOT_VERY_EFFECTIVE);
        GRASS.setEffectiveness(GRASS, NOT_VERY_EFFECTIVE);
        GRASS.setEffectiveness(POISON, NOT_VERY_EFFECTIVE);
        GRASS.setEffectiveness(STEEL, NOT_VERY_EFFECTIVE);

        ELECTRIC.setEffectiveness(FLYING, SUPER_EFFECTIVE);
        ELECTRIC.setEffectiveness(WATER, SUPER_EFFECTIVE);
        ELECTRIC.setEffectiveness(BUG, NOT_VERY_EFFECTIVE);
        ELECTRIC.setEffectiveness(DRAGON, NOT_VERY_EFFECTIVE);
        ELECTRIC.setEffectiveness(ELECTRIC, NOT_VERY_EFFECTIVE);
        ELECTRIC.setEffectiveness(GRASS, NOT_VERY_EFFECTIVE);
        ELECTRIC.setEffectiveness(GROUND, IMMUNE);

        PSYCHIC.setEffectiveness(FIGHTING, SUPER_EFFECTIVE);
        PSYCHIC.setEffectiveness(POISON, SUPER_EFFECTIVE);
        PSYCHIC.setEffectiveness(PSYCHIC, NOT_VERY_EFFECTIVE);
        PSYCHIC.setEffectiveness(STEEL, NOT_VERY_EFFECTIVE);
        PSYCHIC.setEffectiveness(DARK, IMMUNE);

        ICE.setEffectiveness(DRAGON, SUPER_EFFECTIVE);
        ICE.setEffectiveness(FLYING, SUPER_EFFECTIVE);
        ICE.setEffectiveness(GRASS, SUPER_EFFECTIVE);
        ICE.setEffectiveness(GROUND, SUPER_EFFECTIVE);
        ICE.setEffectiveness(FIRE, NOT_VERY_EFFECTIVE);
        ICE.setEffectiveness(ICE, NOT_VERY_EFFECTIVE);
        ICE.setEffectiveness(STEEL, NOT_VERY_EFFECTIVE);
        ICE.setEffectiveness(WATER, NOT_VERY_EFFECTIVE);

        DARK.setEffectiveness(GHOST, SUPER_EFFECTIVE);
        DARK.setEffectiveness(PSYCHIC, SUPER_EFFECTIVE);
        DARK.setEffectiveness(DARK, NOT_VERY_EFFECTIVE);
        DARK.setEffectiveness(FIGHTING, NOT_VERY_EFFECTIVE);
        DARK.setEffectiveness(FAIRY, NOT_VERY_EFFECTIVE);

        DRAGON.setEffectiveness(DRAGON, SUPER_EFFECTIVE);
        DRAGON.setEffectiveness(STEEL, NOT_VERY_EFFECTIVE);
        DRAGON.setEffectiveness(FAIRY, IMMUNE);

        FAIRY.setEffectiveness(DARK, SUPER_EFFECTIVE);
        FAIRY.setEffectiveness(DRAGON, SUPER_EFFECTIVE);
        FAIRY.setEffectiveness(FIGHTING, SUPER_EFFECTIVE);
        FAIRY.setEffectiveness(FIRE, NOT_VERY_EFFECTIVE);
        FAIRY.setEffectiveness(POISON, NOT_VERY_EFFECTIVE);
        FAIRY.setEffectiveness(STEEL, NOT_VERY_EFFECTIVE);
    }

    private final Map<Type, Double> effectiveness = new HashMap<>();
    
    private void setEffectiveness(Type type, double multiplier) {
        effectiveness.put(type, multiplier);
    }

    public double getEffectiveness(Type type) {
        return effectiveness.containsKey(type) ? effectiveness.get(type) : 1;
    }

    public double getEffectivenes(Species species) {
        double multiplier = getEffectiveness(species.getTypeOne());
        Type typeTwo = species.getTypeTwo();
        if (typeTwo != null) {
            multiplier *= getEffectiveness(typeTwo);
        }
        return multiplier;
    }
}
