package com.accessmodifiers.packagetwo;
import com.accessmodifiers.packageone.ClassA;

public class SubclassA extends ClassA {

    public static void main(String[] args) {
        ClassC class_c = new ClassC(); // not possible to access
        System.out.println(class_c.defaultMessage);

    }


}
