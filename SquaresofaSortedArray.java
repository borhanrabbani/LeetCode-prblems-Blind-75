// https://leetcode.com/problems/squares-of-a-sorted-array/submissions/

package com.test;

import java.util.Arrays;
import java.util.Collections;

public class SquaresofaSortedArray {

	public static void main(String[] args) {
		int[] nums = {-4,-1,0,3,10};
		
		int i=0;
		int j=nums.length-1;
		
		int[] res = new int[nums.length];
		
// In this portion I tried to solve this problem without using another Array, 
// for some test cases it was satisfied but failed for some other test cases.	
		
//		while(j!=i) {
//			if(Math.abs(nums[i])<Math.abs(nums[j])) {
//				nums[j] = nums[j]*nums[j];
//				j--;
//			}else {
//				int temp = nums[j];
//				nums[j] = nums[i]*nums[i];
//				nums[i]=temp;
//				j--;
//			}
//		}
		
		for(int p=j; p>=0; p--) {
			if(Math.abs(nums[i])>Math.abs(nums[j])) {
				res[p] = nums[i]*nums[i];
				i++;
			}else {
				res[p] = nums[j]*nums[j];
				j--;
			}
		}
		
		for(int k=0; k<nums.length; k++) {
			System.out.println(res[k]);
		}
	}

}
