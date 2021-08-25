package com.lamhot.app.easy;

public class Q172FactorialTrailingZeroes {

	public static void main(String args[]) {

		Q172FactorialTrailingZeroes ob = new Q172FactorialTrailingZeroes();
		System.out.println(ob.trailingZeroes(7));
		System.out.println(ob.trailingZeroes(6));
		System.out.println(ob.trailingZeroes(5));

	}

	public int trailingZeroes2(int n) {

		int sum = 1;
		for (int i = 1; i <= n; i++) {
			sum = sum * i;

		}
		char[] chars = ("" + sum).toCharArray();

		int count = 0;
		for (char c : chars) {
			if (c == '0') {
				count++;

			}

		}

		return sum;

	}

	public int trailingZeroes(int n) {
		int count = 0;

		while (n > 0) {
			n = n / 5;
			count += n;
		}

		return count;

	}

}
