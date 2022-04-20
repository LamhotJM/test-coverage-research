package com.lamhot.app.practice;

public class RemoveDuplicates {

	public int removeDuplicate(int[] nums) {
		if (nums == null || nums.length <= 0) {
			return 0;
		}

		int index = 1;

		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] != nums[i + 1]) {
				nums[index++] = nums[i + 1];
			}
		}

		return index;
	}

}
