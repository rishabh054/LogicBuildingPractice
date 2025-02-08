package com.java.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DBS {
    public static void main(String[] args) {
        String input = "HelloWorld";

        String result = IntStream.range(0, input.length()) // Generate indices
                .filter(i -> i % 2 != 0) // Keep only odd indices
                .mapToObj(i->String.valueOf(input.charAt(i))) // Get the character at each odd index
                .collect(Collectors.joining());

        System.out.println("Odd index characters: " + result);
    }
}
