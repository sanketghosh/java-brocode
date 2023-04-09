package com.superkeyword;

public class Person {

    String name;
    int age;

    Person(String name, int age){

        this.name=name;
        this.age=age;
    }

    public String toString(){
        return "Superhero name is "+this.name+" his age is "+this.age;
    }
}
