package com.lamhot.app.practice;

class ArraySign {

	public static void main(String args[]) {

		ArraySign ob = new ArraySign();

		int input[] = { -1, -2, -3, -4, 3, 2, 1 };
		System.out.println(ob.arraySign(input));

	}

	public int arraySign(int[] nums) {

		int count = 0;
		for (int i : nums) {
			if (i == 0) {
				return 0;
			} else if (i < 0) {
				count++;

			}
		}

		return count % 2 == 0 ? 1 : -1;

	}
}