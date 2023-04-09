package com.accessmodifiers.packageone;
import com.accessmodifiers.packagetwo.*;


public class ClassA {
    public static void main(String[] args) {

        ClassC class_c = new ClassC();
       // System.out.println(class_c.defaultMessage);// not possible to access
        System.out.println(class_c.publicMessage); // accessible as its public

    }

}
