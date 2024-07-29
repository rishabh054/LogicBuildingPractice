package com.java.topics.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaxElement {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 2, 4, 45, 8 ,64);
        Integer maxElement = list.stream().max(Integer::compareTo).get();
        System.out.println(maxElement);
    }
}
