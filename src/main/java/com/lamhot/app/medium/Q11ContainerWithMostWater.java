package com.lamhot.app.medium;

public class Q11ContainerWithMostWater {

	public static void main(String args[]) {

		Q11ContainerWithMostWater ob = new Q11ContainerWithMostWater();
		int[] arr = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };

		System.out.println(ob.maxArea(arr));
	}

	public int maxArea2(int[] height) {

		int result = Integer.MIN_VALUE;

		for (int l = 0; l < height.length; l++)
			for (int r = l + 1; r < height.length; r++) {
				int h = Math.min(height[l], height[r]);
				result = Math.max(result, h * (r - l));
			}

		return result;
	}
	
	public int maxArea(int[] height) {

		int result = Integer.MIN_VALUE;
		
		int left =0;
		int right = height.length-1;
		
		while (left < right)
		{
			int min = Math.min(height[left], height[right]);
			result = Math.max(result, min * (right-left));
			
			if(height[left]< height[right])
			{
				left++;
			}else {
				right--;
			}
			
		}
		return result;
	
	}
	
	

}
