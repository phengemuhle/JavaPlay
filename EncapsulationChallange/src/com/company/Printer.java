package com.company;

public class Printer {
    private int tonerLevel = 100;
    private int pagesPrinted = 0;
    private boolean duplex;

    public Printer(double pagesPrinted, boolean duplex) {
        if(duplex){
        this.pagesPrinted += (pagesPrinted/2)+ (pagesPrinted%2);
        this.tonerLevel -= pagesPrinted;
        }else{
            this.pagesPrinted += (pagesPrinted);
            this.tonerLevel -= pagesPrinted;
        }

        this.duplex = duplex;
    }

    public void FillToner (int fillAmount){
        if( this.tonerLevel + fillAmount >=100){
            System.out.println("You filled the toner and have "+((this.tonerLevel + fillAmount)-100) + "% left unused");
            this.tonerLevel = 100;
        }else {
            this.tonerLevel += fillAmount;
            System.out.println("You filled the toner and have "+(this.tonerLevel) + "% of toner avaiable");

        }}

    public String getTonerLevel() {
        if(tonerLevel>0) {
            return ("You have " + tonerLevel + "% of toner left");
        }
        return ("Your printer is empty");
    }

    public double getPagesPrinted() {
        return pagesPrinted;
    }

}
