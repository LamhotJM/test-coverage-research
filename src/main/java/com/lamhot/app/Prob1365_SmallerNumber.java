package com.lamhot.app;


public class Prob1365_SmallerNumber {

	public int[] smallerNumbersThanCurrent(int[] nums) {
		// find the smaller
		int arr[] = new int[nums.length];
		int count = 0;
		for (int i = 0; i < nums.length; i++) {

			count = 0;
			for (int j = 0; j < nums.length; j++) {

				if (nums[i] > nums[j]) {
					count++;
				}
			}
			arr[i] = count;
		}

		return arr;
	}

}
