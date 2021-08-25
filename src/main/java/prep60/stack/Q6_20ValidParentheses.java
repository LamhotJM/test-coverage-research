package prep60.stack;

import java.util.Stack;

public class Q6_20ValidParentheses {
	/*
	 * 20. Valid Parentheses 
	 * 
	 * Given a string s containing just the characters '(',
	 * ')', '{', '}', '[' and ']', determine if the input string is valid.
	 * 
	 * An input string is valid if:
	 * 
	 * Open brackets must be closed by the same type of brackets. Open brackets must
	 * be closed in the correct order.
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: s = "()" Output: true Example 2:
	 * 
	 * Input: s = "()[]{}" Output: true Example 3:
	 * 
	 * Input: s = "(]" Output: false Example 4:
	 * 
	 * Input: s = "([)]" Output: false Example 5:
	 * 
	 * Input: s = "{[]}" Output: true
	 * 
	 * 
	 * Constraints:
	 * 
	 * 1 <= s.length <= 104 s consists of parentheses only '()[]{}'.
	 * 
	 */
	
	 public boolean isValid(String s) {
	        
	      if (s.length() % 2 != 0) {
				return false;
			}

			Stack<Character> x = new Stack();

			for (char c : s.toCharArray()) {
				if (c == '[' || c == '(' || c == '{') {
					x.push(c);
				} else if (c == ']' && !x.isEmpty() && x.peek() == '[')
	            {
					x.pop();
	            }
				else if (c == ')' && !x.isEmpty() && x.peek() == '(')
	            {
					x.pop();
	            }
				else if (c == '}' && !x.isEmpty() && x.peek() == '{') {
					x.pop();
				}else{
	                return false;
	            }

			}
			return x.isEmpty();
		}

}
