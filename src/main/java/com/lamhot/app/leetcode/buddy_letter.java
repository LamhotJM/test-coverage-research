package com.lamhot.app.leetcode;

public class buddy_letter {
	public static void main(String args[]) {
		buddy_letter ob = new buddy_letter();
		String A = "aaaaaaabc";
		String B = "aaaaaaacb";
		System.out.print(ob.buddyStrings(A, B));

	}

	public boolean buddyString(String A, String B) {
		char a;
		char b;
		int len = B.length();

		for (int i = 0; i < len / 2; i++) {
			a = A.charAt(i);
			b = B.charAt(len - 1 - i);
			if (a != b) {
				return false;
			}
		}
		return true;

	}

	public boolean buddyStrings(String A, String B) {
		if (A.length() != B.length())
			return false;
		if (A.equals(B)) {
			int[] count = new int[26];
			for (int i = 0; i < A.length(); ++i)
				count[A.charAt(i) - 'a']++;

			for (int c : count)
				if (c > 1)
					return true;
			return false;
		} else {
			int first = -1, second = -1;
			for (int i = 0; i < A.length(); ++i) {
				if (A.charAt(i) != B.charAt(i)) {
					if (first == -1)
						first = i;
					else if (second == -1)
						second = i;
					else
						return false;
				}
			}

			return (second != -1 && A.charAt(first) == B.charAt(second) && A.charAt(second) == B.charAt(first));
		}
	}

}
