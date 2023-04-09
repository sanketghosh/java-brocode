package com.abstractclass;
public class Main {
    public static void main(String[] args) {
        // abstract - abstract classes cannot be instantiated, but they can have a subclass
        //             abstract methods are declared without an implementation

        // Vehicle vehicle = new Vehicle(); //--> cannot create class due to abstraction
        Car car = new Car();
        car.go();

    }
}
