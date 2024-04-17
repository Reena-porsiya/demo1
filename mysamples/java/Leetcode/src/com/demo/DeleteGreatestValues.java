package com.demo;


public class DeleteGreatestValues {
    public static int maxScore(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int score = 0;

        for (int i = 0; i < rows; i++) {
            int currentMax = grid[i][0];

            for (int j = 1; j < cols; j++) {
                if (grid[i][j] >= currentMax) {
                    currentMax = grid[i][j];
                }
            }

            score += currentMax;

            // Remove the maximum value from the corresponding column
            for (int k = 0; k < cols; k++) {
                if (grid[i][k] == currentMax) {
                    grid[i][k] = 0;
                }
            }
        }

        return score;
    }

    public static void main(String[] args) {
        // Example 1
        int[][] grid1 = {{1, 2, 4}, {3, 3, 1}};
        System.out.println("Example 1: " + maxScore(grid1));

        // Example 2
        int[][] grid2 = {{10}};
        System.out.println("Example 2: " + maxScore(grid2));
    }
}

