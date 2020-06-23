package com.lamhot.app;

public class Consecutive {

	public int maxPower(String s) {
		if (s == null || s.length() <= 0)
			return 0;

		char curr = s.charAt(0);
		int maxPower = 1;
		int length = 1;
		for (int i = 1; i < s.length(); i++) {
			if (curr == s.charAt(i))
				length++;
			else
				length = 1;
			maxPower = Math.max(maxPower, length);

			curr = s.charAt(i);

		}
		return maxPower;

	}

}
