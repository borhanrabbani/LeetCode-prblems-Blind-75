package com.test;

public class TwoSum {
	
	// Efficient Two sum
	public int[] efficientTwoSum(int[] nums, int target) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		
		for(int i=0; i<nums.length; i++) {
			Integer requiredNum = (Integer)(target-nums[i]);
			if(hm.containsKey(requiredNum)) {
				int indexReturn[] = {hm.get(requiredNum),i};
				return indexReturn;
			}
			
			hm.put(nums[i], i);
		}
		
		return null;
	}
	
	// Brut Force approach
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
