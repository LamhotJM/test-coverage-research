package com.lamhot.app.practice;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RemoveDuplicatesTest {
	
	RemoveDuplicates ob;
	
	@Before
	public void setUp() throws Exception
	{
		ob = new RemoveDuplicates();
		
	}
	
	@After
	public void tearDown() throws Exception
	{
		ob=null;
	}

	@Test
	public void test() {
		int [] input = {1,1,2,2,3,3};
		
		int result= ob.removeDuplicate(input);
		assertEquals(result, 3);
		
		
	}

}
