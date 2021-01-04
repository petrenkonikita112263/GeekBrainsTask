package com.vtb.java.arraylist.bonus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Box<T extends Fruit> {

    private List<T> fruitBox;

    public Box() {
        fruitBox = new ArrayList<>();
    }

    public Box(T... fruitArray) {
        this();
        Collections.addAll(fruitBox, fruitArray);
    }

    public double getBoxWeight() {
        if (fruitBox.isEmpty()) {
            return 0.0;
        }
        return fruitBox.size() * fruitBox.get(0).getFruitWeight();
    }

    public boolean compareBoxes(Box<? extends Fruit> box) {
        return Math.abs(box.getBoxWeight() - getBoxWeight()) < 0.0001;
    }

    public void putFruitToBox(Box<T> box) {
        if (this == box) {
            return;
        }
        for (int i = fruitBox.size() - 1; i >= 0; i--) {
            box.addFruit(fruitBox.remove(i));
        }
    }

    public boolean addFruit(T fruit) {
        return fruitBox.add(fruit);
    }

}
