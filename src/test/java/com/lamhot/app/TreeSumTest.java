package com.lamhot.app;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TreeSumTest {

	MoreSum ts;

	@Before
	public void setUp() throws Exception {
		ts = new MoreSum();
	}

	@After
	public void tearDown() throws Exception {
		ts = null;
	}

	@Test
	public void testNull() {

		int[] expect = null;
		int[] input = null;

		assertEquals(expect, ts.treeSum(input, 0));

	}

	@Test
	public void testValid() {

		int[] expect = { 2, 3, 5 };
		int[] input = { 2, 3, 4, 5, 6, 7 };

//	System.out.println("debug" + Arrays.toString(ts.treeSum(input,10)));

		assertArrayEquals(expect, ts.treeSum(input, 10));

	}

	@Test
	public void testValidNotFound() {

		int[] expect = {};
		int[] input = { 2, 3, 4, 5, 6, 7 };

		assertArrayEquals(expect, ts.treeSum(input, 100));

	}

//	@Test
//	public void testInvalidMoreThanOne() {
//
//		int[] expect = { 2, 3, 5 };
//		int[] input = { 2, 3, 4, 5, 1, 4 };
//
//		Assert.assertArrayEquals(expect, ts.treeSum(input, 10));
//
//	}

}
