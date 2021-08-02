package com.lamhot.app.leetcode;

public class NegativeCountMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] data = { { -3, -2, 1 }, { -2, -1, 3 }, { -1, 0, 1 } };
		System.out.println(countMinus(data));
		System.out.println(countMinus2(data));
		// System.out.println(getMinValue(data));
	}

	public static int countMinus(int[][] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] < 0) {
					count++;
				}
			}
		}
		return count;
	}

	public static int countMinus2(int[][] arr) {
		int count = 0;
		int i = 0;
		int j = arr.length - 1;
		while (j >= 0 && i < arr.length) {
			if (arr[i][j] < 0) {
				count += j+1;
				i+=1;
			}
			else
			{
				j-=1;
			}

		}
		return count;
	}
}
