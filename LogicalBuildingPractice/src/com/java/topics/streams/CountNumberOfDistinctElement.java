package com.java.topics.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountNumberOfDistinctElement {
    //Q14. Write a stream operation to count the number of distinct elements in a list.

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 4, 7, 3, 9, 7, 8, 2, 34, 65, 3, 7, 4);

        Map<Integer, Long> occuranceMap = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(occuranceMap);

    }
}
