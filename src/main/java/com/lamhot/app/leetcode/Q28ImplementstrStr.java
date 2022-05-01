package com.lamhot.app.leetcode;

public class Q28ImplementstrStr {

	public static void main(String args[]) {
		Q28ImplementstrStr obj = new Q28ImplementstrStr();

		System.out.println(obj.strStr("hello", "llo"));
		// System.out.println(obj.strStr("", ""));

	}

	public int strStr(String haystack, String needle) {
		if (haystack.length() <= 0 && needle.length() <= 0)
			return 0;
		if (haystack.length() <= 0)
			return 0;

		if (haystack == null || needle == null)
			return -1;

		for (int i = 0; i < haystack.length() - 1; i++) {
			int x;
			for (x = 0; x < needle.length(); x++) {
				if (haystack.charAt(i + x) != needle.charAt(x)) {
					break;
				}
			}
			if (x == needle.length()) {
				return i;
			}

		}

		return -1;
	}
}
