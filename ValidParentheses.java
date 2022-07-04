// https://leetcode.com/problems/valid-parentheses/submissions/

package com.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		Map<Character, Character> hm = new HashMap<Character, Character>();
		
		hm.put(')', '(');
		hm.put('}', '{');
		hm.put(']', '[');
		
		for(char c: s.toCharArray()) {
			if(hm.containsKey(c)) {
				if(!stack.isEmpty() && stack.peek()==hm.get(c)) {
					stack.pop();
				}else {
					return false;
				}
			}else {
				stack.push(c);
			}
		}
		
		return stack.isEmpty();

	}

	public static void main(String[] args) {
		ValidParentheses vp = new ValidParentheses();
		System.out.println(vp.isValid("{{}[][[[]]]}"));
	}

}
