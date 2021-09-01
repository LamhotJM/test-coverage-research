package prep60.dynamic_programming;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q39_139_Word_Break {
	/*
	 * 139. Word Break
	 * 
	 * Given a string s and a dictionary of strings wordDict, return true if s can be segmented into a space-separated sequence of one or more dictionary words.

	Note that the same word in the dictionary may be reused multiple times in the segmentation.
	
	 
	
	Example 1:
	
	Input: s = "leetcode", wordDict = ["leet","code"]
	Output: true
	Explanation: Return true because "leetcode" can be segmented as "leet code".
	Example 2:
	
	Input: s = "applepenapple", wordDict = ["apple","pen"]
	Output: true
	Explanation: Return true because "applepenapple" can be segmented as "apple pen apple".
	Note that you are allowed to reuse a dictionary word.
	Example 3:
	
	Input: s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
	Output: false
	 
	
	Constraints:
	
	1 <= s.length <= 300
	1 <= wordDict.length <= 1000
	1 <= wordDict[i].length <= 20
	s and wordDict[i] consist of only lowercase English letters.
	All the strings of wordDict are unique.

	 */
	
	public boolean wordBreak(String s, List<String> wordDict) {
		Set<String> wordDictSet = new HashSet<String>(wordDict);
		boolean[] dp = new boolean[s.length() + 1];

		dp[0] = true;
		for (int end = 1; end <= s.length(); end++) {
			for (int start = 0; start < end; start++) {
				if (dp[start] && wordDictSet.contains(s.substring(start, end))) {
					dp[end] = true;
					break;
				}
			}
		}

		return dp[s.length()];
	}

}
