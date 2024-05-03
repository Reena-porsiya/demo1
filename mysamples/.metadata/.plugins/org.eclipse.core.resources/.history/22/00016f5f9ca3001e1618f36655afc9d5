package com.demo;

import java.util.Arrays;

public class DeleteGreatestValues {
    public int deleteGreatestValue(int[][] grid) {
        // Sort each row in non-decreasing order
        for (int i = 0; i < grid.length; i++) {
            Arrays.sort(grid[i]);
        }
        
        int ans = 0;
        
        // Iterate through columns
        for (int j = 0; j < grid[0].length; ++j) {
            int t = 0;
            
            // Find the maximum value in the current column
            for (int i = 0; i < grid.length; ++i) {
                t = Math.max(t, grid[i][j]);
            }
            
            // Add the maximum value to the answer
            ans += t;
        }
        
        return ans;
    }
    
    public static void main(String[] args) {
        // Example 1
        int[][] grid1 = {{1, 2, 4}, {3, 3, 1}};
        DeleteGreatestValues solution = new DeleteGreatestValues();
        System.out.println(solution.deleteGreatestValue(grid1)); // Output: 8

        // Example 2
        int[][] grid2 = {{10}};
        System.out.println(solution.deleteGreatestValue(grid2)); // Output: 10
    }
}
