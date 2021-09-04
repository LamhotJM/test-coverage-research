package prep60.greedy_backtracking;

import java.util.ArrayList;
import java.util.List;

public class Q53_22_Generate_Parentheses {
	/*
	 * 22. Generate Parentheses
	 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

	Example 1:
	
	Input: n = 3
	Output: ["((()))","(()())","(())()","()(())","()()()"]
	Example 2:
	
	Input: n = 1
	Output: ["()"]
	 
	
	Constraints:
	
	1 <= n <= 8

	 */
	public List<String> generateParenthesis(int n) {
		List<String> ans = new ArrayList<>();
		backtrack(ans, "", 0, 0, n);
		return ans;
	}

	public void backtrack(List<String> ans, String cur, int leftNum, int rightNum, int maxNum) {
		if (cur.length() == maxNum * 2) {
			ans.add(cur);
			return;
		}
		if (leftNum < maxNum)
			backtrack(ans, cur + "(", leftNum + 1, rightNum, maxNum);
		if (rightNum < leftNum)
			backtrack(ans, cur + ")", leftNum, rightNum + 1, maxNum);
	}

}
