package com.java.prep;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchInSortedArray {
    public static void main(String[] args) {
        int[] array = {3, 4, 5, 6, 9, 17, 18};
        int target = 9;


        System.out.println("Number found at index = " + binarySearch(target, array));
    }

    public static int binarySearch(int target, int[] array) {
        int start = 0;
        int last = array.length - 1;
        int mid = 0;
        while (start <= last) {
            mid = (start + last) / 2;
            if (target == array[mid]) {
                return mid;
            }
            if (target > array[mid]) {
                start = mid + 1;
            } else {
                last = mid - 1;
            }
        }
        return -1;
    }
}
