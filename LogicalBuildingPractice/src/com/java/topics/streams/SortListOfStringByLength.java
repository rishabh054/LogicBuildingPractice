package com.java.topics.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortListOfStringByLength {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Rishabh", "Abhishek","cow","Wolf");
        List<String>sortedList = list.stream().sorted(Comparator.comparing(String::length)).toList();
        System.out.println(sortedList);

    }
}
