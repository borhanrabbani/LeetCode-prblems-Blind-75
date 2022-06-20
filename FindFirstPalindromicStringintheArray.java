package com.test;

public class FindFirstPalindromicStringintheArray {

	public static void main(String[] args) {
		String[] s = {"def","ghi"};
		
		boolean state = false;
		
		for(int i=0; i<s.length; i++) {
			char[] arr = new char[s[i].length()];
			arr = s[i].toCharArray();
			
			int l=0, r=arr.length-1;
			while(l<r) {
				if(arr[l]!=arr[r]) {
					state=false;
					break;
				}
				state=true;
				l++;
				r--;
			}
			if(state) {
				System.out.println(arr);
				break;
			}
		}
	}

}
