package com.lamhot.app;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class ConsecutiveTest {

	Consecutive c;

	@Before
	public void setUp() throws Exception {
		c = new Consecutive();
	}

	@After
	public void tearDown() throws Exception {
		c = null;
	}

	@Test
	public void test1() {
		assertEquals(0, c.maxPower(null));

	}

	@Test
	public void test2() {
		assertEquals(2, c.maxPower("leetcode"));
	}

	@Test
	public void test3() {
		assertEquals(5, c.maxPower("abbcccddddeeeeedcba"));
	}

	@Test
	public void test4() {
		assertEquals(5, c.maxPower("triplepillooooow"));
	}

	@Test
	public void test5() {
		assertEquals(1, c.maxPower("tourist"));
	}

	@Test
	public void test6() {
		assertEquals(2, c.maxPower("counttheconsecutive"));
	}
	
	@Test
	public void test7() {
		assertEquals(2, c.maxPower("ccbccbb"));
	}
	
	@Test
	public void test8() {
		assertEquals(2, c.maxPower("cc"));
	}
	
	

}
