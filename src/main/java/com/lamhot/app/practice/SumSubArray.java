package com.lamhot.app.practice;

public class SumSubArray {
	public static void main(String args[])
	{
		SumSubArray ob= new SumSubArray();
		int input [] = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(ob.maxSubArray(input));
	}
	
	public int maxSubArray(int[] nums) {
		int max = Integer.MIN_VALUE;
		int currentMax = 0;
		for (int i = 0; i < nums.length; i++) {
			currentMax = currentMax + nums[i];

			if (currentMax > max) {
				max = currentMax;
			}
			if (currentMax < 0) {
				currentMax = 0;
			}

		}

		return max;
	}

}
