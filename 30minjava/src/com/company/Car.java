package com.company;

    public class Car extends vehicle{
        private int doors;
        private int engineCapasity;

        private Car(String name, int doors, int engineCapasity){
            super(name);
            this.doors = doors;
            this.engineCapasity = engineCapasity;


        }
    }
