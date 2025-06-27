package com.java.topics.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        ExecutorService ex = Executors.newFixedThreadPool(3);
        for(int i=0;i<10;i++){
            ex.submit(()-> System.out.println("Running"+ Thread.currentThread().getName()));
        }
        ex.shutdown();
    }
}
