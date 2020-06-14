package com.lamhot.app;

import org.junit.After;
import org.junit.Assert;
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
	public void reverseEmptyString() {
		Assert.assertEquals("", ob.reverse(""));
	}

	@Test
	public void reverseString() {
		Assert.assertEquals("cba", ob.reverse("abc"));
	}

	@Test
	public void reverseNullString() {
		Assert.assertEquals(null, ob.reverse(null));
	}

	@Test
	public void reversePalindromeString() {
		Assert.assertEquals("aba", ob.reverse("aba"));
	}

	@Test
	public void reverseSameCharacterString() {
		Assert.assertEquals("aaa", ob.reverse("aaa"));
	}

	@Test
	public void reverseAnagramString() {
		Assert.assertEquals("mary", ob.reverse("yram"));
	}


}
