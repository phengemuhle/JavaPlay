package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(calculateInterest(10000.00, 2.0));

        for(int i = 1; i < 9; i++){
            System.out.println("the interest is " + String.format("%.2f", calculateInterest(10000.00, i)));
        }
        System.out.println("***********************");
        for(int i = 8; i > 1; i--){
            System.out.println("the interest is " + String.format("%.2f", calculateInterest(10000.00, i)));
        }
        System.out.println("***********************");

        System.out.println(kindaPrime(2, 10000));
    }

    public static int kindaPrime(int start, int end){
        int count =0;

        for( int i = start; i < end+1; i++){
            if(isPrime(i)){
                count++;
                System.out.println("Number "+i+" is a prime number");
                if(count == 30){
                    System.out.println("exit");
                    break;
                }
            }

        }
        return -1;
    }



    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        for(int i = 2; i <= n/2; i++){
            if(n % i ==0){
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interest){
        return (amount *(interest/100));
    }
}
