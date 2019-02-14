package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        while (count <= 10) {
            System.out.println("Please enter number #" + count + ":  ");
            boolean hasNextItn = scanner.hasNextInt();
            if (hasNextItn) {
               int number = scanner.nextInt();
               count++;
               sum += number;
            } else {
                System.out.println("try again");
            }
            scanner.nextLine();
        }
        System.out.println(sum);
        scanner.close();
    }
}