package com.lamhot.app;

import java.util.Arrays;

public class DecompressRLElis {

	public int[] decompressRLElist(int[] nums) {

		int sum = 0;
		for (int a = 0; a < nums.length; a += 2) {
			sum += nums[a];

		}

		int result[] = new int[sum];

		int counter = 0;
		for (int i = 0; i < nums.length; i++) {
			if (i % 2 == 0) {
				System.out.println("i.." + i);
				for (int j = 0; j < nums[i]; j++) {
					result[counter++] = nums[i + 1];

				}
			}
		}
		return result;
	}
}
