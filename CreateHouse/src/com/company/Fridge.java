package com.company;

public class Fridge {
    public boolean isFull;
    public boolean hasFreezer;

    public Fridge(boolean isFull, boolean hasFreezer) {
        this.isFull = isFull;
        this.hasFreezer = hasFreezer;
    }

    public boolean isFull() {
        return isFull;
    }

    public boolean isHasFreezer() {
        return hasFreezer;
    }
}
