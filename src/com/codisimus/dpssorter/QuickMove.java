package com.codisimus.dpssorter;

public enum QuickMove implements Move {
    ACID(Type.POISON, 9, 8, 800),
    AIR_SLASH(Type.FLYING, 14, 10, 1200),
    ASTONISH(Type.GHOST, 8, 14, 1100),
    BITE(Type.DARK, 6, 4, 500),
    BUBBLE(Type.WATER, 12, 14, 1200),
    BUG_BITE(Type.BUG, 5, 6, 500),
    BULLET_PUNCH(Type.STEEL, 9, 10, 900),
    BULLET_SEED(Type.GRASS, 8, 14, 1100),
    CHARGE_BEAM(Type.ELECTRIC, 8, 15, 1100),
    CONFUSION(Type.PSYCHIC, 20, 15, 1600),
    COUNTER(Type.FIGHTING, 12, 8, 900),
    CUT(Type.NORMAL, 5, 5, 500),
    DRAGON_BREATH(Type.DRAGON, 6, 4, 500),
    DRAGON_TAIL(Type.DRAGON, 15, 9, 1100),
    EMBER(Type.FIRE, 10, 10, 1000),
    EXTRASENSORY(Type.PSYCHIC, 12, 12, 1100),
    FEINT_ATTACK(Type.DARK, 10, 9, 900),
    FIRE_FANG(Type.FIRE, 11, 8, 900),
    FIRE_SPIN(Type.FIRE, 14, 10, 1100),
    FROST_BREATH(Type.ICE, 10, 8, 900),
    FURY_CUTTER(Type.BUG, 3, 6, 400),
    HEX(Type.GHOST, 10, 15, 1200),
    HIDDEN_POWER(Type.NORMAL, 15, 15, 1500),
    ICE_SHARD(Type.ICE, 12, 12, 1200),
    INFESTATION(Type.BUG, 10, 14, 1100),
    IRON_TAIL(Type.STEEL, 15, 7, 1100),
    KARATE_CHOP(Type.FIGHTING, 8, 10, 800),
    LICK(Type.GHOST, 5, 6, 500),
    LOW_KICK(Type.FIGHTING, 6, 6, 600),
    METAL_CLAW(Type.STEEL, 8, 7, 700),
    MUD_SHOT(Type.GROUND, 5, 7, 600),
    MUD_SLAP(Type.GROUND, 15, 12, 1400),
    PECK(Type.FLYING, 10, 10, 1000),
    POISON_JAB(Type.POISON, 10, 7, 800),
    POISON_STING(Type.POISON, 5, 7, 600),
    POUND(Type.NORMAL, 7, 6, 600),
    POWDER_SNOW(Type.ICE, 6, 15, 1000),
    PSYCHO_CUT(Type.PSYCHIC, 5, 8, 600),
    QUICK_ATTACK(Type.NORMAL, 8, 10, 800),
    RAZOR_LEAF(Type.GRASS, 13, 7, 1000),
    ROCK_SMASH(Type.FIGHTING, 15, 10, 1300),
    ROCK_THROW(Type.ROCK, 12, 7, 900),
    SCRATCH(Type.NORMAL, 6, 4, 500),
    SHADOW_CLAW(Type.GHOST, 9, 6, 700),
    SNARL(Type.DARK, 12, 12, 1100),
    SPARK(Type.ELECTRIC, 6, 9, 700),
    SPLASH(Type.WATER, 0, 20, 1700),
    STEEL_WING(Type.STEEL, 11, 6, 800),
    STRUGGLE_BUG(Type.BUG, 15, 15, 1500),
    SUCKER_PUNCH(Type.DARK, 7, 8, 700),
    TACKLE(Type.NORMAL, 5, 5, 500),
    THUNDER_SHOCK(Type.ELECTRIC, 5, 8, 600),
    TRANSFORM(Type.NORMAL, 0, 0, 2200),
    VINE_WHIP(Type.GRASS, 7, 6, 600),
    VOLT_SWITCH(Type.ELECTRIC, 20, 25, 2300),
    WATER_GUN(Type.WATER, 5, 5, 500),
    WING_ATTACK(Type.FLYING, 8, 9, 800),
    ZEN_HEADBUTT(Type.PSYCHIC, 12, 10, 1100);

    private final Type type;
    private final int power;
    private final int energy;
    private final double cooldown;

    QuickMove(Type type, int power, int energy, int cooldown) {
        this.type = type;
        this.power = power;
        this.energy = energy;
        this.cooldown = cooldown / 1000.0;
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public int getPower() {
        return power;
    }

    public int getEnergy() {
        return energy;
    }

    @Override
    public double getCooldown() {
        return cooldown;
    }

    @Override
    public double getDps() {
        return power / cooldown;
    }

    public static QuickMove fromString(String string) {
        for (QuickMove move : QuickMove.values()) {
            if (move.toString().equals(string)) {
                return move;
            }
        }
        throw new EnumConstantNotPresentException(QuickMove.class, string);
    }

    @Override
    public String toString() {
        String[] strings = name().split("_");
        StringBuilder sb = new StringBuilder();
        for (String string : strings) {
            sb.append(" ");
            sb.append(Character.toUpperCase(string.charAt(0)));
            sb.append(string.substring(1).toLowerCase());
        }
        return sb.substring(1);
    }
}
