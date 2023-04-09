package com.superkeyword;

public class SuperKeywordJava {
    public static void main(String[] args) {

        // super - keyword refers to the superclass (parent) of an object
        // very similar to the "this" keyword

        Hero hero = new Hero("Batman", 42, "Rich$$$");
        System.out.println(hero.name);
        System.out.println(hero.age);
        System.out.println(hero.power);


        Hero hero2 = new Hero("Batman", 42, "Rich$$$");
        System.out.println(hero2.toString());


    }
}
