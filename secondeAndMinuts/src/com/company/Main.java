package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(365));
    }
    public static String getDurationString(int min, int sec){
        if (min< 0 || (sec<0 || sec>59)){
            return "invalid duration";
        }
        int hours = (min/60);
        int minutes = (min %60);
        return hours + "h " + minutes + "m " + sec +"s " ;
    }
    public static String getDurationString(int seconds) {
        if (seconds <0 ){
            return "invalid Value";
        }
        int sec = (seconds % 60);
        int min = (seconds/60);
        return getDurationString(min, sec);
    }
}
