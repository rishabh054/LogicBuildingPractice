package com.java.topics.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfListOfInteger {
    // the sum of a list of integers.
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 4, 8, 6, 9);
        int sum = list.stream().collect(Collectors.summingInt(x -> x));
        System.out.println(sum);

        int sum1 = list.stream().mapToInt(x -> x).sum();
        System.out.println(sum1);

    }
}
