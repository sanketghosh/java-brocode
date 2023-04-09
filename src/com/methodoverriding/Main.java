package com.methodoverriding;

public class Main {
    public static void main(String[] args) {

        //METHOD OVERRIDING - Declaring a method in sub class
        //     which is already present in parent class.
        //     done so that a child class can give its own implementation

        Dog dog = new Dog();
        dog.speaks();

        Animal animal = new Animal();
        animal.speaks();

    }
}
