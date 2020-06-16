package com.lamhot.app;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FactorialTest {
	Factorial f;

	@Before
	public void setUp() throws Exception {
		f = new Factorial();
	}

	@After
	public void tearDown() throws Exception {
		f = null;
	}

	@SuppressWarnings("deprecation")
	@Rule
	public final ExpectedException exception = ExpectedException.none();

	@Test
	public void factorialMinus1() {
		long result = f.calculate(0);
		assertEquals(1, result);
	}
	
	@Test
	public void factorialMinInt() {
		long result = f.calculate(Integer.MIN_VALUE);
		assertEquals(-1, result);
	}


	@Test
	public void factorialNol() {
		long result = f.calculate(0);
		assertEquals(1, result);
		
	}

	@Test
	public void factorialOne() {
		long result = f.calculate(1);
		assertEquals(1, result);
	}

	@Test
	public void factorialThree() {;
		long result = f.calculate(3);
		assertEquals(6, result);
	}

	@Test
	public void factorial13() {
		long result = f.calculate(13);
	     assertEquals(6227020800L, result);
	}

	@Test
	public void factorialMaxInt() {
		exception.expect(StackOverflowError.class);
		@SuppressWarnings("unused")
		long result = f.calculate(Integer.MAX_VALUE);
	}
}
