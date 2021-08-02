package com.lamhot.app.leetcode;

public class Palindrom {

	public static void main(String[] args) {
		System.out.println("A man, a plan, a canal: Panama. : " + isPalindrome("A man, a plan, a canal: Panama"));
	}

	public static boolean isPalindrome(String s) {

		String s1 = s.replaceAll("[^0-9a-zA-Z]", "").toLowerCase();
		char ch1;
		char ch2;
		for (int i = 0; i < s1.length() / 2; i++) {
			ch1 = s1.charAt(i);
			ch2 = s1.charAt(s1.length() - 1 - i);
			if (ch1 != ch2) {
				return false;
			}

		}
		return true;
	}

}
