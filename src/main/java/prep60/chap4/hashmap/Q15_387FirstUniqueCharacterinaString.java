package prep60.chap4.hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Q15_387FirstUniqueCharacterinaString {
	/*
	 * 387. First Unique Character in a String
	 * 
	 * Given a string s, find the first non-repeating character in it and return its
	 * index. If it does not exist, return -1.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: s = "leetcode" Output: 0 Example 2:
	 * 
	 * Input: s = "loveleetcode" Output: 2 Example 3:
	 * 
	 * Input: s = "aabb" Output: -1
	 * 
	 * 
	 * Constraints:
	 * 
	 * 1 <= s.length <= 105 s consists of only lowercase English letters.
	 */

	public static void main(String args[]) {
		Q15_387FirstUniqueCharacterinaString ob = new Q15_387FirstUniqueCharacterinaString();
		System.out.println(ob.firstUniqChar("loveleetcode"));

	}

	public int firstUniqChar(String s) {
		HashMap<Character, Integer> set = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {

			if (set.containsKey(s.charAt(i))) {
				int val = set.get(s.charAt(i));
				set.put(s.charAt(i), val + 1);

			} else {
				set.put(s.charAt(i), 1);
			}

		}
		System.out.println(set.toString());
		for (int b = 0; b < s.length(); b++) {
			if (set.get(s.charAt(b)) == 1) {
				return b;

			}

		}

		return -1;

	}

}
