package prep60.chap8.binary_search;

public class Q43_33_Search_in_Rotated_Sorted_Array {
	/*
	 * 33. Search in Rotated Sorted Array
	 * There is an integer array nums sorted in ascending order (with distinct values).

	Prior to being passed to your function, nums is rotated at an unknown pivot index k (0 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
	
	Given the array nums after the rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
	
	You must write an algorithm with O(log n) runtime complexity.
	
	 
	
	Example 1:
	
	Input: nums = [4,5,6,7,0,1,2], target = 0
	Output: 4
	Example 2:
	
	Input: nums = [4,5,6,7,0,1,2], target = 3
	Output: -1
	Example 3:
	
	Input: nums = [1], target = 0
	Output: -1
	 
	
	Constraints:
	
	1 <= nums.length <= 5000
	-104 <= nums[i] <= 104
	All values of nums are unique.
	nums is guaranteed to be rotated at some pivot.
	-104 <= target <= 104

	 */
	
	public int search(int[] nums, int target) {
		int start = 0, end = nums.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (nums[mid] == target)
				return mid;
			else if (nums[mid] >= nums[start]) {
				if (target >= nums[start] && target < nums[mid])
					end = mid - 1;
				else
					start = mid + 1;
			} else {
				if (target <= nums[end] && target > nums[mid])
					start = mid + 1;
				else
					end = mid - 1;
			}
		}
		return -1;
	}

}
