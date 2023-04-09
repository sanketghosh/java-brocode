package com.variablescopejava;

import java.util.Random;

public class Diceroller {

    // GLOBAL
    // Random random;
    // int number;

    Diceroller(){
        Random random = new Random(); //LOCAL
        int number = 0;  //LOCAL
        roll( random,number);
    }

    void roll(Random random, int number){
        number = random.nextInt(6)+1;
        System.out.println(number);
    }
}
