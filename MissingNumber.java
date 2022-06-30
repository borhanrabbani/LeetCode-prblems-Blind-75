//https://leetcode.com/problems/missing-number/submissions/

package com.math;

import java.util.HashSet;
import java.util.Set;

public class MissingNumber {

	public static void main(String[] args) {
		int[] nums = {9,6,4,2,3,5,7,0,1};
		
		// Using HashSet, this problem can be solved, but this approach take extra space because of HashSet
		// This is why below approach is less efficient.
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
		
		// Below approach is more efficient and doesn't need extra space
		int givenCount=0, resultCount=0;
		
		for(int j=0; j<nums.length; j++) {
			givenCount += nums[j];
			resultCount += j;
		}
		resultCount += nums.length;
		int temp = resultCount - givenCount;
		
		System.out.println(temp);
	}

}
