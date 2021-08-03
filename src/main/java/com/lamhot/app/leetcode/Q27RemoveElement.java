package com.lamhot.app.leetcode;

import java.util.Arrays;

public class Q27RemoveElement {
	
	public static void main (String args[])
	{
		Q27RemoveElement re = new Q27RemoveElement();
		int[] arr = { 0, 1, 2, 2, 3, 0, 4, 2 };
		System.out.println(re.removeElement(arr, 2));
	}
	public int removeElement(int [] nums, int val)
	{
		if( nums.length<=0)
		{
			return 0;
		}
		
		int validSize=0;
		for(int a=0 ; a < nums.length; a++)
		{
			if (nums[a]!=val)
			{
				nums[validSize]= nums[a];
				validSize ++;
			}
		}
		System.out.println(Arrays.toString(nums));
		return validSize;
	}

}
