package com.company;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDuplexPrinter;

    public void addToner(int addTonerLevel) {
        if(tonerLevel < 100 && tonerLevel + addTonerLevel <= 100 ) {
            tonerLevel = tonerLevel + addTonerLevel;
            System.out.println("the toner level is now at " + tonerLevel);
        }else if(tonerLevel < 100 && tonerLevel + addTonerLevel > 100 ){
            tonerLevel = 100;
            System.out.println("the toner level is now at "+ tonerLevel + " and you have " + ((tonerLevel + addTonerLevel)-100) +" toner left");
        }else{
            System.out.println("Your toner is full");
        }
    }

    public void printPage(int pagesToPrint, boolean isDuplexPrinter){
       if(isDuplexPrinter){
           pagesPrinted += pagesToPrint/2;
       }else{
           pagesPrinted += pagesToPrint;
       }
    }

    public Printer(int tonerLevel, boolean isDuplexPrinter) {
        if(tonerLevel > -1 && tonerLevel <= 100 ) {
            this.tonerLevel = tonerLevel;

        }else {this.tonerLevel = -1;}

        this.isDuplexPrinter = isDuplexPrinter;
        this.pagesPrinted = 0;
    }
    public void addToner(int addTonerLevel) {
        if(tonerLevel < 100 && tonerLevel + addTonerLevel <= 100 ) {
            tonerLevel = tonerLevel + addTonerLevel;
            System.out.println("the toner level is now at " + tonerLevel);
        }else if(tonerLevel < 100 && tonerLevel + addTonerLevel > 100 ){
            tonerLevel = 100;
            System.out.println("the toner level is now at "+ tonerLevel + " and you have " + ((tonerLevel + addTonerLevel)-100) +" toner left");
        }else{
            System.out.println("Your toner is full");
        }
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplexPrinter() {
        return isDuplexPrinter;
    }
}
