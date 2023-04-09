package com.interfacesinjava;

public class Fish implements Prey,Predator {
    @Override
    public void flee(){
        System.out.println("The small fish flees");
    }

    @Override
    public void hunt(){
        System.out.println("The big fish hunts");
    }
}
