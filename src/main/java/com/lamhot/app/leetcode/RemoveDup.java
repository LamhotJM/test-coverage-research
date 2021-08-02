package com.lamhot.app.leetcode;

public class RemoveDup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RemoveDup ob = new RemoveDup();
		int[] x = { 1,2,11,12,2,2,2 };
		System.out.print(ob.removeDuplicates(x));

	}

	public int removeDuplicates(int[] nums) {

		if (nums.length == 0)
			return 0;
		int i = 0;
		for (int j = 1; j < nums.length; j++) {
			if (nums[j] != nums[i]) {
				i++;
				nums[i] = nums[j];
			}
		}
		return i + 1;

	}

}
