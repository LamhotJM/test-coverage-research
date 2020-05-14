package com.lamhot.app;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Prob692TopKFrequentWords {

	public List<String> topKFrequent(String[] words, int k) {

		TreeMap<String, Integer> hp = new TreeMap<String, Integer>();

		for (String word : words) {
			hp.put(word, hp.getOrDefault((word), 0) + 1);
		}

		List<String> values = hp.entrySet().stream().sorted((Map.Entry.<String, Integer>comparingByValue().reversed()))
				.map(Map.Entry::getKey).limit(k).collect(Collectors.toList());
		return values;

	}

}
