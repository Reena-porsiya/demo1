package com.demo;

import java.util.HashMap;
import java.util.Map;

public class SumOfUniqueElements {
    public static int sumOfUnique(int[] nums) {
        // Create a HashMap to store the count of each element
        Map<Integer, Integer> elementCount = new HashMap<>();

        // Count the occurrences of each element in the array
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            elementCount.put(num, elementCount.getOrDefault(num, 0) + 1);
        }

        // Calculate the sum of unique elements
        int uniqueSum = 0;
        for (Map.Entry<Integer, Integer> entry : elementCount.entrySet()) {
            if (entry.getValue() == 1) {
                uniqueSum += entry.getKey();
            }
        }

        return uniqueSum;
    }

    public static void main(String[] args) {
        // Example usage:
        int[] nums1 = {1, 2, 3, 2};
        System.out.println(sumOfUnique(nums1));  // Output: 4

        int[] nums2 = {1, 1, 1, 1, 1};
        System.out.println(sumOfUnique(nums2));  // Output: 0

        int[] nums3 = {1, 2, 3, 4, 5};
        System.out.println(sumOfUnique(nums3));  // Output: 15
    }
}
