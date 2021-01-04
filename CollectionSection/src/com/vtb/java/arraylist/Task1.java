package com.vtb.java.arraylist;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        String[] userArray = {"B", "A"};
        System.out.println("Original array: " + Arrays.toString(userArray));
        swapElements(userArray, 0, 1);
        System.out.println("Swapped array: " + Arrays.toString(userArray));
    }
    
    private static <T> void swapElements(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
