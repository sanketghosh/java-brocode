package com.inheritancejava;

public class InheritanceInJava {
    public static void main(String[] args) {

        //INHERITANCE - This is the process where one class acquires
        //              the attributes of an another class


        System.out.println("Car: ");

        Car car = new Car();

        car.go();
        car.stop();

        System.out.println(car.doors);
        System.out.println(car.wheels);
        System.out.println(car.speed);

        car.isExpensive();


        System.out.println("Bicycle: ");

        Bicycle bicycle = new Bicycle();

        bicycle.go();
        bicycle.stop();

        System.out.println(bicycle.pedals);
        System.out.println(bicycle.wheels);
        System.out.println(bicycle.speed);

        bicycle.isExpensive();

    }
}
