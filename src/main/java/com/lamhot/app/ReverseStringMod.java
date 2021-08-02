package com.lamhot.app;

public class ReverseStringMod {
	public String reverse(String input) {
		if (input == null || input.length() <= 0) {
			return null;
		}

		String[] temp = new String[100];
		temp = input.split(" ");

		for (int i = temp.length - 1; i >= 0; i--) {
			if (i % 3 == 0) {
				String word = temp[i];
				StringBuilder tempb = new StringBuilder();
				for (int x = word.length() - 1; x >= 0; x--) {
					tempb.append(word.charAt(x));

				}
				temp[i] = tempb.toString();

			}
		}
		StringBuilder sb = new StringBuilder();
		for (int y = temp.length - 1; y >= 0; y--) {
			sb.append(temp[y] + " ");

		}

		return sb.toString();
	}

	public static void main(String[] args) {

		ReverseStringMod cd = new ReverseStringMod();
		System.out.println(cd.reverse("lamhot siagian adalah manusia yang rajin"));
	}

}
