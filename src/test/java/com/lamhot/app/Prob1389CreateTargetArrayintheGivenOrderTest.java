package com.lamhot.app;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Prob1389CreateTargetArrayintheGivenOrderTest {

	
	 Prob1389CreateTargetArrayintheGivenOrder obj;
	@Before
	public void setUp() {
		
		obj = new  Prob1389CreateTargetArrayintheGivenOrder();
		
	}

	@Test
	public void test1() {
		
		int [] input1 = {0,1,2,3,4};
		int [] input2 = {0,1,2,2,1};
		
		int [] expecteds = {0,4,1,3,2};
		Assert.assertArrayEquals(expecteds, obj.createTargetArray(input1, input2));
	}

}
