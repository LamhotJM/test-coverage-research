package com.lamhot.app;

import java.util.Arrays;

public class Reverse {

	public static void main(String args[]) {
		Reverse ob = new Reverse();
		System.out.println(ob.reverseString("hello"));
		System.out.println(ob.reverseString(null));

		int i = 0;

		i = 1;
		int[] input = { 1, 2, 3, 5, 7, 10, 4 };
		System.out.println(ob.max(input));
		System.out.println("hello " + Arrays.toString(ob.reverseInt(input)));

	}

	private String reverseString(String input) {
		if (input == null) {
			return null;
		}
		StringBuilder sb = new StringBuilder();
		for (int i = input.length() - 1; i >= 0; i--) {
			sb.append(input.charAt(i));
		}

		return sb.toString();
	}

	private int max(int[] input)

	{

		int max = input[0];
		for (int i = 1; i < input.length; i++) {
			if (input[i] > max) {
				max = input[i];
			}
		}

		return max;
	}

	private int[] reverseInt(int input[])
	{
		int temp=0;
		int pointer=0;
		for(int i= input.length-1; i>=  input.length/2; i--)
		{
			temp = input[pointer];
			input[pointer]= input[i];
			input[i]= temp;
			System.out.println(Arrays.toString(input));
		    pointer++;
			
		}
		return input;
	}
}
