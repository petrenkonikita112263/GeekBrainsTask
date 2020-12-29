package com.vtb.java;

import java.util.Arrays;

public class ExceptionRunner {
    public static void main(String[] args) {
        String[][] userArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "abc", "15", "16"}
        };
        try {
            int sum = getItemSun(userArray);
            System.out.println("Sum of each elements of array 4х4 = " + sum);
        } catch (MyArrayDataException | MyArraySizeException exception) {
            exception.printStackTrace();
        }
    }

    private static int getItemSun(String[][] array) throws MyArraySizeException {
        if (array.length != 4) {
            throw new MyArraySizeException("The array doesn't have needed length 4x4!!!");
        }
        int sum = 0;
        for (String[] strings : array) {
            for (String string : strings) {
                if (!string.matches("[-|+]?\\d+")) {
                    throw new MyArrayDataException("The array cell contains not a number represented by a string, but something else");
                }
                sum += Integer.parseInt(string);
            }
        }
        return sum;
    }

}
