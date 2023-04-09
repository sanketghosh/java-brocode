package com.methodoverriding;

public class Dog extends Animal {

    @Override
    void speaks(){
        System.out.println("The dog goes *barks* ");
    }
}
