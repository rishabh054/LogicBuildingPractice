package com.java.topics.streams;

import java.util.ArrayList;
import java.util.List;

public class SortStringAlphabetically {
    // Q13. Use streams to sort a list of strings alphabetically.
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("Ankit"); list.add("yalk");
        list.add("cow"); list.add("Hii");
        list.add("roy"); list.add("ankit");
        list.add("boat"); list.add("Car");
        list.add("zebra");
        list.add("dog");

        List<String> stringList = list.stream()
                .map(c->c.toLowerCase())
                .sorted()
                .toList();
        System.out.println(stringList);
    }
}
