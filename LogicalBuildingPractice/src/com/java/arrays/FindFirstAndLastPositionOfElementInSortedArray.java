package com.java.arrays;

import java.util.ArrayList;

/**
 Given an array of integers nums sorted in non-decreasing order, find the starting and
 ending position of a given target value.
 If target is not found in the array, return [-1, -1].
 You must write an algorithm with O(log n) runtime complexity.

 Example 1:
 Input: nums = [5,7,7,8,8,8,8,8,10], target = 8
 Output: [3,4]
 **/
public class FindFirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int start =0;
        int mid = arr.length/2;
        int end = arr.length;
        ArrayList a = new ArrayList();
        int target = 8;
        while (start<=end){
            mid = (start+end)/2;
            if(target >mid){
                start = mid+1;
            }
            else if(target <mid){
                end = mid-1;
            }
            if(arr[mid] == target){
                a.add(mid);
                System.out.println(mid);
            }
        }
        System.out.println(a);
    }
}
