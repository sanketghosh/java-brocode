package com.statickeywordjava;

public class StaticKeyword {
    public static void main(String[] args) {
        //static - modifier, a single copy of a variable/method is created and shared.
        // The class "owns" the static member

        System.out.println(Friend.numberOfFriends); //can access through class cause it's static keyword

        Friend friend1 = new Friend("John");
        System.out.println(Friend.numberOfFriends);

        Friend friend2 = new Friend("Max");
        System.out.println(Friend.numberOfFriends);

        Friend friend3 = new Friend("Bob");
        Friend friend4 = new Friend("Martyn");
        Friend friend5 = new Friend("Brad");


        Friend.sayHelloToFriends();

    }
}
