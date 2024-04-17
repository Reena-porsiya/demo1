
package com.demo;
//link:https://leetcode.com/problems/remove-outermost-parentheses/

import java.util.Stack;

public class OutermostParentheses {
	public static void main(String[] args) {
		String input= "(())";
		
		Stack<Character> stack = new Stack<>();
		
		String result = "";
		int count = 0;
		
		 for (int i = 0; i < input.length(); i++) {
	            char c = input.charAt(i);
	            

	           if (c == '(') {
	                if (count > 0) {
	                	
	                    result = result+c;
	                }
	                stack.push(c);
	                count++;
	               
	            }
	            else if (c == ')') {
	            	stack.pop();
	                count--;
	               

	              if (count > 0) {
	            	 
	                	result = result+c;
	                }
	            }
		
		}
		 System.out.println(result);
}
}