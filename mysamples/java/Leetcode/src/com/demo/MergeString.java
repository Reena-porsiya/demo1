
package com.demo;

//Problem statement:https://leetcode.com/problems/merge-strings-alternately/
public class MergeString {
    public static void main(String[] args) {
        // Example 1
        String word1 = "abc";
        String word2 = "pqr";
        System.out.println("Example 1: " + mergeStrings(word1, word2));

     // Example 2
       // word1 = "ab";
       // word2 = "pqrs";
        //System.out.println("Example 2: " + mergeStrings(word1, word2));

        // Example 3
        word1 = "abcd";
        word2 = "pq";
        System.out.println("Example 3: " + mergeStrings(word1, word2));
    }

    public static String mergeStrings(String word1, String word2) {
        char[] result = new char[word1.length() + word2.length()];
        int i = 0, j = 0, k = 0;

        while (i < word1.length() && j < word2.length()) {
            result[k++] = word1.charAt(i++);
            result[k++] = word2.charAt(j++);
           
        }

        while (i < word1.length()) {
            result[k++] = word1.charAt(i++);
            
        }

        while (j < word2.length()) {
            result[k++] = word2.charAt(j++);
            
        }
     // Convert the character array to a string and return the result
        return new String(result);
        
    }
}
