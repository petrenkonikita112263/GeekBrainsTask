package com.vtb.java.challenge.animal;

public abstract class Animal {

    protected String name;
    protected int maxRunDistance;
    protected int maxSwimDistance;
    protected static int counter;

    public Animal(String name, int maxRunDistance, int maxSwimDistance) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        counter++;
    }

    public void swim(int distance) {
        if (maxSwimDistance == 0) {
            System.out.println(name + " can't swim");
            return;
        }
        if (distance <= maxSwimDistance) {
            System.out.println(name + " has swum - " + distance + " this distance");
        } else {
            System.out.println(name + " the max distance that the animal can cross - " + maxSwimDistance
                    + " has swum - " + (distance - maxSwimDistance) + " the distance");
        }
    }

    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(name + " has run - " + distance + " this distance");
        } else {
            System.out.println(name + " the max distance the that animal can cross - " + maxRunDistance
                    + " has run - " + (distance - maxRunDistance) + " the distance");
        }
    }

    public static int getCounter() {
        return counter;
    }
}
