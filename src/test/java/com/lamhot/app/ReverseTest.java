package com.lamhot.app;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ReverseTest {

	ReverseStr ob;

	@Before
	public void setUp() throws Exception {
		ob = new ReverseStr();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1() {
		String expect = "";
		String result = ob.reverseString("");
		assertEquals(expect, result);

	}

	@Test
	public void test2() {
		String expect = null;
		String result = ob.reverseString(null);
		assertEquals(expect, result);

	}

	@Test
	public void test3() {
		String expect = "tohmal";
		String result = ob.reverseString("lamhot");
		assertEquals(expect, result);

	}

}
