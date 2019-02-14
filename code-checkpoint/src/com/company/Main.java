package com.company;

public class Main {
    public static void main(String[] args) {
//        int newScore = calculatescore("tim", 500);
//        System.out.println("new score is " + newScore);
//        calculatescore(75);

        int total = 100;

        calcFeetAndInchesToCentemeters(total);

    }
    public static double calcFeetAndInchesToCentemeters(double feet, double inches) {
       if(feet >= 0  && (inches >=0 && inches < 12)){
           System.out.println("You get " +  ((feet*12 + inches) * 2.54) + " centemeters from this length");
           return 0;
       }
        System.out.println("Invalid paramater");
       return -1;
    }
    public static double calcFeetAndInchesToCentemeters(int total) {
        if(total >=0 ){
           double feet = (total / 12);
           double inches = (total%12);
           return calcFeetAndInchesToCentemeters(feet, inches);
        }
        System.out.println("Invalid Paramater");
        return -1;
    }


    public static int calculatescore(int score) {
        System.out.println("Unnamed Player scorred " + score + " points ");
        return score *1000;
    }
}

