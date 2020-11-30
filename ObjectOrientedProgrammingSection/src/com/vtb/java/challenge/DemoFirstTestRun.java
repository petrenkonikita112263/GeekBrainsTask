package com.vtb.java.challenge;

import com.vtb.java.challenge.animal.*;

import java.util.Arrays;

public class DemoFirstTestRun {

    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("Doggy", 500, 200),
                new Dog("Spiky", 500, 200),
                new HomeCat("Kitty", 10),
                new WildCat("Tiger", 730, 5),
                new Elephant("Dumbo", 5, 0),
                new Penguin("Skipper", 8, 500),
                new Penguin("Rikko", 8, 500),
                new Dolphin("Glories", 0, 950),
        };
        Arrays.stream(animals).forEach(animal -> {
            animal.run(560);
            animal.swim(230);
        });

        System.out.println("\nThere are " + Animal.getCounter() + " animals.\nYou have: \n\t " + Dog.getCounter() + " dogs"
                + "\n\t " + "there're " + Cat.count + " cats: " + HomeCat.getCounter() + " home cats and " + WildCat.getCounter() + " wild cats"
        +"\n\t " + Elephant.getCounter() + " elephants" + "\n\t " + Penguin.getCounter() + " penguins"
        + "\n\t " + Dolphin.getCounter() + " dolphins");


    }
}
