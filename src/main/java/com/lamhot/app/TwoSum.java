package com.lamhot.app;

import java.util.HashMap;

public class TwoSum {

	public int[] twoSum(int[] input, int sum) {
		// o(n)
		if (input == null || input.length <= 0)
			return null;

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < input.length; i++) {
			int left = sum - input[i];
			if (hm.containsValue(left))
				return new int[] { left, input[i] };
			hm.put(i, input[i]);
		}

		return new int[] {};

	}

	public int[] twoSum2(int[] input, int sum) {
		// o(n * log n)
		if (input == null || input.length <= 0)
			return null;
		int left = 0;
		int right = input.length - 1;
		while (left < right) {
			if (input[left] + input[right] == sum) {
				return new int[] { input[left], input[right] };
			} else if (input[left] + input[right] < sum) {
				left++;
			}
			right--;
		}

		return new int[] {};

	}

	public int[] twoSum3(int[] input, int sum) {
		// o (n *2)
		if (input == null || input.length <= 0)
			return null;

		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if (input[i] + input[j] == sum) {
					return new int[] { input[i], input[j] };
				}
			}

		}
		return new int[] {};

	}

}
