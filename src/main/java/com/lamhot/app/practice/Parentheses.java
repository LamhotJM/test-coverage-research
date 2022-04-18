package com.lamhot.app.practice;

import java.util.Stack;

public class Parentheses {

	public static void main(String args[]) {
		Parentheses ob = new Parentheses();
		String input = "{}";
		System.out.println(ob.isValid(input));

	}

	private boolean isValid(String input) {
		if (input.length() % 2 != 0 || input.length() <= 0) {
			return false;
		}

		Stack<Character> ch = new Stack();

		for (char c : input.toCharArray()) {
			if (c == '(' || c == '{' || c == '[') {
				ch.push(c);
			}
			
			if (c == ')' && !ch.isEmpty() && ch.peek() == '(') {
				ch.pop();
			} else if (c == '}' && !ch.isEmpty() && ch.peek() == '{') {
				ch.pop();
			} else if (c == ']' && !ch.isEmpty() && ch.peek() == '[') {
				ch.pop();

			}

		}

		return ch.isEmpty();
	}
}
