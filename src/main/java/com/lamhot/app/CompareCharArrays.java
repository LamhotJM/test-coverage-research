package com.lamhot.app;


public class CompareCharArrays {
 //sdet tiktok
	public static void main(String[] args) {
		// create character arrays
		char[] charArray1 = new char[] { 'd', 'h', 'r', 'f', 's' };
		char[] charArray2 = new char[] { 'd', 'h', 'r', 'f', };

		/*
		 * To compare two char arrays use, static boolean equals(char array1[], char
		 * array2[]) method of Arrays class.
		 * 
		 * It returns true if both arrays are equal. Arrays are considered as equal if
		 * they contain same elements in same order.
		 */

		System.out.println(checkArray(charArray1, charArray2));

	}

	/*
	 * Please note that two char array references pointing to null are considered as
	 * equal.
	 */

	static char checkArray(char a[], char b[]) {
		char out = 0;

		if (b.length >= a.length) {
			for (int i = 0; i < a.length; i++) {
				if (a[i] != b[i]) {
					return b[i];
				} else {
					return b[a.length];
				}

			}

		} else {
			for (int i = 0; i < b.length; i++) {
				if (a[i] != b[i]) {
					return a[i];
				} else {
					return a[b.length];
				}

			}
		}
		return out;

	}

}