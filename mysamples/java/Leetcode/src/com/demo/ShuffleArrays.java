package com.demo;


import java.util.Arrays;

public class ShuffleArrays {

    public static void m1(int[] nums, int n) {
        
        

        System.out.println("Shuffled Array: " + Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 4, 3, 2, 1};
        int n = 4;
        m1(nums, n);

        int[] nums1 = {1, 2, 3, 4, 4, 3, 2, 1, 8};
        n = 4;
        m1(nums1, n);
    }
}