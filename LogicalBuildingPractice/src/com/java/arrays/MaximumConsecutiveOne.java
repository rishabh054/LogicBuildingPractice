package com.java.arrays;

/**
 * Given a binary array nums, return the maximum number of consecutive 1's in the array.
 * Example 1:
 * Input: nums = [1,1,0,1,1,1]
 * Output: 3
 * Explanation: The first two digits or the last three digits are consecutive 1s.
 * The maximum number of consecutive 1s is 3.
 **/

public class MaximumConsecutiveOne {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 0};
        int max = 0, cut = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                cut++;
            }
            if (arr[i] == 0) {
                cut = 0;
            }
            if (max < cut) {
                max = cut;
            }
        }
        System.out.println(max);
    }
}
