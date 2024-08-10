package com.java.topics.streams;

import java.util.ArrayList;
import java.util.List;

public class ExtractOddNosFromList {

    /*Q11 Use streams to filter a list of integers to only include odd numbers.*/

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(12);
        list.add(65);
        list.add(76);
        list.add(43);
        list.add(34);
        list.add(23);
        list.add(69);

        List<Integer> oddNumberList = list.stream().filter(n -> n%2 != 0).toList();
        System.out.println(oddNumberList);
    }
}
