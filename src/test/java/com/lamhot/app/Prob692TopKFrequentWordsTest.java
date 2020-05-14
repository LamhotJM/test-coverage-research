package com.lamhot.app;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Prob692TopKFrequentWordsTest {

	Prob692TopKFrequentWords topfreq;

	@Before
	public void setUp() {
		topfreq = new Prob692TopKFrequentWords();
	}

	@Test
	public void test() {
		String input[] = { "i", "love", "leetcode", "i", "love", "coding" };

		String[] expecteds = { "i", "love" };

		Assert.assertArrayEquals(expecteds, topfreq.topKFrequent(input, 2).toArray());
	}
	
	@Test
	public void test2() {
		String input[] = { "the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is" };

		String[] expecteds = { "the", "is", "sunny", "day" };

		Assert.assertArrayEquals(expecteds, topfreq.topKFrequent(input, 4).toArray());
	}

}
