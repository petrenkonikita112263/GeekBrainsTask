package com.vtb.java.challenge.animal;

public class Dolphin extends Animal {

    private static int counter;

    public Dolphin(String name, int maxRunDistance, int maxSwimDistance) {
        super(name, maxRunDistance, maxSwimDistance);
        counter++;
    }

    public static int getCounter() {
        return counter;
    }
}
