//242. Valid Anagram

package com.test;

import java.util.Arrays;
import java.util.HashMap;

public class ValidAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// This approach is faster than HashMap approach but less efficient compared to space
		String s = "car";
		String t = "cat";
		char[] as = s.toCharArray();
		char[] at = t.toCharArray();
		
		Arrays.sort(at);
		Arrays.sort(as);
		
		boolean flag = false;
		
		if(s.length()==t.length()) {
			for(int i=0; i<s.length(); i++) {
				if(as[i]==at[i]) {
					flag = true;
				}else {
					flag = false;
					break;
				}
			}
		}
		
		System.out.println(flag);
		
		ValidAnagram va = new ValidAnagram();
		System.out.println(va.HashMapSolution(s, t));

	}
	
	
	// This approach is less faster but efficient in terms of Space
	public boolean HashMapSolution(String s, String t) {
		if(s.length()!=t.length()) {
			return false;
		}
		
		HashMap<Character, Integer> hms = new HashMap<>();
		HashMap<Character, Integer> hmt = new HashMap<>();
		
		char[] temps = s.toCharArray();
		char[] tempt = t.toCharArray();
		
		for(int i=0; i<temps.length; i++) {
			hms.put(temps[i], hms.getOrDefault(temps[i], 0)+1);
			hmt.put(tempt[i], hmt.getOrDefault(tempt[i], 0)+1);
		}
		
		return hms.equals(hmt);
	}

}
