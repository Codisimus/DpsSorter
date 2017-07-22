package com.codisimus.dpssorter;

public interface Move {
    public Type getType();
    public int getPower();
    public double getCooldown();
    public double getDps();
}
