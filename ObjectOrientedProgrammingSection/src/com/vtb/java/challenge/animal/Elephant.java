package com.vtb.java.challenge.animal;

public class Elephant extends Animal {

    private static int counter;

    public Elephant(String name, int maxRunDistance, int maxSwimDistance) {
        super(name, maxRunDistance, maxSwimDistance);
        counter++;
    }

    public static int getCounter() {
        return counter;
    }
}
