package com.lamhot.app.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class TwoSum {

	public TwoSum() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		TwoSum ts = new TwoSum();
		int[] input = { 2, 2, 1, 5, 8 };
		// int[] input = { 5, 7, 44, 76, 3, 2, 6, 11, 32, 18, 1 };
		String res = Arrays.toString(ts.twoSum2(input, 9));
		System.out.print(res);
		// ts.twoSum(input, 9);
	for(int i=3;i<10;i=i++)
	{
		i+=1;
		System.out.println("hello");
	}
	}

	public int[] twoSum(int[] nums, int target) {
		if (nums == null || nums.length < 2)
			return new int[] { 0, 0 };
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				map.entrySet().forEach(new Consumer<Entry<Integer, Integer>>() {
					@Override
					public void accept(Entry<Integer, Integer> entry) {
						System.out.println(entry.getKey() + " " + entry.getValue());
					}
				});
				return new int[] { (map.get(nums[i])), i };
			} else
				map.put(target - nums[i], i);
		}

		return new int[] { 0, 0 };
	}
	
	public int [] twoSum2(int[] nums, int target)
	{
		if(nums == null || nums.length<2)
		return new int[] {0,0};
		for(int i=0; i< nums.length; i++)
		{
			for(int j=i+1; j< nums.length; j++)
			{
				int temp = target - nums[i];
				if( nums[j]==temp)
				{
					return new int[] {i,j};
				}
				
			}
		}
		return new int[] {0,0};
	}

}
