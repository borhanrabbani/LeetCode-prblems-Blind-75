// https://leetcode.com/problems/valid-palindrome/submissions/

// This problem can be solved by using java built in functions, but i tried to solve it without built in function except toLoweCase() 


package com.test;

public class ValidPalindrome {

	public static void main(String[] args) {
		String s = "race a car";
		char[] arr = new char[s.length()];
		arr = s.toCharArray();
		int counter = 0;
		for (int i = 0; i < s.length(); i++) {
			char temp = Character.toLowerCase(arr[i]);
//			System.out.println(temp);
			if ((temp >= 'a' && temp <= 'z')) {
				arr[counter] = temp;
				counter++;
			}
			if(temp>=48 && temp<=57) {
				arr[counter] = temp;
				counter++;
			}
		}
		boolean state = true;
		System.out.println(counter);

		int i = 0, j = counter - 1;

		while (i < j) {
			if (arr[i] != arr[j]) {
				state = false;
				break;
			}
			i++;
			j--;
		}

		System.out.println(state);
	}

}
