package com.lamhot.app.leetcode;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Q20ValidParenthesesTest {
	
	Q20ValidParentheses vp;
	
	@Before
	public void setUp() throws Exception
	{
		
		vp = new Q20ValidParentheses();
	}
	
	@After
	public void tearDown() throws Exception{
		
		vp=null;
	}

	@Test
	public void test() {
		String input = "{}";
		
		assertEquals(vp.isValid(input), true);
	}
	
	@Test
	public void testFail()
	{
		String input = "(]";
		assertEquals(vp.isValid(input), false);
	}

}
