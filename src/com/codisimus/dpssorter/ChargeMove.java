package com.codisimus.dpssorter;

public enum ChargeMove implements Move {
    AERIAL_ACE(Type.FLYING, 55, 33, 2400),
    AIR_CUTTER(Type.FLYING, 60, 50, 2700),
    ANCIENT_POWER(Type.ROCK, 70, 33, 3500),
    AQUA_JET(Type.WATER, 45, 33, 2600),
    AQUA_TAIL(Type.WATER, 50, 33, 1900),
    AURORA_BEAM(Type.ICE, 80, 50, 3600),
    AVALANCHE(Type.ICE, 90, 50, 2700),
    BLIZZARD(Type.ICE, 130, 100, 3100),
    BODY_SLAM(Type.NORMAL, 50, 33, 1900),
    BONE_CLUB(Type.GROUND, 40, 33, 1600),
    BRAVE_BIRD(Type.FLYING, 90, 100, 2000),
    BRICK_BREAK(Type.FIGHTING, 40, 33, 1600),
    BRINE(Type.WATER, 60, 50, 2300),
    BUBBLE_BEAM(Type.WATER, 45, 33, 1900),
    BUG_BUZZ(Type.BUG, 90, 50, 3700),
    BULLDOZE(Type.GROUND, 80, 50, 3500),
    CLOSE_COMBAT(Type.FIGHTING, 100, 100, 2300),
    CROSS_CHOP(Type.FIGHTING, 50, 50, 1500),
    CROSS_POISON(Type.POISON, 40, 33, 1500),
    CRUNCH(Type.DARK, 70, 33, 3200),
    DARKK_PULSE(Type.DARK, 80, 50, 3000),
    DAZZLING_GLEAM(Type.FAIRY, 100, 50, 3500),
    DIG(Type.GROUND, 100, 50, 4700),
    DISARMING_VOICE(Type.FAIRY, 70, 33, 3900),
    DISCHARGE(Type.ELECTRIC, 65, 33, 2500),
    DRAGON_CLAW(Type.DRAGON, 50, 33, 1700),
    DRAGON_PULSE(Type.DRAGON, 90, 50, 3600),
    DRAINING_KISS(Type.FAIRY, 60, 50, 2600),
    DRILL_PECK(Type.FLYING, 60, 33, 2300),
    DRILL_RUN(Type.GROUND, 80, 50, 2800),
    DYNAMIC_PUNCH(Type.FIGHTING, 90, 50, 2700),
    EARTHQUAKE(Type.GROUND, 120, 100, 3600),
    ENERGY_BALL(Type.GRASS, 90, 50, 3900),
    FIRE_BLAST(Type.FIRE, 140, 100, 4200),
    FIRE_PUNCH(Type.FIRE, 55, 33, 2200),
    FLAME_BURST(Type.FIRE, 70, 50, 2600),
    FLAME_CHARGE(Type.FIRE, 70, 33, 3800),
    FLAME_WHEEL(Type.FIRE, 60, 50, 2700),
    FLAMETHROWER(Type.FIRE, 70, 50, 2200),
    FLASH_CANNON(Type.STEEL, 100, 100, 2700),
    FOCUS_BLAST(Type.FIGHTING, 140, 100, 3500),
    FOUL_PLAY(Type.DARK, 70, 50, 2000),
    FUTURESIGHT(Type.PSYCHIC, 120, 100, 2700),
    GIGA_DRAIN(Type.GRASS, 50, 100, 3900),
    GRASS_KNOT(Type.GRASS, 90, 50, 2600),
    GUNK_SHOT(Type.POISON, 130, 100, 3100),
    GYRO_BALL(Type.STEEL, 80, 50, 3300),
    HEART_STAMP(Type.PSYCHIC, 40, 33, 1900),
    HEAT_WAVE(Type.FIRE, 95, 100, 3000),
    HEAVY_SLAM(Type.STEEL, 70, 50, 2100),
    HORN_ATTACK(Type.NORMAL, 40, 33, 1900),
    HURRICANE(Type.FLYING, 110, 100, 2700),
    HYDRO_PUMP(Type.WATER, 130, 100, 3300),
    HYPER_BEAM(Type.NORMAL, 150, 100, 3800),
    HYPER_FANG(Type.NORMAL, 80, 50, 2500),
    ICE_BEAM(Type.ICE, 90, 50, 3300),
    ICE_PUNCH(Type.ICE, 50, 33, 1900),
    ICY_WIND(Type.ICE, 60, 33, 3300),
    IRON_HEAD(Type.STEEL, 60, 50, 1900),
    LEAF_BLADE(Type.GRASS, 70, 33, 2400),
    LOW_SWEEP(Type.FIGHTING, 40, 33, 1900),
    MAGNET_BOMB(Type.STEEL, 70, 33, 2800),
    MEGA_DRAIN(Type.GRASS, 25, 50, 2600),
    MEGAHORN(Type.BUG, 90, 100, 2200),
    MIRROR_COAT(Type.PSYCHIC, 60, 50, 2600),
    MOONBLAST(Type.FAIRY, 130, 100, 3900),
    MUD_BOMB(Type.GROUND, 55, 33, 2300),
    NIGHT_SHADE(Type.GHOST, 60, 50, 2600),
    NIGHT_SLASH(Type.DARK, 50, 33, 2200),
    OMINOUS_WIND(Type.GHOST, 50, 33, 2300),
    OUTRAGE(Type.DRAGON, 110, 50, 3900),
    OVERHEAT(Type.FIRE, 160, 100, 4000),
    PARABOLIC_CHARGE(Type.ELECTRIC, 25, 50, 2800),
    PETAL_BLIZZARD(Type.GRASS, 110, 100, 2600),
    PLAY_ROUGH(Type.FAIRY, 90, 50, 2900),
    POISON_FANG(Type.POISON, 35, 33, 1700),
    POWER_GEM(Type.ROCK, 80, 50, 2900),
    POWER_WHIP(Type.GRASS, 90, 50, 2600),
    PSYBEAM(Type.PSYCHIC, 70, 50, 3200),
    PSYCHIC(Type.PSYCHIC, 100, 100, 2800),
    PSYSHOCK(Type.PSYCHIC, 65, 33, 2700),
    PSYSTRIKE(Type.PSYCHIC, 100, 50, 4400),
    REST(Type.NORMAL, 50, 33, 1900),
    ROCK_BLAST(Type.ROCK, 50, 33, 2100),
    ROCK_SLIDE(Type.ROCK, 80, 50, 2700),
    ROCK_TOMB(Type.ROCK, 70, 50, 3200),
    SAND_TOMB(Type.GROUND, 80, 50, 4000),
    SCALD(Type.WATER, 80, 50, 3700),
    SEED_BOMB(Type.GRASS, 55, 33, 2100),
    SHADOW_BALL(Type.GHOST, 100, 50, 3000),
    SHADOW_PUNCH(Type.GHOST, 40, 33, 1700),
    SHADOW_SNEAK(Type.GHOST, 50, 33, 2900),
    SIGNAL_BEAM(Type.BUG, 75, 50, 2900),
    SILVER_WIND(Type.BUG, 70, 33, 3700),
    SKY_ATTACK(Type.FLYING, 70, 50, 2000),
    SLUDGE(Type.POISON, 50, 33, 2100),
    SLUDGE_BOMB(Type.POISON, 80, 50, 2300),
    SLUDGE_WAVE(Type.POISON, 110, 100, 3200),
    SOLAR_BEAM(Type.GRASS, 180, 100, 4900),
    STOMP(Type.NORMAL, 55, 50, 1700),
    STONE_EDGE(Type.ROCK, 100, 100, 2300),
    STRUGGLE(Type.NORMAL, 35, 33, 2200),
    SUBMISSION(Type.FIGHTING, 60, 50, 2200),
    SWIFT(Type.NORMAL, 60, 50, 2800),
    THUNDER(Type.ELECTRIC, 100, 100, 2400),
    THUNDER_PUNCH(Type.ELECTRIC, 45, 33, 1800),
    THUNDERBOLT(Type.ELECTRIC, 80, 50, 2500),
    TWISTER(Type.DRAGON, 45, 33, 2800),
    VICE_GRIP(Type.NORMAL, 35, 33, 1900),
    WATER_PULSE(Type.WATER, 70, 50, 3200),
    WILD_CHARGE(Type.ELECTRIC, 90, 50, 2600),
    WRAP(Type.NORMAL, 60, 33, 2900),
    X_SCISSOR(Type.BUG, 45, 33, 1600),
    ZAP_CANNON(Type.ELECTRIC, 140, 100, 3700);

    private static final int CHARGE_ACTION_DURATION = 500;

    private final Type type;
    private final int power;
    private final int energy;
    private final double cooldown;

    ChargeMove(Type type, int power, int energy, int cooldown) {
        this.type = type;
        this.power = power;
        this.energy = energy;
        this.cooldown = (CHARGE_ACTION_DURATION + cooldown) / 1000.0;
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public int getPower() {
        return power;
    }

    public int getEnergyCost() {
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

    public static ChargeMove fromString(String string) {
        for (ChargeMove move : ChargeMove.values()) {
            if (move.toString().equals(string)) {
                return move;
            }
        }
        throw new EnumConstantNotPresentException(ChargeMove.class, string);
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
