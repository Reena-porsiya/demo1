
package com.demo;

//problem statement:https://leetcode.com/problems/reverse-prefix-of-word/
public class ReverseSegment {
    public static void main(String[] args) {
        // Example 1
        String word1 = "abcdefd";
        char ch1 = 'd';
        System.out.println("Example 1: " + reverseSegment(word1, ch1));
        // Example 2
        String word2 = "xyxzxe";
        char ch2 = 'z';
        System.out.println("Example 2: " + reverseSegment(word2, ch2)); 

        // Example 3
        String word3 = "abcd";
        char ch3 = 'z';
        System.out.println("Example 3: " + reverseSegment(word3, ch3)); 
    }

    public static String reverseSegment(String word, char ch) {
        char[] wordArray = word.toCharArray();
        int index = word.indexOf(ch);

        if (index != -1) { // Check if the character 'ch' exists in the word
            reverseArray(wordArray, 0, index);
        }
     // Convert the modified character array back to a string
        return new String(wordArray);
        
    }

    private static void reverseArray(char[] arr, int start, int end) {
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
