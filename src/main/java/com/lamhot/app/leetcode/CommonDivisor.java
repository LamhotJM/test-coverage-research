package com.lamhot.app.leetcode;

public class CommonDivisor {

	public static void main(String[] args) {

		CommonDivisor cd = new CommonDivisor();
		System.out.println(cd.gcdOfStrings("ABABABAB", "ABAB"));
	}

	public String gcdOfStrings(String str1, String str2) {
		int count = 0;
		if (str1.length() > str2.length())
			return gcdOfStrings(str2, str1);
		else if (!str2.startsWith(str1))
			return "";
		else if (str1.isEmpty())
			return str2;
		else
			count++;
		System.out.println(count);
		return gcdOfStrings(str1, str2.substring(str1.length()));

	}
}
