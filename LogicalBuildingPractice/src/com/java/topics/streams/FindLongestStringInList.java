package com.java.topics.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindLongestStringInList {
    //to find the longest string in a list.
    public static void main(String[] args) {
        List<String> list = Arrays.asList("rishabh", "foG", "rishabh1");
        String list1 = list.stream().sorted(Comparator.comparing(String::length).reversed()).toList().getFirst();
        System.out.println(list1);

        Optional<String> list2 = list.stream().max(Comparator.comparing(String::length));
        list2.ifPresent(System.out::println);
    }
}
