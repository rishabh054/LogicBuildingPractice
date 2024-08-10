package com.java.topics.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlattenListOfListsIntoSingleList {
    //Write a stream operation to flatten a list of lists into a single list.
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);
        List<List<Integer>> list3 = Arrays.asList(list1, list2);
//        List<Integer> list4 = list3.stream().collect(Collectors.flatMapping(s->s));
        System.out.println(list3);
    }
}
