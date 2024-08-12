package com.java.topics.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RemoveOccuranceOfGivenCharacter {
    public static void main(String[] args) {
        String str = "Rishabh";
        Character ch = 'h';
        String removeStr = str.chars().filter(c-> c != ch)
                .mapToObj(c->String.valueOf((char) c))
                .collect(Collectors.joining());

        System.out.println(removeStr);
    }
}
