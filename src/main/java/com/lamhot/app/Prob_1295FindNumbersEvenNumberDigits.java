package com.lamhot.app;

public class Prob_1295FindNumbersEvenNumberDigits {

	public int findNumbers(int[] nums) {

		int counter = 0;
		for (int i = 0; i < nums.length; i++) {
			int count = 0;
			while (nums[i] != 0)

			{
				nums[i] /= 10;
				++count;
			}

			if (count % 2 == 0) {
				counter++;
			}

		}

		return counter;

	}

}
