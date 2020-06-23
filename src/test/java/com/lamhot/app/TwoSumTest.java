package com.lamhot.app;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TwoSumTest {

	
	Sum ts;
	@Before
	public void setUp() throws Exception {
		ts = new Sum();
	}

	@After
	public void tearDown() throws Exception {
		ts = null;
	}
	
	@Test
	public void testNull() {
		int [] input =  null;
		int [] expect = null;
		Assert.assertArrayEquals(expect,ts.twoSum(input, 28) );
	}

	@Test
	public void test() {
		int [] input =  {15,95,41,11,13,17};
		int [] expect = {15,13};
		Assert.assertArrayEquals(expect,ts.twoSum(input, 28) );
	}
	
	@Test
	public void testNotMatch() {
		int [] input =  {1,2,5,3};
		int [] expect = {};
		Assert.assertArrayEquals(expect,ts.twoSum(input, 28) );
	}
	
	@Test
	public void test23() {
		int [] input =  {1,2,5,3};
		int [] expect = {2,3};
		Assert.assertArrayEquals(expect,ts.twoSum(input, 5) );
	}


}
