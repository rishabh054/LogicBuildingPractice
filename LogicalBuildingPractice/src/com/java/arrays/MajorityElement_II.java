package com.java.arrays;

import java.util.*;

/**
 * Given an integer array of size n, find all elements that appear more than  n/3  times.

 * Example 1:
 * Input: nums = [3,2,3]
 * Output: [3]
 * Example 2:
 * Input: nums = [1]
 * Output: [1]

 * Example 3:
 * Input: nums = [1,2]
 * Output: [1,2]
 **/
public class MajorityElement_II {
    public static void main(String[] args) {
        int[] arr = {1, 2};
        List<Integer> list = majorityElement(arr);
        System.out.println(list);

    }

    public static List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        List<Integer> list = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > nums.length / 3) {
                list.add(entry.getKey());
            }
        }
        return list;
    }
}
