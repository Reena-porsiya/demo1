
package com.demo;

//Problem statement:https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/
public class CountPairs {

    public static void main(String[] args) {
        // Example 1
        int[] nums1 = {1, 2, 2, 1};
        int k1 = 1;
        int result1 = count(nums1, k1);
        System.out.println("Number of occurrences for Example 1: " + result1);

        // Example 2
        int[] nums2 = {1, 3};
        int k2 = 3;
        int result2 = count(nums2, k2);
        System.out.println("Number of occurrences for Example 2: " + result2);

        // Example 3
        int[] nums3 = {3, 2, 1, 5, 4};
        int k3 = 2;
        int result3 = count(nums3, k3);
        System.out.println("Number of occurrences for Example 3: " + result3);
    }

    private static int count(int[] nums, int k) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int difference = nums[i] - nums[j];
                if ((difference == k) || (-difference == k)) {
                    count++;
                }
            }
        }

        return count;
    }
}
