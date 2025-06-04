package com.java.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Problem Statement: Given an array, print all the elements which are leaders.
 * A Leader is an element that is greater than all of the elements on its right side in the array.
 * Example 2:
 * Input:
 * arr = [10, 22, 12, 3, 0, 6]
 * Output: 22 12 6
 **/
public class LeadersInAnArray {
    public static void main(String[] args) {
        int[] arr = {10, 22, 12, 3, 0, 6};
        System.out.println(findLeaders(arr));
    }

    private static List<Integer> findLeaders(int[] arr) {
        int max = Integer.MIN_VALUE;
        ArrayList a = new ArrayList();

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > max) {
                a.add(arr[i]);
            }
            max = Math.max(arr[i], max);
        }
        return a;
    }
}
