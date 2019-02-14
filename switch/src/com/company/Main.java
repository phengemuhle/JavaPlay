package com.company;

public class Main {

    public static void main(String[] args) {
        int year = 2090;
        int month = 2;

        isLeapYear(year);
        System.out.println(getDaysInMonth(month, year));
    }
        public static boolean isLeapYear(int year){
            if(year<1 || year>9999){
                return false;
            }else if((year%4 == 0) && (year%100 !=0)){
                return true;
            }else if(year%400 == 0 ){
                return true;
            }else{
                return false;
            }
        }
        // boolean answer = isLeapYear(year)

        public static int getDaysInMonth(int month, int year){
            if((month < 1 || month > 12) || (year < 1 || year > 9999)){
                return -1;
            }else if((isLeapYear(year)== true) && (month == 2) ){
                return 29;
            }else {
                switch(month){
                    case 1:
                        return 31;
                    case 2:
                        return 28;
                    case 3:
                        return 31;
                    case 4:
                        return 30;
                    case 5:
                        return 31;
                    case 6:
                        return 30;
                    case 7:
                        return 31;
                    case 8:
                        return 31;
                    case 9:
                        return 30;
                    case 10:
                        return 31;
                    case 11:
                        return 30;
                    case 12:
                        return 31;
                }

            }

    return -1;
    }}

//        int value = 2;
//        if(value == 1 ){
//            System.out.println("value was 1");
//        }else if(value == 2){
//            System.out.println("value was 2");
//        }else{
//            System.out.println("was not 1 or 2");
//        }

//        int day =22;
//
//        switch(day) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wed");
//                break;
//            case 4:
//                System.out.println("Thurs");
//                break;
//            case 5:
//                System.out.println("Fri");
//                break;
//            case 6:
//                System.out.println("Sat");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("don't be silly that's not a day");
//                break;
//        }


//        char switchValue = 'x';
//
//        switch (switchValue){
//            case 'a':
//                System.out.println("was an a");
//                break;
//            case 'b':
//                System.out.println("was an b");
//                break;
//            case 'c':
//                System.out.println("was an c");
//                break;
//            case 'd':
//                System.out.println("was an d");
//                break;
//            default:
//                System.out.println("was none of the above, it was an " + switchValue);
//
//        }
//
//        String theValue = "da Fuck";
//
//        switch(theValue.toLowerCase()) {
//            case "da fuck":
//                System.out.println("works");
//                break;
//            default:
//                System.out.println("no works works");
//                break;
//        }

//    }
//}
