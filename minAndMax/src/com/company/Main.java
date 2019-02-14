package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max =0;
        boolean first = true;

        while(true) {
            System.out.println("Enter number :  ");
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt){
                int number = scanner.nextInt();
                if (first) {
                    min = number;
                    max = number;
                    first = false;
                }
                if (number > max){
                    max = number;
                }else if(number < min){
                    min = number;
                }

            }else {
                break;
            }

            scanner.nextLine();
        }

        System.out.println("Min and Max numbers were " +min + " and " + max);
        scanner.close();
    }
}
