package com.vtb.java.challenge.animal;

public class Dog extends Animal {

    private static int counter;

    public Dog(String name, int maxRunDistance, int maxSwimDistance) {
        super(name, maxRunDistance, maxSwimDistance);
        counter++;
    }

    public static int getCounter() {
        return counter;
    }
}
