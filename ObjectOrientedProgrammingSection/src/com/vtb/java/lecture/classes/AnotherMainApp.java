package com.vtb.java.lecture.classes;

import com.vtb.java.lecture.interfaces.Action;

public class AnotherMainApp {

    class Inner{
        int innerValue;

        public Inner(int innerValue) {
            this.innerValue = innerValue;
        }

        public void innerMethod() {
            System.out.println(innerValue);
            System.out.println(outerValue);
        }
    }

    int outerValue;

    public void outerMethod() {
        System.out.println(outerValue);
//        outer class can access to inner value
//        System.out.println(innnerValue);
        Inner inner = new Inner(10);
    }


    public static void main(String[] args) {
//        class must be static
//        Inner inner = new Inner(10);
        Inner inner = new AnotherMainApp().new Inner(10);

        class Point {
            int x;

            public Point(int x) {
                this.x = x;
            }
        }

        Point point = new Point(10);


        Action action = new Action() {
            @Override
            public void performMovement() {

            }
        };
        System.out.println(action.getClass().getName());

    }
}
