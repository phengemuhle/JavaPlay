package com.company;

import java.util.SortedMap;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer(40, false);
        System.out.println(printer.getPagesPrinted() + " and " + printer.getTonerLevel());
        printer.FillToner(94);
        System.out.println(printer.getTonerLevel());
    }
}
