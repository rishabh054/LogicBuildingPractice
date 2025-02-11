package com.java.arrays;

import java.util.HashMap;
import java.util.Map;

/*
* Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
There is only one repeated number in nums, return this repeated number.
You must solve the problem without modifying the array nums and using only constant extra space. */

public class FindDuplicateUsingHashMap {
    public static void main(String[] args) {

        int[] array = {3, 4, 7, 2, 9, 5, 6, 7, 6};

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            hashMap.put(array[i], hashMap.getOrDefault(array[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Duplicate Number =" + entry.getKey());
            }
        }
    }
}
