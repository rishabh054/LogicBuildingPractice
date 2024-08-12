package com.java.topics.streams;

import java.util.Arrays;
import java.util.List;

public class SumOfEvenAndOddNumberInList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 4, 8, 6, 9, 12, 7);
        Integer sumOfEven = list.stream().mapToInt(n -> n)
                .filter(n -> n % 2 == 0)
                .sum();
        System.out.println("sumOfEven = " + sumOfEven);
        Integer sumOfOdd = list.stream().mapToInt(n -> n)
                .filter(n -> n % 2 != 0)
                .sum();
        System.out.println("sumOfOdd = " + sumOfOdd);
    }
}
