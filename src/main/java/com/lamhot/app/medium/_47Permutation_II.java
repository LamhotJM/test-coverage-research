package com.lamhot.app.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class _47Permutation_II {
	
	public static void main(String agrs[])
	{
		_47Permutation_II ob = new _47Permutation_II();
		int [] nums= {1,1,2};
		System.out.println(ob.permuteUnique(nums));
		
	}
	
	public List<List<Integer>> permuteUnique(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        uniquePermutations(result, list, nums, visited);
        
        return new ArrayList<List<Integer>>(result);
    }
    
    public void uniquePermutations(Set<List<Integer>> result, List<Integer> list, int[] nums, boolean[] visited) {
        if (list.size() == nums.length) {
            result.add(new LinkedList<Integer>(list));
        }
        else {
            for(int i = 0; i < nums.length; i++) {
                if (visited[i]) {
                    continue;
                }
                list.add(nums[i]);
                visited[i] = true;
                uniquePermutations(result, list, nums, visited);
                visited[i] = false;
                list.remove(list.size()-1);
            }
        }
    }

}
