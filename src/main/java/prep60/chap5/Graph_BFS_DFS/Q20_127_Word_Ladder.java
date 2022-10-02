package prep60.chap5.Graph_BFS_DFS;

import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.*;

public class Q20_127_Word_Ladder {
	/*
	 * 127. Word Ladder
	 * 
	 * A transformation sequence from word beginWord to word endWord using a
	 * dictionary wordList is a sequence of words beginWord -> s1 -> s2 -> ... -> sk
	 * such that:
	 * 
	 * Every adjacent pair of words differs by a single letter. Every si for 1 <= i
	 * <= k is in wordList. Note that beginWord does not need to be in wordList. sk
	 * == endWord Given two words, beginWord and endWord, and a dictionary wordList,
	 * return the number of words in the shortest transformation sequence from
	 * beginWord to endWord, or 0 if no such sequence exists.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: beginWord = "hit", endWord = "cog", wordList =
	 * ["hot","dot","dog","lot","log","cog"] Output: 5 Explanation: One shortest
	 * transformation sequence is "hit" -> "hot" -> "dot" -> "dog" -> cog", which is
	 * 5 words long. Example 2:
	 * 
	 * Input: beginWord = "hit", endWord = "cog", wordList =
	 * ["hot","dot","dog","lot","log"] Output: 0 Explanation: The endWord "cog" is
	 * not in wordList, therefore there is no valid transformation sequence.
	 * 
	 * 
	 * Constraints:
	 * 
	 * 1 <= beginWord.length <= 10 endWord.length == beginWord.length 1 <=
	 * wordList.length <= 5000 wordList[i].length == beginWord.length beginWord,
	 * endWord, and wordList[i] consist of lowercase English letters. beginWord !=
	 * endWord All the words in wordList are unique.
	 * 
	 */

	public int ladderLength(String beginWord, String endWord, List<String> wordList) {
		if (wordList.size() == 0) {
			return 0;
		}

		Set<String> dict = new HashSet<>();

		for (String word : wordList) {
			dict.add(word);
		}

		Queue<String> queue = new LinkedList<>();
		queue.add(beginWord);

		Set<String> visited = new HashSet<>();
		visited.add(beginWord);

		int len = 1;

		while (!queue.isEmpty()) {
			int size = queue.size();

			for (int i = 0; i < size; i++) {
				String curWord = queue.remove();

				if (curWord.equals(endWord)) {
					return len;
				}

				char[] letters = curWord.toCharArray();
				for (int j = 0; j < curWord.length(); j++) {
					char oldC = letters[j];
					for (char c = 'a'; c <= 'z'; c++) {
						letters[j] = c;

						String nextWord = new String(letters);

						if (dict.contains(nextWord) && !visited.contains(nextWord)) {
							visited.add(nextWord);
							queue.add(nextWord);
							dict.remove(nextWord);
						}
					}
					letters[j] = oldC;
				}
			}
			++len;
		}
		return 0;
	}

	public int ladderLength2(String beginWord, String endWord, List<String> wordList) {
		if (wordList.size() == 0) {
			return 0;
		}

		Set<String> dict = new HashSet<>();

		for (String word : wordList) {
			dict.add(word);
		}

		if (!dict.contains(endWord)) {
			return 0;
		}

		Set<String> visited = new HashSet<>();
		Set<String> begin = new HashSet<>();
		Set<String> end = new HashSet<>();

		begin.add(beginWord);
		end.add(endWord);

		int len = 1;

		while (!begin.isEmpty() && !end.isEmpty()) {
			if (begin.size() > end.size()) {
				Set<String> set = begin;
				begin = end;
				end = set;
			}

			Set<String> temp = new HashSet<>();

			for (String word : begin) {
				char[] letters = word.toCharArray();

				for (int i = 0; i < letters.length; i++) {
					char oldC = letters[i];

					for (char c = 'a'; c <= 'z'; c++) {
						letters[i] = c;

						String nextWord = new String(letters);

						if (end.contains(nextWord)) {
							return len + 1;
						}

						if (dict.contains(nextWord) && !visited.contains(nextWord)) {
							visited.add(nextWord);
							temp.add(nextWord);
						}
					}
					letters[i] = oldC;
				}
			}
			++len;
			begin = temp;
		}
		return 0;
	}

}
