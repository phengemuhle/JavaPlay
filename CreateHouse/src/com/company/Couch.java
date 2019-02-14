package com.company;

public class Couch {
    public int numberOfSeats;
    public String material;
    public boolean reclines;

    public Couch(int numberOfSeats, String material, boolean reclines) {
        this.numberOfSeats = numberOfSeats;
        this.material = material;
        this.reclines = reclines;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getMaterial() {
        return material;
    }

    public boolean isReclines() {
        return reclines;
    }
}
