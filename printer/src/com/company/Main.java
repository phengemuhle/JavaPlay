package com.company;

public class Main {

    public static void main(String[] args) {
	    Printer printer = new Printer(50,30, true );
        System.out.println(printer.printPage(30, true) + " and "+ printer.getTonerLevel());
    }
}
