package com.lamhot.app;

public class Polindrom {

	public boolean isPalindrome(int input) {
		if (input <= 0) {
			throw new IllegalArgumentException("should greater > 0");
		}

		int num = input;
		int result = 0;

		while (num != 0) {
			result = result * 10 + num % 10;
			num /= 10;

		}
		if (result != input) {
			return false;
		}

		return true;

	}

	public static void main(String[] args) {
		Polindrom pol = new Polindrom();
		System.out.println(pol.isPalindrome(1214));

	}

}
