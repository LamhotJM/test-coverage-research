package com.lamhot.app.leetcode;

import java.util.HashMap;

public class LonggestWords {

	public static void main(String args[]) {

		String[] words = { "a", "banana", "app", "appl", "ap", "apply", "apple" };
		LonggestWords test = new LonggestWords();
		System.out.print(test.longestWord(words));

	}

	private class TrieNode {
		HashMap<Character, TrieNode> children = new HashMap<>();
		int index = -1;

		public TrieNode() {
		}

		public TrieNode(char c) {
		}
	}

	private class Trie {

		TrieNode root;

		public Trie() {
			this.root = new TrieNode();
		}

		public void insert(String word, int index) {
			TrieNode curr = root;
			HashMap<Character, TrieNode> children = curr.children;

			for (int i = 0; i < word.length(); i++) {
				char ch = word.charAt(i);
				if (children.containsKey(ch)) {
					curr = children.get(ch);
				} else {
					TrieNode newNode = new TrieNode(ch);
					children.put(ch, newNode);
					curr = newNode;
				}
				children = curr.children;

				if (i == word.length() - 1)
					curr.index = index;
			}
		}

		private TrieNode getRoot() {
			return root;
		}
	}

	// second approach to DFS. Recall the method.
	private String dfs(TrieNode root, TrieNode curr, String[] words, String longestWord) {

		if (curr.index >= 0) {
			String currWord = words[curr.index];
			if (currWord.length() > longestWord.length()
					|| (currWord.length() == longestWord.length() && currWord.compareTo(longestWord) < 0))
				longestWord = currWord;
		}

		for (TrieNode n : curr.children.values()) {
			if (n.index < 0)
				continue;
			String currWord = dfs(root, n, words, longestWord);
			if (currWord.length() > longestWord.length()
					|| (currWord.length() == longestWord.length() && currWord.compareTo(longestWord) < 0))
				longestWord = currWord;
		}

		return longestWord;
	}

	public String longestWord(String[] words) {
		// build a Trie
		Trie trie = new Trie();
		for (int i = 0; i < words.length; i++)
			trie.insert(words[i], i);

		// return dfs(trie.getRoot(), words);
		return dfs(trie.getRoot(), trie.getRoot(), words, "");
	}

}
