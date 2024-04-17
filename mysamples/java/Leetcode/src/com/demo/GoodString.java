
package com.demo;

//Problem statement:https://leetcode.com/problems/make-the-string-great/
public class GoodString {
    public static void main(String[] args) {
        // Example 1
        String s1 = "leEeetcode";
        System.out.println("Example 1: " + makeGoodString(s1)); 
    }

    public static String makeGoodString(String s) {
        char[] result = new char[s.length()];
        int index = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (index > 0 && (result[index - 1] - c == 32 || c - result[index - 1] == 32)) {
                // Remove the last character from the result if it makes a bad string
                index--;
            } else {
                
                result[index++] = c;
            }
        }
       
        return new String(result, 0, index);
    }
}
