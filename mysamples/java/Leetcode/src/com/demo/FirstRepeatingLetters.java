
package com.demo;

import java.util.HashSet;

public class FirstRepeatingLetters {
    public static void main(String[] args) {
        String s1 = "abccbaacz";
        System.out.println(firstRepeatingLetters(s1)); 

        String s2 = "abcdd";
        System.out.println(firstRepeatingLetters(s2)); 
    }

    public static char firstRepeatingLetters(String s) {
        HashSet<Character> seenLetters = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char currentLetter = s.charAt(i);

            if (seenLetters.contains(currentLetter)) {
                return currentLetter;
            }

            seenLetters.add(currentLetter);
        }
		return 0;

        
    }
}
