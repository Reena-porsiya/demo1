package com.demo;

public class WordPairs {

    public static int maxNumOfPairs(String[] words) {
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (isPair(words[i], words[j])) {
                    count++;
                }
            }
        }

        return count;
    }

    public static boolean isPair(String word1, String word2) {
        
        return word1.equals( new StringBuilder(word2).reverse().toString());
    }

    public static void main(String[] args) {
        String[] words1 = {"cd", "ac", "dc", "ca", "zz"};
        System.out.println("Example 1: " + maxNumOfPairs(words1));
        
        String[] words2 = {"ab", "ba", "cc"};
        System.out.println("Example 2: " + maxNumOfPairs(words2)); 

        String[] words3 = {"aa", "ab"};
        System.out.println("Example 3: " + maxNumOfPairs(words3)); 
    }
}
