package com.vtb.java.arraylist.bonus;

public abstract class Fruit {

    private String fruitName;
    private double fruitWeight;

    public Fruit(String fruitName, double fruitWeight) {
        this.fruitName = fruitName;
        this.fruitWeight = fruitWeight;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public double getFruitWeight() {
        return fruitWeight;
    }

    public void setFruitWeight(double fruitWeight) {
        this.fruitWeight = fruitWeight;
    }
}
