package com.lamhot.app.practice;

import java.util.Arrays;

public class PushZero {

	public static void main(String args[]) {
		PushZero ob = new PushZero();
		int arr[] = { 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9 };
		System.out.println(Arrays.toString(ob.moved(arr)));
	}

	private int[] moved(int input[]) {
		int temp [] = new int [input.length];
		int count=0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] != 0) {
				temp[count++]=input[i];
			}
	
		}
		return temp;

	}

}
