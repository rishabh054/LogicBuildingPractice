package com.java.arrays;

/**
 * The majority element is the element that appears more than n / 2 times. You may assume that
 * the majority element always exists in the array.
 * <p>
 * Example 2:
 * Input: nums = [2,2,1,1,1,2,2]
 * Output: 2
 **/
public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(nums));

    }

    public static int majorityElement(int[] nums) {
        int count = 0;
        int element = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                element = nums[i];
                count = 1;
            } else if (nums[i] == element)
                count++;
            else {
                count--;
            }
        }
        int count1 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == element)
                count1++;
        }
        if (count1 > nums.length / 2)
            return element;
        return -1;
    }

}
