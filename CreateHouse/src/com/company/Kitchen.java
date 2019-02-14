package com.company;

public class Kitchen {
    public boolean fullKitchen;
    public boolean hasTable;
    public int sqftCounter;

    public Kitchen(boolean fullKitchen, boolean hasTable, int sqftCounter) {
        this.fullKitchen = fullKitchen;
        this.hasTable = hasTable;
        this.sqftCounter = sqftCounter;
    }

    public void building(){
        System.out.println("I am putting the kitchen together");
    }

    public boolean isFullKitchen() {
        return fullKitchen;
    }

    public boolean isHasTable() {
        return hasTable;
    }

    public int getSqftCounter() {
        return sqftCounter;
    }
}
