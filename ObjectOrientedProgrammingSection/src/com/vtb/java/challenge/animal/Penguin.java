package com.vtb.java.challenge.animal;

public class Penguin extends Animal {

    private static int counter;

    public Penguin(String name, int maxRunDistance, int maxSwimDistance) {
        super(name, maxRunDistance, maxSwimDistance);
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

}
