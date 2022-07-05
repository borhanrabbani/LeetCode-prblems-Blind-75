//https://leetcode.com/problems/binary-search/submissions/

package com.test;

public class BinarySearch {

	public int bSearch() {
		int[] nums = { -1, 0, 3, 5, 12 };
		int target = 9;
		int l = 0, r = nums.length - 1;

		while (l <= r) {
			int mid = (l + r) / 2;  // For highest integer value adding l & r might overflow and cause error
//			int mid = l + ((r-l)/2); // to find mid, this line of code will prevent the overflow and error.
			if (nums[mid] > target) {
				r = mid - 1;
			} else if (nums[mid] < target) {
				l = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		BinarySearch bs = new BinarySearch();
		System.out.println(bs.bSearch());
	}

}
