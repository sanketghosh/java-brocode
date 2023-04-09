package com.oopsbasics;

public class AllAboutOops {
    public static void main(String[] args) {

        Car myCar1 = new Car();
        Car myCar2 = new Car();

        System.out.println(myCar1.make);
        System.out.println(myCar1.color);


        System.out.println(myCar2.make);
        System.out.println(myCar2.color);

        myCar1.drive();
        myCar1.brake();


        myCar2.drive();
        myCar2.brake();
    }
}
