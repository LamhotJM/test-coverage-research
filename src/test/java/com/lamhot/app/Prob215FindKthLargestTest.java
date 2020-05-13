package com.lamhot.app;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Prob215FindKthLargestTest {

	Prob215FindKthLargest lg;

	@Before
	public void setUp() {
		lg = new Prob215FindKthLargest();

	}

	@Test
	public void testPositiveInput() {
		int[] input = { 3, 2, 1, 5, 6, 4 };

		assertEquals(5, lg.findKthLargest(input, 2));
	}

}
