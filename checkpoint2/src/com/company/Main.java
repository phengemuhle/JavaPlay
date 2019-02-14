package com.company;

public class Main {


    public static void main(String[] args) {
       printEqual(-1,2,3);
    }

    public static void printEqual(int x, int y, int z){
        if(x < 0 || y < 0 || z < 0 ){
            System.out.println("Invalid Value");
            System.exit(0);
        }else if(x != y && y != z){
            System.out.println("All numbers are different");
            System.exit(0);
        }else if(x == y && y == z){
            System.out.println("All numbers are equal");
            System.exit(0);
        }
        System.out.println("Neither all are equal or different");

    }

    }



