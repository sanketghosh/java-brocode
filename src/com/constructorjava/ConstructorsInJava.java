package com.constructorjava;

public class ConstructorsInJava {
    public static void main(String[] args) {

        // constructor - special method that is called when an object is initialized (created)

        Human human = new Human("Bob", 30, 78.8);
        Human human2 = new Human("Jax", 29, 58);

        System.out.println(human.name);
        System.out.println(human2.age);
        System.out.println(human.weight);

        human.eat();
        human2.drink();
    }
}


