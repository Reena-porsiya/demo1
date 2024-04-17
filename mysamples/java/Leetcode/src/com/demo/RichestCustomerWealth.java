
package com.demo;
//Problem Statement:https://leetcode.com/problems/richest-customer-wealth/

public class RichestCustomerWealth {
    public static void main(String[] args) {
        // Example 1
        int[][] accounts1 = {{1, 2, 3}, {3, 2, 1}};
        System.out.println(maximumWealth(accounts1)); // Output: 6

        // Example 2
        int[][] accounts2 = {{1, 5}, {7, 3}, {3, 5}};
        System.out.println(maximumWealth(accounts2)); // Output: 10

        // Example 3
        int[][] accounts3 = {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};
        System.out.println(maximumWealth(accounts3)); // Output: 17
    }

    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        for (int i = 0; i < accounts.length; i++) {
            int currentWealth = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                currentWealth += accounts[i][j];
            }
            maxWealth = Math.max(maxWealth, currentWealth);
        }

        return maxWealth;
    }
}
