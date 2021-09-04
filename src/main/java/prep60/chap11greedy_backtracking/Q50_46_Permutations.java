package prep60.chap11greedy_backtracking;

import java.util.ArrayList;
import java.util.List;

public class Q50_46_Permutations {
	/*
	 * 46. Permutations
	 * 
	 * Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.

 

	Example 1:
	
	Input: nums = [1,2,3]
	Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
	Example 2:
	
	Input: nums = [0,1]
	Output: [[0,1],[1,0]]
	Example 3:
	
	Input: nums = [1]
	Output: [[1]]
	 
	
	Constraints:
	
	1 <= nums.length <= 6
	-10 <= nums[i] <= 10
	All the integers of nums are unique.
	 */
	
	
	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> list = new ArrayList<>();
		// Arrays.sort(nums); // not necessary
		backtrack(list, new ArrayList<Integer>(), nums);
		return list;
	}

	private void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums) {
		if (tempList.size() == nums.length) {
			list.add(new ArrayList<>(tempList));
		} else {
			for (int i = 0; i < nums.length; i++) {
				if (tempList.contains(nums[i]))
					continue; // element already exists, skip
				tempList.add(nums[i]);
				backtrack(list, tempList, nums);
				tempList.remove(tempList.size() - 1);
			}
		}
	}

}
