package prep60.chap12.others;

public class Q54_283_Move_Zeroes {
	/*
	 * 283. Move Zeroes
	 * 
	 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

	Note that you must do this in-place without making a copy of the array.
	
	 
	
	Example 1:
	
	Input: nums = [0,1,0,3,12]
	Output: [1,3,12,0,0]
	Example 2:
	
	Input: nums = [0]
	Output: [0]
	 
	
	Constraints:
	
	1 <= nums.length <= 104
	-231 <= nums[i] <= 231 - 1

	 */
	
	public void moveZeroes(int[] nums) {
		if (nums == null || nums.length == 0) {
			return;
		}

		int nonZeroIndex = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				swap(nums, nonZeroIndex, i);
				++nonZeroIndex;
			}
		}
	}

	public void swap(int[] nums, int index1, int index2) {
		if (index1 == index2) {
			return;
		}

		int temp = nums[index1];
		nums[index1] = nums[index2];
		nums[index2] = temp;
	}

}
