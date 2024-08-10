package com.java.topics.streams;

import java.util.Arrays;
import java.util.List;

public class FindMaxElementFromList {
    // Q12 Write a stream operation to find the maximum value in a list of integers.

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 2, 4, 45, 8, 64);
        Integer maxElement = list.stream().max(Integer::compareTo).get();
        System.out.println(maxElement);
    }
}
