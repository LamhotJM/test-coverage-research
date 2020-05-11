package com.lamhot.app;

import java.util.ArrayList;
import java.util.List;
public class Prob1431_KidsWithGreatestCandies {

	public static void main(String[] args) {
		print(kidsWithCandies(new int[] { 2, 3, 5, 1, 3 }, 3));
		print(kidsWithCandies(new int[] { 4, 2, 1, 1, 2 }, 1));
		print(kidsWithCandies(new int[] { 12, 1, 12 }, 10));
	}
	private static void print(List<Boolean> kidsWithCandies) {
		for (Boolean b : kidsWithCandies) {
			System.out.print(b.booleanValue() + " ");
		}
		System.out.println();

	}

	public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		List<Boolean> list = new ArrayList<Boolean>(candies.length);

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < candies.length; i++) {
			if (candies[i] > max) {
				max = candies[i];
			}
		}
		System.out.println("max : "+ max);

		for (int i = 0; i < candies.length; i++) {
			if (candies[i] + extraCandies >= max) {
				list.add(true);
			} else {
				list.add(false);
			}
		}
		return list;
	}
}