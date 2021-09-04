package prep60.greedy_backtracking;

import java.util.ArrayList;
import java.util.List;

public class Q51_78_Subsets {
	/*
	 * 78. Subsets
	 * Given an integer array nums of unique elements, return all possible subsets (the power set).

	The solution set must not contain duplicate subsets. Return the solution in any order.
	
	 
	
	Example 1:
	
	Input: nums = [1,2,3]
	Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
	Example 2:
	
	Input: nums = [0]
	Output: [[],[0]]
	 
	
	Constraints:
	
	1 <= nums.length <= 10
	-10 <= nums[i] <= 10
	All the numbers of nums are unique.
	 */
	
	public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(ans, new ArrayList<Integer>(), nums, 0);
        return ans;
    }

    public void helper(List<List<Integer>> ans, List<Integer> comb, int[] nums, int start){
        ans.add(new ArrayList<>(comb));
        for(int i = start; i < nums.length; i++){
            comb.add(nums[i]);
            helper(ans, comb, nums, i + 1);
            comb.remove(comb.size() - 1);
        }
        return;
    }

}
