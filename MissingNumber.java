package com.math;

import java.util.HashSet;
import java.util.Set;

public class MissingNumber {

	public static void main(String[] args) {
		int[] nums = {9,6,4,2,3,5,7,0,1};
		
		Set<Integer> set = new HashSet<Integer>();
		for(int i: nums) {
			set.add(i);
		}
		
		int missing =0;
		for(int i=0; i<=nums.length; i++) {
			if(!set.contains(i)) {
				missing=i;
			}
		}
		System.out.println(missing);
	}

}
