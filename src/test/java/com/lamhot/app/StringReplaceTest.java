package com.lamhot.app;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StringReplaceTest {
	
	StringReplace sr;

	@Before
	public void setUp() throws Exception {
		sr = new StringReplace();
	}

	@After
	public void tearDown() throws Exception {
		sr = null;
	}
	
	@Test
	public void test1() {
		String input = "";
		String expected = "";
		assertEquals(sr.strReplace(input),expected);
	}
	
	@Test
	public void test2() {
		String input = null;
		String expected = null;
		assertEquals(sr.strReplace(input),expected);
	}

	@Test
	public void test3() {
		String input =    "Hello good morning Lamhot";
		String expected = "Hello good evening Lamhot";
		
		assertEquals(sr.strReplace(input),expected);
	}

}
