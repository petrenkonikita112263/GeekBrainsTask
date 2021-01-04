package com.vtb.java.arraylist.bonus;

public class Task3 {
    public static void main(String[] args) {
        Box<Apple> emptyAppleBox = new Box<>();
        Box<Apple> appleBox = new Box<>(new Apple("Golden Apple"),
                new Apple("Champion Apple"), new Apple("Zimovka Apple"));
        Box<Orange> emptyOrangeBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        for (int i = 0; i < 5; i++) {
            orangeBox.addFruit(new Orange());
        }

//        check the weight of each boxes
        System.out.println("The weight of firstBox = " + emptyAppleBox.getBoxWeight());
        System.out.println("The weight of secondBox = " + appleBox.getBoxWeight());
        System.out.println("The weight of thirdBox = " + emptyOrangeBox.getBoxWeight());
        System.out.println("The weight of lastBox = " + orangeBox.getBoxWeight());

        System.out.println();

//        try to put some apples|oranges into another box
        System.out.println("The operation of putting apples from one box into another");
        appleBox.putFruitToBox(emptyAppleBox);
        System.out.println("The weight of firstBox = " + emptyAppleBox.getBoxWeight());
        System.out.println("The weight of secondBox = " + appleBox.getBoxWeight());

        System.out.println();

//        put orange in apple box
//        limitation!!! can't add orange in apples
//        orangeBox.putFruitToBox(appleBox);//
//        appleBox.addFruit(new Orange())

//        compare not empty box of apples with not-empty box of oranges
//        emptyAppleBox isn't empty we put apples from second box into it
        System.out.println("The weight of firstBox = " + emptyAppleBox.getBoxWeight());
        System.out.println("The weight of lastBox = " + orangeBox.getBoxWeight());
        System.out.println(orangeBox.compareBoxes(emptyAppleBox)
                ? "Box of apples is more heavily than orange box"
                : "Box of oranges is the more heavily");
    }
}
