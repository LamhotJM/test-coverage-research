package com.lamhot.app.medium;

public class Q162_Find_Peak_Element {

	public static void main(String args[]) {
		Q162_Find_Peak_Element ob = new Q162_Find_Peak_Element();
		int nums[] = { 1, 2, 1, 3, 5, 6, 4 };
		System.out.println(ob.findPeakElement(nums));

	}

	public int findPeakElement(int[] nums) {

		int left = 0;
		int right = nums.length-1;
		int mid;

		while (left < right) {
			mid = left + (right - left) / 2;

			if (nums[mid] < nums[mid + 1]) {
				left = mid + 1;
			} else {
				right = mid;

			}
		}	
		return left;

	}

}
