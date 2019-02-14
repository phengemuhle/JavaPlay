package com.company;

public class Main {

    public static void main(String[] args) {

        //smallest amount of memeory, width of 8
        //have to cast (byte) to use expressions
        byte myMinByteValue = -127;
        byte myMaxByteValue = 127;
        byte byteTotal = (byte) (myMaxByteValue / 2);
        System.out.println("my byte Value = " + byteTotal);

        //medium amount of memeory, width of 16
        //have to cast (short) for expressions
        short myMinShortValue = -32767;
        short myMaxShortValue = 32767;
        short shortTotal = (short) (myMaxShortValue-3000);
        System.out.println("my short Value = " + shortTotal);

        //next largest amount of memeory, width of 32
        // no need to cast
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int intTotal = myMaxValue -343232323;
        System.out.println("my int Value = " + intTotal);

        //nonWhole numbers amount of memeory, width of 64
        long myMinLongValue = -9_223_372_036_854_775_808L;
        long myMaxLongValue = 9-223_372-036-854-775-807L;
        long longTotal = intTotal * shortTotal*byteTotal;
        System.out.println("my Long Value = " + longTotal);



    }
}
