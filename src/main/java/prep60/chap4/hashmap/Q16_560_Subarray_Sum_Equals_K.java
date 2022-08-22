package prep60.chap4.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Q16_560_Subarray_Sum_Equals_K {
	/*
	 * 560. Subarray Sum Equals K
	 * 
	 * Given an array of integers nums and an integer k, return the total number of
	 * continuous subarrays whose sum equals to k.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: nums = [1,1,1], k = 2 Output: 2 Example 2:
	 * 
	 * Input: nums = [1,2,3], k = 3 Output: 2
	 * 
	 * 
	 * Constraints:
	 * 
	 * 1 <= nums.length <= 2 * 104 -1000 <= nums[i] <= 1000 -107 <= k <= 107
	 */

	public static void main(String[] args) {
		// write your code here

		Q16_560_Subarray_Sum_Equals_K ob = new Q16_560_Subarray_Sum_Equals_K();
		int[] nums = { 1, 2, 3 };
		System.out.println(ob.subarraySum(nums, 3));
	}

	public int subarraySum(int[] nums, int k) {
		int sum = 0, result = 0;
		Map<Integer, Integer> preSum = new HashMap<>();
		preSum.put(0, 1);

		for (int i = 0; i < nums.length; i++) {
			// sum = 1
			sum += nums[i];
			// if map contains key 1-
			int search = sum - k;
			if (preSum.containsKey(search)) {
				result += preSum.get(sum - k);
			}
			preSum.put(sum, preSum.getOrDefault(sum, 0) + 1);
		}

		System.out.println(preSum);

		return result;
	}

}
