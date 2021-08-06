package com.lamhot.app.leetcode;

public class Q53MaximumSubarray {
	public static void main(String args[]) {
		Q53MaximumSubarray ob = new Q53MaximumSubarray();

		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(ob.maxSubArray(nums));

	}

	public int maxSubArray(int[] nums) {
		if (nums.length <= 0 || nums == null)

		{
			return 0;
		}

		int max_sum = nums[0];
		int current_max = max_sum;
		for (int i = 1; i < nums.length; i++) {
			current_max = Math.max(current_max + nums[i], nums[i]);

			max_sum = Math.max(current_max, max_sum);
		}
		return max_sum;

	}

}
