package com.java.topics.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LongestStringInList {
    // To sort a list of strings by their length.
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Rishabh");
        list.add("Priyanshu");
        list.add("Vinayak");
        list.add("Priya");
        list.add("Bhagya");
        list.add("zz");

        List<String>sortedList = list.stream().sorted(Comparator.comparing(String::length)).toList();
        System.out.println(sortedList);
    }
}
