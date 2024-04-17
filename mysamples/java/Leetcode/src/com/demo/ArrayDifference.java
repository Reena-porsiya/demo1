
package com.demo;

//Program statement:https://leetcode.com/problems/left-and-right-sum-differences/

import java.util.Arrays;

public class ArrayDifference {
	

    public static int[] findArrayDifference(int[] nums) {
        int n = nums.length;

        int[] leftSum = new int[n];
        for (int i = 1; i < n; i++) {
        	
        }

        int[] rightSum = new int[n];  
        for (int i = n - 2; i >= 0; i--) {
            
        }
     // Calculate the absolute difference between leftSum and rightSum for each index
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            answer[i] = leftSum[i] + rightSum[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        // Example 1
        int[] nums1 = {10, 4, 8, 3};
        int[] result1 = findArrayDifference(nums1);
        System.out.println("Example 1: " + Arrays.toString(result1));

        // Example 2
        int[] nums2 = {1};
        int[] result2 = findArrayDifference(nums2);
        System.out.println("Example 2: " + Arrays.toString(result2));
    }
}
