package com.lamhot.app.practice;

import java.util.Arrays;
import java.util.List;

class StringWithSwaps {

	public static void main(String args[]) {
		StringWithSwaps ob = new StringWithSwaps();
	

		String s = "dcab";
		List<List<Integer>> pairs = Arrays.asList(Arrays.asList(0, 3), Arrays.asList(1, 2));
		System.out.println(ob.smallestStringWithSwaps(s, pairs));
		// Input: s = "dcab", pairs = [[0,3],[1,2],[0,2]]
		// Output: "abcd"
		pairs = Arrays.asList(Arrays.asList(0, 3), Arrays.asList(1, 2), Arrays.asList(0, 2));
		System.out.println(ob.smallestStringWithSwaps(s, pairs));

	}

	public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
		return null;

		///
		// bcad
		// bacd
	}
}