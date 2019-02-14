package com.company;

public class Main {

    public static void main(String[] args) {
//        int count = 1;
//        while(count!=6) {
//            System.out.println("count is " + count);
//            count++;
//        }
//        for(count =1; count<6; count++){
//            System.out.println("Now count is " + count);
//        }
//        count =1;
//        do{
//            System.out.println("do count is " + count);
//            count++;
//        } while(count !=6);
        int start = 4;
        int end = 20;
        int even = 0;
        while(start <= end){
            start++;
            if(even < 5) {
                if (!isEven(start)) {
                    continue;
                }
                even++;
                System.out.println("Is " + start + " and even number? " + isEven(start));
            }
        }
        System.out.println(even);

    }
    public static boolean isEven(int num){
        return (num%2 == 0);
    }
}
