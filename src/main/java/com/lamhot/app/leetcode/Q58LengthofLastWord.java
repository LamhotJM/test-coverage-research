package com.lamhot.app.leetcode;

public class Q58LengthofLastWord {

	public static void main(String args[]) {
		Q58LengthofLastWord ob = new Q58LengthofLastWord();
		System.out.println(ob.lengthOfLastWord("   fly me   to   the moon  "));

	}

	public int lengthOfLastWord(String s) {
		if (s == null || s.length() <= 0) {
			return -1;
		}

		int n = s.length();
		int res = 0;

		while (n > 0) {
			if (s.charAt(--n) != ' ') {
				res++;
			} else if (res > 0)
				return res;
		}

		return res;
	}

}
