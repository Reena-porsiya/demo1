package com.demo;

//Problem Statement:https://leetcode.com/problems/missing-number/

import java.util.Arrays;


public class BinarySearchMissingNum {

	public static int missingNumber(int[] nums) {
		Arrays.sort(nums);

		int left = 0;
		int right = nums.length;

		while (left < right) {
			int mid = left + (right - left) / 2;

			if (nums[mid] > mid) {

				right = mid;
			} else {
				left = mid + 1;

			}
		}

		return left;
	}

	public static void main(String[] args) {

		
		  int[] nums1 = {3, 0, 1}; System.out.println("Example 1: " +missingNumber(nums1));
		  
		  int[] nums2 = {0, 1}; System.out.println("Example 2: " +missingNumber(nums2));
		 

		
	}
}
