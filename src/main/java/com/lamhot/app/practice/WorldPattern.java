package com.lamhot.app.practice;

import java.util.HashMap;
import java.util.Map;

public class WorldPattern {

	public static void main(String ars[]) {
		WorldPattern ob = new WorldPattern();
		System.out.println(ob.wordPattern("abba", "dog cat cat dog"));
		System.out.println(ob.wordPattern("abba", "dog dog dog dog"));
	}

	public boolean wordPattern(String pattern, String s) {
		String arr[] = s.split(" ");
		if (pattern.length() != arr.length) {
			return false;
		}

		Map<Character, String> map = new HashMap<Character, String>();

		for (int i = 0; i < pattern.length(); i++) {
			if (map.containsKey(pattern.charAt(i))) {
				if (!map.get(pattern.charAt(i)).equals(arr[i])) {
					return false;
				}
			} else {
				if (map.containsValue((arr[i]))) {
					return false;
				}
				map.put(pattern.charAt(i), arr[i]);
			}
		}
		return true;

	}

}
