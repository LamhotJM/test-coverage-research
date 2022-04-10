package com.lamhot.app.practice;

import java.util.Arrays;

public class TwoSum {

	public static void main(String args[]) {

		TwoSum ob = new TwoSum();
		int[] input = { 5, 9, 3, 1, 2 };
		System.out.println(Arrays.toString(ob.twoSum(input, 7)));

	}

	private int[] twoSum(int[] input, int target) {

		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {

				if (target == input[j] + input[i]) {
					return new int[] { i, j };
				}

			}

		}

		return new int[] {};

	}

}
