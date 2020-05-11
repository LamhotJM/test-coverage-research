package com.lamhot.app;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DecompressRLElisTest {

	DecompressRLElis d;
	
	@Before
	public void setUp()
	
	{
		d = new DecompressRLElis();
	}
	
	
	@Test
	public void test1()
	{
		int [] arr = {1,2,3,4};
		int [] expected= {2,4,4,4};
		Assert.assertArrayEquals(expected, d.decompressRLElist(arr));
		
	}

}
