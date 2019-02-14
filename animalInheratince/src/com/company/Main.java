package com.company;


public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("animal", 1,1,5,5);

        Dog dog = new Dog("panzer", 9,46,2,4,1,700,"perfect");
        dog.eat();
        dog.run();
    }
}
