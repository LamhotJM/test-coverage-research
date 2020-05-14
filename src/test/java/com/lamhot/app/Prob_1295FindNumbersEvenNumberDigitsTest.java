package com.lamhot.app;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Prob_1295FindNumbersEvenNumberDigitsTest {

	
	Prob_1295FindNumbersEvenNumberDigits findnum;
	
	@Before
	public void setUp()
	{
		findnum = new Prob_1295FindNumbersEvenNumberDigits();
		
	}
	@Test
	public void test() {
		int [] arr = {12,345,2,6,7896};
		assertEquals(2,findnum.findNumbers(arr));
	}
	
	@Test
	public void test2()
	{
		int [] arr = {555,901,482,1771};
		assertEquals(1, findnum.findNumbers(arr));
	}

}
