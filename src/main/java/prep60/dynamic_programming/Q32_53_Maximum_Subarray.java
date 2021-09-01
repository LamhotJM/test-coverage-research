package prep60.dynamic_programming;

public class Q32_53_Maximum_Subarray {
	/*
	 * 53. Maximum Subarray
	 * 
	 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

	A subarray is a contiguous part of an array.
	
	 
	
	Example 1:
	
	Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
	Output: 6
	Explanation: [4,-1,2,1] has the largest sum = 6.
	Example 2:
	
	Input: nums = [1]
	Output: 1
	Example 3:
	
	Input: nums = [5,4,-1,7,8]
	Output: 23
	 
	
	Constraints:
	
	1 <= nums.length <= 3 * 104
	-105 <= nums[i] <= 105
	 
	
	Follow up: If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.


	 */
	
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
