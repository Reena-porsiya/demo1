package com.demo;
//Problem Statement:https://leetcode.com/problems/sort-the-people/

import java.util.Arrays;

public class SortPeople {

    public String[] sortPeople(String[] names, int[] heights) {
        int n = heights.length;

       
            for (int j = 0; j < n - 1; j++) {
                if (heights[j] < heights[j + 1]) {
                    // Swap heights
                    int tempHeight = heights[j];
                    heights[j] = heights[j + 1];
                    heights[j + 1] = tempHeight;

                    // Swap names
                    String tempName = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = tempName;
                }
            }
      

        return names;
    }

    public static void main(String[] args) {
        SortPeople sorter = new SortPeople();

        // Example 1
        String[] names1 = {"Mary", "John", "Emma"};
        int[] heights1 = {180, 165, 170};
        String[] result1 = sorter.sortPeople(names1, heights1);
        System.out.println("Example 1: " + Arrays.toString(result1));

        // Example 2
        String[] names2 = {"Alice", "Bob", "Bob"};
        int[] heights2 = {155, 185, 150};
        String[] result2 = sorter.sortPeople(names2, heights2);
        System.out.println("Example 2: " + Arrays.toString(result2));
    }
}
