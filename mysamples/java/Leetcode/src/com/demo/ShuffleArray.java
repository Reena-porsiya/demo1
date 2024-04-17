
package com.demo;

//Problem statement:https://leetcode.com/problems/shuffle-the-array/
import java.util.Arrays;

public class ShuffleArray {
	

    public static void m1(int[] nums, int n) {

        // Create an array to store the shuffled elements
        int[] result = new int[nums.length];
        int index = 0;

        // Elements from the first half and the second half
        for (int i = 0; i < n; i++) {
            result[index++] = nums[i];
            result[index++] = nums[i + n];
            
            
        }

        System.out.println("Shuffled Array: " + Arrays.toString(result));
    }
    
    public static void main(String[] args) {
    	int[] nums = {1,2,3,4,4,3,2,1};
        int	n = 4;
        m1(nums, n);
        
        int[] nums1 = {1,2,4,3,5,6};
        int n1 =3;
        m1(nums1,n1);
        
       }
}


   