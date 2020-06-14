package com.lamhot.app;

public class ReverseStr {

	public String reverse(String input) {
		if (input == null || input.length() <= 0)
			return input;
		char[] cr = input.toCharArray();
		int i = 0;
		int j = input.length() - 1;
		while (i < j) {
			swap(cr, i, j);
			i++;
			j--;
		}
		return new String(cr);
	}

	public static void swap(char[] a, int i, int j) {
		char temp = a[i];
		a[i] = a[j];
		a[j] = temp;

	}

	public String reverseString2(String input) {
		if (input == null || input.length() <= 0)
			return input;
		StringBuilder sb = new StringBuilder();
		for (int i = input.length() - 1; i >= 0; i--) {
			sb.append(input.charAt(i));

		}
		return sb.toString();
	}

}
