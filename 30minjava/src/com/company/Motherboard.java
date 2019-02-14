package com.company;

public class Motherboard {

    private String model;
    private String manufacuter;
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public Motherboard(String model, String manufacuter, int ramSlots, int cardSlots, String bios) {
        this.model = model;
        this.manufacuter = manufacuter;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public void loadProgram(String programName){
        System.out.println("program " + programName + " is loading" );
    }

    public String getModel() {
        return model;
    }

    public String getManufacuter() {
        return manufacuter;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBios() {
        return bios;
    }
}
