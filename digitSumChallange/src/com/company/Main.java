package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("The answer is " + reverse(83));

    }
//    public static int sumDigits(int num){
////        int one = num /100;
////        int two = num % 100 /10;
////        int three = num %100%10;
////        int sum = one+two+three;
////        if(num > 9){
////            return sum;
////        }
////        return -1;
//
//        if(num <10){
//            return -1;
//        }
//        int sum = 0;
//        while(num >0){
//            int digit = num %10;
//            System.out.println(digit);
//            sum += digit;
//            num /= 10;
//        }
//        return sum;
//    }
//    public static boolean isPlaindrome(int number){
//        int reverse = 0;
//        int newNumber = Math.abs(number);
//        System.out.println(newNumber);
//        while(newNumber>=1){
//            int lastNumber = newNumber%10;
//            System.out.println(lastNumber);
//            reverse = (reverse*10)+lastNumber;
//            newNumber /=10;
//        }
//        return (reverse == Math.abs(number));
//    }
//    public static int sumFirstAndLastDigit(int number){
//        for(int i = 0; i<number.length; i++){
//            if(number > 0){
//                return (number[0]+number[number.length-1]);
//            }
//            return false;
//        }
//    }
//    public static int getGreatestCommonDivisor(int first, int second){
//        if((first > 0 && second > 0)){
//            int highest = 0;
//            for(int i = 1; i <= second; i++){
//                if(first % i == 0 && second % i ==0){
//                    highest = i;
//                }
//            }
//            return highest;
//        }
//        return -1;
//
//    }
    public static int reverse(int number){
        int newNumber = 0;
        int digit = number;
        while(number>1){
            int = digit%10;
            newNumber = (newNumber*10)+digit;
        }
        return newNumber;
    }


//    public static void numberToWords(int number){
//        if(number <0){
//            System.out.println("Invalid Value");
//        }
//        int digit = number%10;
//        while(digit < 0) {
//            switch (digit) {
//                case 0:
//                    System.out.println("Zero");
//                    break;
//                case 1:
//                    System.out.println("One");
//                    break;
//                case 2:
//                    System.out.println("Two");
//                    break;
//                case 3:
//                    System.out.println("Three");
//                    break;
//                case 4:
//                    System.out.println("Four");
//                    break;
//                case 5:
//                    System.out.println("Five");
//                    break;
//                case 6:
//                    System.out.println("Six");
//                    break;
//                case 7:
//                    System.out.println("Seven");
//                    break;
//                case 8:
//                    System.out.println("Eight");
//                    break;
//                case 9:
//                    System.out.println("Nine");
//                    break;
//            }
//        }
//
//    }
}
