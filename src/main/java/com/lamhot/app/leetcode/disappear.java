package com.lamhot.app.leetcode;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class disappear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1 = findDisappearedNumbers(new int[] { 4, 3, 2, 7, 8, 2, 3, 1 });
		List<Integer> l2 = findDisappearedNumbers(new int[] { 1, 1 });
		List<Integer> l3 = findDisappearedNumbers(new int[] { 2, 2 });
		List<Integer> l4 = findDisappearedNumbers(new int[] { 4, 4, 5, 5, 6, 6 });
		
		

		System.out.println(l1);
		
		System.out.println(l2);
		System.out.println(l3);
		System.out.println(l4);
		
		List<Integer> l5 = findDisappearedNumbers2(new int[] { 4, 3, 2, 7, 8, 2, 3, 1 });
		List<Integer> l6 = findDisappearedNumbers2(new int[] { 1, 1 });
		List<Integer> l7 = findDisappearedNumbers2(new int[] { 2, 2 });
		List<Integer> l8 = findDisappearedNumbers2(new int[] { 4, 4, 5, 5, 6, 6 });
		
		System.out.println("1->"+ l5);
		System.out.println("2->"+l6);
		System.out.println("3->"+l7);
		System.out.println("4->"+l8);


	}

	public static List<Integer> findDisappearedNumbers(int[] nums) {
		if (nums == null || nums.length == 0) {
            return Collections.emptyList();
        }
		List<Integer> x = new ArrayList<>();
		int len = nums.length;
		Arrays.parallelSort(nums);
		for (int i = 0; i < len; i++) {
			{
				if (!x.contains(nums[i]) && nums[i] <= len) {
					x.add(nums[i]);
				}
			}
		}

		List<Integer> y = new ArrayList<>();
		for (int j = 1; j <= len; j++) {
			if (!x.contains(j)) {
				y.add(j);
			}
		}
		return y;

	}
	
	 public static List<Integer> findDisappearedNumbers2(int[] nums) {
	        if (nums == null || nums.length == 0) {
	            return Collections.emptyList();
	        }
	        Arrays.sort(nums);
	        int len = nums.length;

	        List<Integer> list = new ArrayList<>();
	        for (int i = 0; i < len; i++) {
	            nums[(nums[i] - 1) % len] += len;

	        }
	        for (int j = 0; j < len; ++j) {
	            if (nums[j] <= len) {
	                list.add(j + 1);
	            }
	        }
	        return list;
	    }

}
