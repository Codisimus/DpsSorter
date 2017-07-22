package com.codisimus.dpssorter;

public class Pokemon {
    private static final double STAB_MULTIPLIER = 1.2;

    private String name;
    private Species species;
    private int cp;
    private double level;
    private int attackIv;
    private QuickMove quickMove;
    private ChargeMove chargeMove;

    public Pokemon(Species species, int cp, double level, int attackIv, QuickMove quickMove, ChargeMove chargeMove) {
        name = species + " (" + cp + ")";
        this.species = species;
        this.cp = cp;
        this.level = level;
        this.attackIv = attackIv;
        this.quickMove = quickMove;
        this.chargeMove = chargeMove;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public double getLevel() {
        return level;
    }

    public void setLevel(double level) {
        this.level = level;
    }

    public int getAttackIv() {
        return attackIv;
    }

    public void setAttackIv(int attackIv) {
        this.attackIv = attackIv;
    }

    public QuickMove getQuickMove() {
        return quickMove;
    }

    public void setQuickMove(QuickMove quickMove) {
        this.quickMove = quickMove;
    }

    public ChargeMove getChargeMove() {
        return chargeMove;
    }

    public void setChargeMove(ChargeMove chargeMove) {
        this.chargeMove = chargeMove;
    }

    public double getCpM() {
        return PoGoUtil.getCpm(level);
    }

    public double getAttack() {
        return (species.getBaseAtk() + attackIv) * getCpM();
    }

    public double getDpsAgainst(Species species) {
        double dps;
        if (isChargeMoveUseless(species)) {
            dps = getMoveDps(quickMove);
        } else {
            double quickMoveCount = chargeMove.getEnergyCost() / quickMove.getEnergy();
            double quickMovePower = getMovePowerAgainst(quickMove, species);
            double chargeMovePower = getMovePowerAgainst(chargeMove, species);
            double power = quickMovePower * quickMoveCount + chargeMovePower;
            double time = quickMove.getCooldown() * quickMoveCount + chargeMove.getCooldown();
            dps = power / time;
        }
        dps *= getAttack();
        dps /= 2;
        return dps;
    }

    public boolean isChargeMoveUseless(Species species) {
        return getMoveDpsAgainst(quickMove, species)
                >= getMoveDpsAgainst(chargeMove, species);
    }

    public double getMoveDpsAgainst(Move move, Species species) {
        return getMovePowerAgainst(move, species) / move.getCooldown();
    }

    public double getMovePowerAgainst(Move move, Species species) {
        return getMovePower(move) * move.getType().getEffectivenes(species);
    }

    public double getMoveDps(Move move) {
        return getMovePower(move) / move.getCooldown();
    }

    public double getMovePower(Move move) {
        double power = move.getPower();
        if (species.isType(move.getType())) {
            power *= STAB_MULTIPLIER;
        }
        return power;
    }
}
