package com.demo;
//Problem Statement:https://leetcode.com/problems/missing-number/

public class MissingNumbers {

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int i = 0; i < n; i++) {
            actualSum += nums[i];
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        // Example 1
        int[] nums1 = {3, 0, 1};
        System.out.println("Example 1 Output: " + missingNumber(nums1));

        // Example 2
        int[] nums2 = {0, 1};
        System.out.println("Example 2 Output: " + missingNumber(nums2));

        // Example 3
        int[] nums3 = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println("Example 3 Output: " + missingNumber(nums3));
    }
}
