package prep60.hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q12_49GroupAnagrams {
	/*
	 * 49. Group Anagrams
	 * 
	 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.

	An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
	
	 
	
	Example 1:
	
	Input: strs = ["eat","tea","tan","ate","nat","bat"]
	Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
	Example 2:
	
	Input: strs = [""]
	Output: [[""]]
	Example 3:
	
	Input: strs = ["a"]
	Output: [["a"]]
	 
	
	Constraints:
	
	1 <= strs.length <= 104
	0 <= strs[i].length <= 100
	strs[i] consists of lowercase English letters.
	 */
	
	 public List<List<String>> groupAnagrams(String[] strs) {
	        if (strs.length == 0) {
	            return new ArrayList();
	        }
	        
	        Map<String, List> result = new HashMap<String, List>();
	        for (String str : strs) {
	            char[] ca = str.toCharArray();
	            Arrays.sort(ca);
	            String sorted = String.valueOf(ca);
	            
	            if (!result.containsKey(sorted)) {
	                result.put(sorted, new ArrayList());
	            }
	            result.get(sorted).add(str);
	        }
	        
	        return new ArrayList(result.values());
	    }

}
