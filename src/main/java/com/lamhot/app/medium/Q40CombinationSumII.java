package com.lamhot.app.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q40CombinationSumII {
	
	public static void main(String agrs[])
	{
		Q40CombinationSumII ob = new Q40CombinationSumII();
		int [] nums= {1,1,2};
		System.out.println(ob.combinationSum2(nums, 2));
		
	}
	

	public List<List<Integer>> combinationSum2(int[] candidates, int target) {

		List<List<Integer>> results = new ArrayList<>();
		Arrays.parallelSort(candidates);

		findCombinations(candidates, 0, target, new ArrayList<Integer>(), results);

		return results;
	}

	public void findCombinations(int[] candidates, int index, int target, List<Integer> current,
			List<List<Integer>> result) {
		if (target == 0) {
			result.add(new ArrayList<Integer>(current));

		}
		if (target < 0) {
			return;
		}

		for (int i = index; i < candidates.length; i++) {
			if (i == index || candidates[i] != candidates[i - 1]) {
				current.add(candidates[i]);
				findCombinations(candidates, i + 1, target - candidates[i], current, result);
				current.remove(current.size() - 1);
			}
		}
	}

}
