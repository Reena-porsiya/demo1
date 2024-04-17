
package com.demo;
//Problem Statement:https://leetcode.com/problems/minimum-common-value/
public class MinimumCommonInteger {

    public static int minimumCommonInteger(int[] nums1, int[] nums2) {
        int i = 0, j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                return nums1[i];
            } else if (nums1[i] < nums2[j]) {
            	System.out.println("1");
                i++;
            } else {
            	System.out.println("2");
                j++;
            }
        }

        return 0; 
    }

    public static void main(String[] args) {
        // Example 1
        int[] nums1 = {1,2, 3};
        int[] nums2 = {2, 4};
        System.out.println("Example 1 Output: " + minimumCommonInteger(nums1, nums2));

        // Example 2
        int[] nums3 = {3, 4, 5};
        int[] nums4 = {1, 2, 3, 6};
        System.out.println("Example 2 Output: " + minimumCommonInteger(nums3, nums4));
    }
}
