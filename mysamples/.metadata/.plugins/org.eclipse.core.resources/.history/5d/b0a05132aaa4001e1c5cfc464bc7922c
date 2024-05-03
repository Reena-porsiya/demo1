package com.demo;

// Problem statement: https://leetcode.com/problems/single-number
public class SingleNumber {

    public static void main(String[] args) {
        // Initializing an array with integers
        int[] inputArray = {5, 2, 20, 2};
        
        // Arrays to store unique numbers and their occurrences
        int[] keyArray = new int[inputArray.length];
        int[] valueArray = new int[inputArray.length];
        
        // Loop through each element in the input array
        for (int i = 0; i < inputArray.length; i++) {
            // Get the current number from the input array
            int currentNum = inputArray[i];
            
            // Initialize variables to keep track of the current number's index and existence
            int keyIndex = -1;
            boolean keyExist = false;
            
            // Loop through the keyArray to check if the current number already exists
            for (int j = 0; j < keyArray.length; j++) {
                if (keyArray[j] == currentNum) {
                    // Update keyIndex and set keyExist to true if the current number exists
                    keyIndex = j;
                    keyExist = true;
                    break;
                }
            }
            
            // If the current number doesn't exist in keyArray, add it with an occurrence of 1
            if (!keyExist) {
                keyArray[i] = currentNum;
                valueArray[i] = 1;
            } else {
                // If the current number already exists, increment its occurrence in valueArray
                valueArray[keyIndex]++;
            }
        }
        
        // Print the single numbers that occur only once
        for (int i = 0; i < keyArray.length; i++) {
            if (keyArray[i] != 0 && valueArray[i] == 1) {
                System.out.println(keyArray[i]);
            }
        }
    }
}
