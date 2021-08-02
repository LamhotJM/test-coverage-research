package com.lamhot.app.leetcode;

import java.util.HashMap;

public class first_unique {

	public static void main(String arrgs[]) {

		first_unique x = new first_unique();
		System.out.println(x.firstUniqChar("leetcode"));
		System.out.println(x.firstUniqChar("loveleetcode"));
	
	}

	public int firstUniqChar(String s) {
		HashMap<Character, Integer> x = new HashMap<Character, Integer>();
		char ch;
		int i;
		for (i = 0; i < s.length(); i++) {
		ch=s.charAt(i);
		x.put(ch, x.getOrDefault(ch, 0)+1);
		
		}
		for (i = 0; i < x.size(); i++) {
			if (x.get(s.charAt(i)) == 1)
				return i;
		}
		return -1;
	}


}
