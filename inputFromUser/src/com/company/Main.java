package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your birth year : ");

        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt) {
            int yearOfBirth = scanner.nextInt();


            scanner.nextLine();//important, handles the use of the enter key

            System.out.println("Enter name : ");
            String name = scanner.nextLine();

            int age = (2018 - yearOfBirth);

            if (age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + " and you are " + age + " years old");
            } else {
                System.out.println("you are lying");
            }
        }else {
            System.out.println("you are lying");
        }

        scanner.close();
    }
}
