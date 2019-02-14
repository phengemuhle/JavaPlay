package com.company;

public class Main {

    public static void main(String[] args) {
        // width is 32 (4 bytes) none
	    int myIntValue  = 5;
	    //width of 32 (4 bytes) 7 digits
	    float myFloatValue = 5f;
	    //width of 64 (8 bytes) 16 digits
	    double myDoubleValue = 5d;
        System.out.println("my int =" + myIntValue /3);
        System.out.println("my float =" + myFloatValue/3);
        System.out.println("my double =" + myDoubleValue/3);

        double pounds = 200d;
        double kilos = 0.45359237d * pounds;
        System.out.println("You get "+ (kilos) + " kilograms for the pounds specified");
    }
}
