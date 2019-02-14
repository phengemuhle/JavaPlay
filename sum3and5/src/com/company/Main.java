package com.company;

public class Main {

    public static void main(String[] args) {
//        System.out.println(sumNum(1, 1000));
        int count = 0;
        int sum = 0;
        for(int i = 1; i<=1000; i++){
            if((i % 3 == 0) && (i % 5 == 0)) {
                count++;
                sum += i;
                System.out.println(count);
                System.out.println("The number is " + i);
            }
            if(count == 5){
                break;
            }
        }
        System.out.println("The sum is " + sum);
    }

//        public static int sumNum(int start, int end){
//            int count = 0;
//            int sum = 0;
//            for(int i = start; i<=end; i++){
//                if(count <=5){
//
//                    if((i % 3 == 0) && (i % 5 == 0)) {
//                        count++;
//                        sum += i;
//                        System.out.println(count);
//                        System.out.println("The number is " + i);
//                    }
//                }else{break;}
//            }
//            return sum;
//        }

}
