package com.company;

public class Case {

    private String model;
    private String manufactuer;
    private String powerSupply;
    private Dimentions dimentions;

    public Case(String model, String manufactuer, String powerSupply, Dimentions dimentions) {
        this.model = model;
        this.manufactuer = manufactuer;
        this.powerSupply = powerSupply;
        this.dimentions = dimentions;
    }

    public void pressPowerButton (){
        System.out.println("Power button pressed");
    }

    public String getModel() {
        return model;
    }

    public String getManufactuer() {
        return manufactuer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimentions getDimentions() {
        return dimentions;
    }
}
