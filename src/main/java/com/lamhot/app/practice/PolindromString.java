package com.lamhot.app.practice;

public class PolindromString {

	public static void main(String[] argrs) {
		String sample = "lamhot";

		PolindromString ob = new PolindromString();
		System.out.print(ob.polindrom(sample));
	}

	private Boolean polindrom(String input) {
		StringBuilder sb = new StringBuilder();
		String result = sb.toString();
		char temp;
		for (int i = input.length() - 1; i >= 0; i--) {
			temp = input.charAt(i);
			sb.append(temp);
		}

		result = sb.toString();
		return input.equals(result);

	}

}
