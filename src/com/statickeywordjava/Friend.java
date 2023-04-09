package com.statickeywordjava;

public class Friend {

    String friend;
    static int numberOfFriends;

    Friend(String friend) {
        this.friend = friend;
        numberOfFriends++;
    }

    static void sayHelloToFriends() {
        System.out.println("Say hello to your " + numberOfFriends + " friends");
    }
}
