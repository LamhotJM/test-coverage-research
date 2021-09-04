package prep60.chap3.heapPriorityQueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class Q9_347TopKFrequentElements {
	/*
	 * 347. Top K Frequent Elements
	 * 
	 * Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

 

		Example 1:
		
		Input: nums = [1,1,1,2,2,3], k = 2
		Output: [1,2]
		Example 2:
		
		Input: nums = [1], k = 1
		Output: [1]
		 
		
		Constraints:
		
		1 <= nums.length <= 105
		k is in the range [1, the number of unique elements in the array].
		It is guaranteed that the answer is unique.
		 
		
		Follow up: Your algorithm's time complexity must be better than O(n log n), where n is the array's size.


	 */
	
	public List<Integer> topKFrequent(int[] nums, int k) {
	    //count the frequency for each element
	    HashMap<Integer, Integer> map = new HashMap<>();
	    for(int num: nums){
	        map.put(num, map.getOrDefault(num, 0) + 1);
	    }
	 
	    //get the max frequency
	    int max = 0;
	    for(Map.Entry<Integer, Integer> entry: map.entrySet()){
	        max = Math.max(max, entry.getValue());
	    }
	 
	    //initialize an array of ArrayList. index is frequency, value is list of numbers
	    ArrayList<Integer>[] arr = (ArrayList<Integer>[]) new ArrayList[max+1];
	    for(int i=1; i<=max; i++){
	        arr[i]=new ArrayList<Integer>();
	    }
	 
	    for(Map.Entry<Integer, Integer> entry: map.entrySet()){
	        int count = entry.getValue();
	        int number = entry.getKey();
	        arr[count].add(number);
	    }
	 
	    List<Integer> result = new ArrayList<Integer>();
	 
	    //add most frequent numbers to result
	    for(int j=max; j>=1; j--){
	        if(arr[j].size()>0){
	            for(int a: arr[j]){
	                result.add(a);
	                //if size==k, stop
	                if(result.size()==k){
	                    return result;
	                }
	            }
	        }
	    }
	 
	    return result;
	}


}
