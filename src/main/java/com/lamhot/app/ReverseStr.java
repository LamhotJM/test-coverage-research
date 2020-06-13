package com.lamhot.app;

public class ReverseStr {

	public String reverseString(String input) {
		if (input == null || input.length() <= 0)
			return input;
		StringBuilder sb = new StringBuilder();
		for (int i = input.length() - 1; i >= 0; i--) {
			sb.append(input.charAt(i));

		}
		return sb.toString();
	}

}
