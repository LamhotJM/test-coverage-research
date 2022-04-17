package com.lamhot.app.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String args[]) {

		TwoSum ob = new TwoSum();
		int[] input = { 5, 9, 3, 1, 2 };
		System.out.println(Arrays.toString(ob.twoSum2(input, 7)));

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

	/*
	 * 
	 */
	private int[] twoSum2(int[] input, int target) {
		Map<Integer, Integer> map = new HashMap<>();

		int temp;
		int ret[] = new int[2]; // the array that would be return

		for (int i = 0; i < input.length; i++) {
			temp = target - input[i];
			if (map.containsKey(temp)) {
				ret[0] = map.get(temp);;
				ret[1] = i;
				
				return ret;
			}

			map.put(input[i], i);

		}

		return input;
	}

}
