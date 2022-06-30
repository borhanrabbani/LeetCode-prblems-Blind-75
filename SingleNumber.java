package com.math;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {

	public static void main(String[] args) {

		int[] nums = { 4, 1, 2, 1, 2, 1, 2, 2 };

		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (set.contains(nums[i])) {
				set.remove(nums[i]);
			} else {
				set.add(nums[i]);
			}
		}

		int t = 0;
		for (int s : set) {
			t = s;
		}

		int ret = 0;
		for (int i = 0; i < nums.length; i++) {
			ret = ret ^ nums[i];
		}

		System.out.println(t);
		System.out.println(ret);
		System.out.println(set);
	}

}
