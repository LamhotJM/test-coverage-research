package com.lamhot.app;

public class TwoSum {
	
	public int [] twoSum(int [] input, int sum)
	{
		if(input ==null || input.length <=0)
			return null;

		for(int i =0 ; i < input.length; i++)
		{
			for(int j = i+1; j < input.length ; j++)
			{
				if(input[i]+input[j]==sum)
				{
					return new int[] { input[i], input[j] };
				}
			}
			
		}
		return new int[] {};
		
	}
	
	

}
