// https://leetcode.com/problems/valid-palindrome-ii/submissions/

package com.test;

public class ValidPalindromeII {
	
	boolean state=true;
	
	public boolean checkPalindrom(char[] arr, int i, int j) {
		
		while(i<j) {
			if(arr[i]!=arr[j]) {
				return isPalindrome(arr, i+1, j) || isPalindrome(arr, i, j-1);
			}
			i++;
			j--;
		}
		return state;
	}
	
	public boolean isPalindrome(char[] arr, int i, int j) {
		while(i<j) {
			if(arr[i]!=arr[j]) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	
	

	public static void main(String[] args) {

		String s = "deeee";
		char[] arr = new char[s.length()];
		arr = s.toCharArray();
		int counter =0;
		
		for(int i=0; i<s.length(); i++) {
			char temp = Character.toLowerCase(arr[i]);
			if ((temp >= 'a' && temp <= 'z')) {
				arr[counter] = temp;
				counter++;
			}
			if(temp>=48 && temp<=57) {
				arr[counter] = temp;
				counter++;
			}
		}
		
		
		int i=0, j=counter-1;
		
		ValidPalindromeII vp = new ValidPalindromeII();
		System.out.println(vp.checkPalindrom(arr, i, j));
		
//		Commented portion is my brut force approach to solve this problem, it didn't pass all the test cases.
		
//		if(counter>0) {
//			int i=0;
//			int flag = 0;
//			for(int j=counter-1; j>=i; j--) {
//				if((arr[i]!=arr[j])&& flag<1) {
//					arr[j]=' ';
//					flag++;
//					i--;
//					j++;
//				}else if((arr[i]!=arr[j])&&(arr[j]==' ')){
//					state = true;
//					i--;
//				}else if((arr[i]!=arr[j])){
//					state = false;
//					break;
//				}
//                i++;
//			}
//		}
		
		
		
		System.out.println(arr);
	}

}
