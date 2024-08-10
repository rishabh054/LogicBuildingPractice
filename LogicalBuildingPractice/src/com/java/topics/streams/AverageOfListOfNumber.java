package com.java.topics.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AverageOfListOfNumber {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3,4,5,6,7,8);
        Double a = list.stream().collect(Collectors.averagingInt(x->x));
        System.out.println(a);
    }
}
