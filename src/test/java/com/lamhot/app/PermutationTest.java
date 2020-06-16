package com.lamhot.app;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PermutationTest {

	Permutation po;

	@Before
	public void setUp() throws Exception {
		po = new Permutation();
	}

	@After
	public void tearDown() throws Exception {
		po = null;
	}

	@Test
	public void testNull() {

		assertEquals(null, po.permutation(null));

	}

	@Test
	public void test2DiffrentAlfabet() {
		List<String> expected = Arrays.asList("ab", "ba");
		assertEquals(expected, po.permutation("ab"));
	}

	@Test
	public void test3DiffrentAlfabet() {

		List<String> expected = Arrays.asList("abc", "acb", "bac", "bca", "cab", "cba");
		assertEquals(expected, po.permutation("abc"));
	}

}
