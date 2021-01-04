package com.vtb.java.arraylist;

import java.util.Arrays;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        String[] userArray = {"a", "b", "c", "d", "e"};
        System.out.println("Input array: " + Arrays.toString(userArray));
        List<String> stringList = toArrayList(userArray);
        for (String s : stringList) {
            System.out.println("\nElement " + s + " by index " + stringList.indexOf(s));
        }
        Integer[] intArray = {1, 2, 3, 4, 5};
        List<Integer> integerList = toArrayList(intArray);
        System.out.println("\nArray list of integers " + integerList);
    }

    private static <T> List<T> toArrayList(T[] array) {
        return Arrays.asList(array);
    }
}
