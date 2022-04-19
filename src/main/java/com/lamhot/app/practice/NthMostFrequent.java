package com.lamhot.app.practice;

import java.util.HashMap;
import java.util.Map;

public class NthMostFrequent {

	public static void main(String args[]) {

	}

	private int mostFrequent(int[] input) {
		if (input == null || input.length < 0) {
			return 0;
		}
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int max = 0;
		for (int i = 0; i < input.length; i++) {
			if (map.containsKey(input[i])) {
				int val = map.get(input[i]);
				map.put(input[i], val + 1);

				if (val + 1 > max) {
					max = val + 1;
					
				}
			}
			{
				map.put(input[i], 1);
			}

		}

		return 0;
	}

}
