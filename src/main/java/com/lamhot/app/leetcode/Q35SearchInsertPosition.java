package com.lamhot.app.leetcode;

public class Q35SearchInsertPosition {

	public static void main(String args[]) {

		Q35SearchInsertPosition ob = new Q35SearchInsertPosition();
		int[] arr = { 1, 2, 3, 5, 6 };
		System.out.println(ob.searchInsert(arr, 0));

	}

	public int searchInsert(int[] nums, int target) {
		if(nums.length<=0)
		{
			return -1;
		}

		int low = 0;
		int high = nums.length - 1;
		int mid;
		while (low <= high) {

			mid = low + (high - low) / 2;

			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		return low;

	}

}
