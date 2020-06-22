package com.lamhot.app;

import java.util.HashMap;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NotSum {

	public int[] twoSum(int[] input, int sum) {
		// o(n)
		if (input == null || input.length <= 0)
			return null;

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < input.length; i++) {
			int left = sum - input[i];
			if (hm.containsValue(left))
				return new int[] { left, input[i] };
			hm.put(i, input[i]);
		}

		return new int[] {};

	}

	public int[] twoSum2(int[] input, int sum) {
		// o(n * log n)
		if (input == null || input.length <= 0)
			return null;
		int left = 0;
		int right = input.length - 1;
		while (left < right) {
			if (input[left] + input[right] == sum) {
				return new int[] { input[left], input[right] };
			} else if (input[left] + input[right] < sum) {
				left++;
			}
			right--;
		}

		return new int[] {};

	}

	public int[] twoSum3(int[] input, int sum) {
		// o (n *2)
		if (input == null || input.length <= 0)
			return null;

		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if (input[i] + input[j] == sum) {
					return new int[] { input[i], input[j] };
				}
			}

		}
		return new int[] {};

	}
	

	NotSum ts;
	@Before
	public void setUp() throws Exception {
		ts = new NotSum();
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

