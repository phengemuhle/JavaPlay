package com.company;

public class Main {

    public static void main(String[] args) {
        Dimentions dimentions = new Dimentions(20,20,5);
	    Case theCase = new Case("2208","Dell", "240", dimentions);

	    Monitor theMonitor = new Monitor("27 inch beast", "acer", 27, new Resolution(2540, 1440));

	    Motherboard theMotherBoard = new Motherboard("83-200", "Asus", 4, 6, "v2");

	    PC thePC = new PC(theCase, theMonitor, theMotherBoard);
	    thePC.powerUp();
    }
}
