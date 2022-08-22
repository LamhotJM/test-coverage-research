package com.lamhot.app;

public class MoreSum {
	public int[] treeSum(int[] input, int target) {
		// n(n*log n)
		if (input == null) {
			return null;
		}
		if (input.length <= 0) {
			return new int[] {};
		}

		int right = input.length - 1;
		int left = 0;
		int temp = 1;

		while (left < right) {

			if (input[left] + input[temp] + input[right] == target) {
				return new int[] { input[left], input[temp], input[right] };
			} else if (input[left] + input[temp] + input[right] < target) {
				temp = left + 1;
				left++;
			}
			right--;
		}
		return new int[] {};
	}
}
