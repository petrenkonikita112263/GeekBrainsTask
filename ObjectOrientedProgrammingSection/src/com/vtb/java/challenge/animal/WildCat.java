package com.vtb.java.challenge.animal;

import com.vtb.java.challenge.animal.Cat;

public class WildCat extends Cat {

    private static int counter;

    public WildCat(String name, int maxRunDistance, int maxSwimDistance) {
        super(name, maxRunDistance, maxSwimDistance);
        counter++;
    }

    public static int getCounter() {
        return counter;
    }
}
