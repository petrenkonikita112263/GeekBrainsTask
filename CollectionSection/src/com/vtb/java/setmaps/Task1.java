package com.vtb.java.setmaps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        String textLine = "violescent\n" +
                "occamistic\n" +
                "riffler\n" +
                "trisoctahedron\n" +
                "coheiress\n" +
                "healthiness\n" +
                "healthiness\n" +
                "indwell\n" +
                "frontopariepaged\n" +
                "riffler\n" +
                "sportsmanly\n" +
                "almelo\n" +
                "didlove\n" +
                "whippletree\n" +
                "healthiness";
        String[] wordArray = textLine.split("\n");
        List<String> stringList = List.of(wordArray);
        System.out.println("All words " + stringList.size() + " that are contained in the list");
        stringList.forEach(System.out::println);
        HashSet<String> uniqueList = showUniqueElements(stringList);
        System.out.println("\nUniques words " + uniqueList.size());
        uniqueList.forEach(System.out::println);
        System.out.println();
        HashMap<String, Long> counts = countElementsOccurrence(stringList);
        counts.forEach((K,V) -> System.out.println("word " + K + " occurrence " + V + " times in text "));
    }

    private static <T, U> HashMap<T,U> countElementsOccurrence(List<T> list) {
        return (HashMap<T, U>) list.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
    }

    private static <T> HashSet<T> showUniqueElements(List<T> list) {
        return new HashSet<>(list);
    }

}
