package com.test;

public class TwoSum {
	
	 public int[] twoSum(int[] nums, int target) {
	        for(int i=0; i<nums.length; i++){
	            int temp1 = nums[i];
	            
	            for(int j=i+1; j<nums.length; j++){
	                if((temp1+nums[j])==target){
	                    return new int[] {i,j};
	                }
	            }
	        }
	        return null;
	    }

	public static void main(String[] args) {

		int arr[] = {1,3,7,2,3,9,10};
		int target =11;
		
		TwoSum ts = new TwoSum();
		int res[] = ts.twoSum(arr, target);
		for(int i=0; i<res.length; i++) {
			System.out.println(res[i]);
		}
	}

}
