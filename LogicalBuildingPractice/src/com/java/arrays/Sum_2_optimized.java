package com.java.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Sum_2_optimized {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 10;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int rem = target - nums[i];
            if (map.containsKey(rem)) {
                return new int[]{map.get(rem), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}
