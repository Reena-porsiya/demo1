
package com.demo;

public class LongestCommonPrefix {
    public static void main(String[] args) {
       
        String[] strs1 = {"flower", "flow", "flight"};
        String result1 = longestCommonPrefix(strs1);
        System.out.println("Example 1 Output: " + result1); 

        
        String[] strs2 = {"dog", "racecar", "car"};
        String result2 = longestCommonPrefix(strs2);
        System.out.println("Example 2 Output: " + result2); 
    }

    public static String longestCommonPrefix(String[] strs) {
    	
    	if (strs.length == 0){ 
    		  return ""; 
    		  }
        
		String prefix = strs[0];

        
        for (int i = 1; i < strs.length && prefix.length() > 0; i++) {
        	
            while (strs[i].indexOf(prefix) != 0) {
            	
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }

        
        return prefix;
    }
}