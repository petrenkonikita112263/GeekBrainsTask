package com.vtb.java.challenge.animal;

public class HomeCat extends Cat {

    private static int counter;

    public HomeCat(String name, int maxRunDistance) {
        super(name, maxRunDistance, 0);
        counter++;
    }

    public static int getCounter() {
        return counter;
    }
}
