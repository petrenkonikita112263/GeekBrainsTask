package com.vtb.java.challenge.animal;

public abstract class Cat extends Animal {

    public static int count;

    public Cat(String name, int maxRunDistance, int maxSwimDistance) {
        super(name, maxRunDistance, maxSwimDistance);
        count++;
    }
}
