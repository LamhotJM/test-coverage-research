package com.lamhot.app.practice;

public class ReverseStringMod {
	public String reverse(String input) {
		if (input == null || input.length() <= 0) {
			return null;
		}

		String[] temp = new String[100];
		temp = input.trim().split(" ");
		StringBuilder sb = new StringBuilder();
		for (int y = temp.length - 1; y >= 0; y--) {
			if(y==0)
				sb.append(temp[y]);
			else
				sb.append(temp[y] + "*");

		}

		return sb.toString().trim();
	}

	public static void main(String[] args) {

		ReverseStringMod cd = new ReverseStringMod();
		System.out.println(cd.reverse("lamhot siagian adalah manusia yang rajin"));
		System.out.println(cd.reverse("example   good a"));
	}

}
