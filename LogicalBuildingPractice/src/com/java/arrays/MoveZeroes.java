package com.java.arrays;

import java.util.Arrays;

/**
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative
 * order of the non-zero elements.
 * Note that you must do this in-place without making a copy of the array.
 * Example 1:
 * Input: nums = [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 **/
public class MoveZeroes {
    public static void main(String[] args) {
        int[] a = {0, 1, 0, 3, 12};
        int j = -1;
        int n = a.length;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                j = i;
                break;
            }
        }
        for (int i = j + 1; i < n; i++) {
            if (a[i] != 0) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j++;
            }
        }
        if (j == -1) {
            System.out.println(Arrays.toString(a));
        }

        System.out.println(Arrays.toString(a));
    }
}
