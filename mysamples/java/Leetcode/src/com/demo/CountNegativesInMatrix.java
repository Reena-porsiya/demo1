package com.demo;


public class CountNegativesInMatrix {

    public static int countNegatives(int[][] grid) {
        int totalRows = grid.length;
        int totalCols = grid[0].length;
        int row = 0, col = totalCols - 1, count = 0;

        while (row < totalRows && col >= 0) {
            if (grid[row][col] < 0) {
                col--;
                count += totalRows - row;
            } else {
                row++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        // Example 1
        int[][] grid1 = {
            {4, 3, 2, -1},
            {3, 2, 1, -1},
            {1, 1, -1, -2},
            {-1, -1, -2, -3}
        };
        int result1 = countNegatives(grid1);
        System.out.println("Example 1 - Number of negative numbers: " + result1);

        // Example 2
        int[][] grid2 = {
            {3, 2},
            {1, 0}
        };
        int result2 = countNegatives(grid2);
        System.out.println("Example 2 - Number of negative numbers: " + result2);
    }
}
