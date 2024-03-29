package com.lamhot.app.leetcode;

import java.util.Stack;

public class Q20ValidParentheses {

	public static void main(String args[]) {
		Q20ValidParentheses pt = new Q20ValidParentheses();
		System.out.println(pt.isValid("{}"));
		System.out.println(pt.isValid("{}}"));
		System.out.println(pt.isValid("()[]{}()"));

	}

	public boolean isValid(String s) {
		if (s.length() % 2 != 0) {
			return false;
		}

		Stack<Character> x = new Stack<Character>();

		for (char c : s.toCharArray()) {
			if (c == '[' || c == '(' || c == '{') {
				x.push(c);
			} else if (c == ']' && !x.isEmpty() && x.peek() == '[') {
				x.pop();
			} else if (c == ')' && !x.isEmpty() && x.peek() == '(') {
				x.pop();
			} else if (c == '}' && !x.isEmpty() && x.peek() == '{') {
				x.pop();
			} else {
				return false;
			}

		}
		return x.isEmpty();
	}
}
