package com.lamhot.app.leetcode;

import java.util.Arrays;

public class Q66PlusOne {

	public static void main(String args[]) {
		Q66PlusOne ob = new Q66PlusOne();

		int digits[] = { 4, 3, 2, 1 };
		System.out.println(Arrays.toString(ob.plusOne(digits)));

	}

	public int[] plusOne(int[] digits) {
//		if (digits == null || digits.length <= 0) {
//			return null;
//		}
//		int length = digits.length;
//		int arr[] = new int[length];
//		for (int i = 0; i < length; i++) {
//			if (i == length - 1) {
//
//				arr[i] = digits[i] + 1;
//			} else {
//				arr[i] = digits[i];
//			}
//
//		}
//		return arr;
		
		int n = digits.length;
		for(int i=n-1; i>=0; i--)
		{
			if(digits[i]<9)
			{
				digits[i]=+1;
				return digits;
			}
			digits[i]=0;
		}
		int [] new_number = new int[n+1];
		new_number[0]=1;
		return new_number;

	}

}
