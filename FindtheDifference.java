//https://leetcode.com/problems/find-the-difference/

package com.hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindtheDifference {

	public static void main(String[] args) {
		String s = "abcd", t = "abcde";

		// very inefficient
		List<Character> list = new ArrayList<Character>();

		for (char c : s.toCharArray()) {
			list.add(c);
			
		}

		char ret = ' ';

		for (char c : t.toCharArray()) {
			if (list.contains(c)) {
				int ind = list.indexOf(c);
				list.remove(ind);
			} else {
				ret = c;
			}
		}
		
		// HashMap solution
		// Pretty efficient than ArrayList, still there is room to make more efficient
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(char ch: s.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		char temp = ' ';
		for(char ch: t.toCharArray()) {
			if(map.containsKey(ch) && map.get(ch)>0) {
				map.put(ch, map.get(ch)-1);
			}else {
				temp=ch;
			}
		}
		
		
		// XOR solution
		// Efficient than previous two
		char cXor =0;
		for(char cs: s.toCharArray()) {
			cXor ^=  cs;
		}
		for(char ct: t.toCharArray()) {
			cXor ^=  ct;
		}
		
		// sum solution
		// as efficient as XOR operation
		char ss=0, ts=0;
		int i=0;
		for(; i<s.length(); i++) {
			ss += s.charAt(i);
			ts += t.charAt(i);
		}
		
		ts += t.charAt(i);
		char res = (char) (ts-ss);
		
		System.out.println(res);
		System.out.println(cXor);
		System.out.println(ret);
		System.out.println(temp);

	}

}
