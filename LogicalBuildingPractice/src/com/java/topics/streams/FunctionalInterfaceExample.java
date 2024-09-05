package com.java.topics.streams;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        Predicate<Integer> pred = p -> p % 2 == 0;
        System.out.println(pred.test(4));
        System.out.println(pred.test(5));

        Function<Integer, Integer> func = i->i*2;
        System.out.println(func.apply(4));
        System.out.println(func.apply(5));

        Consumer<String> supp = s->System.out.println(s);
        supp.accept("Rishabh");
    }
}
