package com.lamhot.app;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Prob692TopKFrequentWords {

	public List<String> topKFrequent(String[] words, int k) {

		Map<String, Integer> wordsMapped = new TreeMap<>();
        for (String word : words) {
            wordsMapped.put(word, wordsMapped.getOrDefault(word, 0) + 1);
        }

        return wordsMapped.entrySet()
                .stream()
                .sorted(Comparator.comparingInt(entry -> - 1 * entry.getValue()))
                .limit(k)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

	}

}
