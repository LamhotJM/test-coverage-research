package com.lamhot.app;

import java.util.Arrays;

public class Prob215FindKthLargest {

	public int findKthLargest(int[] nums, int k) {

		Arrays.sort(nums);

		return nums[nums.length - k];
	}

}
