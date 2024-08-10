package com.java.topics.streams;

import java.util.Arrays;
import java.util.List;

public class SquareOfEachNumber {
    public static void main(String[] args) {
        //Q.10 Write a lambda expression to square each number in a list of integers.
        List<Integer> list = Arrays.asList(4, 7, 2, 9, 8, 5);

        List<Integer> listOfSquare = list.stream().map(x -> x * x).toList();
        System.out.println(listOfSquare);
    }
}
