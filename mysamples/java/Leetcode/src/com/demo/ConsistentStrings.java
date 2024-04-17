
package com.demo;


//Problem statement:https://leetcode.com/problems/count-the-number-of-consistent-strings/
public class ConsistentStrings {

    public static void main(String[] args) {
        // Example 1
        String allowed1 = "ab";
        String[] words1 = {"ad", "bd", "aaab", "baa", "badab"};
        int result1 = countConsistentStrings(allowed1, words1);
        System.out.println("Example 1: " + result1);

        // Example 2
        String allowed2 = "abc";
        String[] words2 = {"a", "b", "c", "ab", "ac", "bc", "abc"};
        int result2 = countConsistentStrings(allowed2, words2);
        System.out.println("Example 2: " + result2);

        // Example 3
        String allowed3 = "cad";
        String[] words3 = {"cc", "acd", "b", "ba", "bac", "bad", "ac", "d"};
        int result3 = countConsistentStrings(allowed3, words3);
        System.out.println("Example 3: " + result3);
    }

    // Method to count consistent strings
    private static int countConsistentStrings(String allowed, String[] words) {
        int count = 0;

        for (int i = 0; i < words.length; i++) {
        	// Initialize a boolean variable to track consistency
           boolean consistent = true;
            for (int j = 0; j < words[i].length(); j++) {
            	// Get the current character
                char c = words[i].charAt(j);
                
             // Check if the character is allowed
                if (allowed.indexOf(c) == -1) {
                	consistent = false;
                    break;
                }
            }
         // If the word is consistent, increment the count
            if (consistent) {
                count++;
            }
        }

        return count;
    }
}
