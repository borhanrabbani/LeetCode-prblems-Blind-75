
// 217. Contains Duplicate

package com.test;

import java.util.HashSet;

public class ContainsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1,1,1,3,3,4,3,2,4,2 };
		
		boolean state = false;

		HashSet<Integer> hs = new HashSet<>();

		for (int i = 0; i < arr.length; i++) {
			if (hs.contains(arr[i])) {
				state = true;
				break;
			} else {
				hs.add(arr[i]);
			}
			state = false;
		}
		
		System.out.println(state);

	}

}
