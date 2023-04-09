package com.encapsulationinjava;

public class Main {
    public static void main(String[] args) {
//        encapsulation -attributes of a class will be hidden or private, can be accessed only through methods (getters and
        //       setters) you should make attributes private if you don't have a reason to make them public/protected

        Car car = new Car("Mercedes", "G-Wagon", 2022);

        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());

        car.setYear(2023);
        System.out.println("Car year after setting it " + car.getYear());


    }
}
