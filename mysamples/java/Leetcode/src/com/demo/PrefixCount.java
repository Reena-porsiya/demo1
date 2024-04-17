
package com.demo;
//Problem Statement:https://leetcode.com/problems/counting-words-with-a-given-prefix/
public class PrefixCount {
    public static void main(String[] args) {
        // Example 1
        String[] words1 = {"pay", "attention", "practice", "attend"};
        String pref1 = "at";
        System.out.println(prefixCount(words1, pref1));

        // Example 2
        String[] words2 = {"leetcode", "win", "loops", "success"};
        String pref2 = "code";
        System.out.println(prefixCount(words2, pref2)); 
    }

    public static int prefixCount(String[] words, String pref) {
        int pref_len = pref.length();
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= pref_len) {
                // Check if the current word has the specified prefix
                String checkPrefix = words[i].substring(0, pref_len);
                if (pref.equals(checkPrefix)) {
                    count++;
                }
            }
        }

        return count;
    }
}
