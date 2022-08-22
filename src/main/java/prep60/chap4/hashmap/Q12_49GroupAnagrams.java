package prep60.chap4.hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q12_49GroupAnagrams {
	/*
	 * 49. Group Anagrams
	 * 
	 * Given an array of strings strs, group the anagrams together. You can return
	 * the answer in any order.
	 * 
	 * An Anagram is a word or phrase formed by rearranging the letters of a
	 * different word or phrase, typically using all the original letters exactly
	 * once.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: strs = ["eat","tea","tan","ate","nat","bat"] Output:
	 * [["bat"],["nat","tan"],["ate","eat","tea"]] Example 2:
	 * 
	 * Input: strs = [""] Output: [[""]] Example 3:
	 * 
	 * Input: strs = ["a"] Output: [["a"]]
	 * 
	 * 
	 * Constraints:
	 * 
	 * 1 <= strs.length <= 104 0 <= strs[i].length <= 100 strs[i] consists of
	 * lowercase English letters.
	 */

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public ArrayList<List> groupAnagrams(String[] strs) {
		if (strs.length == 0) {
			return new ArrayList<List>();
		}

		Map<String, List> result = new HashMap<String, List>();
		for (String str : strs) {
			char[] charVar = str.toCharArray();
			Arrays.sort(charVar);
			String sorted = String.valueOf(charVar);

			if (!result.containsKey(sorted)) {
				result.put(sorted, new ArrayList());
			}
			result.get(sorted).add(str);
		}

		return new ArrayList<List>(result.values());
	}

}
