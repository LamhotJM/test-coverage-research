package prep60.chap10.sliding_window;

public class Q49_209_Minimum_Size_Subarray_Sum {
	/*
	 * 209. Minimum Size Subarray Sum
	 * 
	 * Given an array of positive integers nums and a positive integer target, return the minimal length of a contiguous subarray [numsl, numsl+1, ..., numsr-1, numsr] of which the sum is greater than or equal to target. If there is no such subarray, return 0 instead.


	Example 1:
	
	Input: target = 7, nums = [2,3,1,2,4,3]
	Output: 2
	Explanation: The subarray [4,3] has the minimal length under the problem constraint.
	Example 2:
	
	Input: target = 4, nums = [1,4,4]
	Output: 1
	Example 3:
	
	Input: target = 11, nums = [1,1,1,1,1,1,1,1]
	Output: 0
	 
	
	Constraints:
	
	1 <= target <= 109
	1 <= nums.length <= 105
	1 <= nums[i] <= 105
	 
	
	Follow up: If you have figured out the O(n) solution, try coding another solution of which the time complexity is O(n log(n)).
	 */
	
	public int minSubArrayLen(int s, int[] nums) {
		int i = 1, j = nums.length, min = 0;
		while (i <= j) {
			int mid = (i + j) / 2;
			if (windowExist(mid, nums, s)) {
				j = mid - 1;
				min = mid;
			} else
				i = mid + 1;
		}
		return min;
	}

	private boolean windowExist(int size, int[] nums, int s) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (i >= size)
				sum -= nums[i - size];
			sum += nums[i];
			if (sum >= s)
				return true;
		}
		return false;
	}

}
