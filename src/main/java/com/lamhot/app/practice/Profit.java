package com.lamhot.app.practice;

public class Profit {

	public static void main(String args[]) {
		Profit ob = new Profit();
		int input[] = { 7, 1, 5, 3, 6, 4 };
		System.out.println(ob.profit(input));
	}

	private int profit(int[] price) {

		if (price.length < 0 || price.equals(null)) {
			return 0;
		}

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < price.length; i++) {

			if (price[i] <= min) {
				min = price[i];
			}
			if (price[i] - min > max) {
				max = price[i] - min;
			}

		}

		return max;
	}

}
