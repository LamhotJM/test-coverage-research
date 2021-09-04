package prep60.chap4.hashmap;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q13_349IntersectionofTwoArrays {
	/*
	 * 349. Intersection of Two Arrays
	 * Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

 

	Example 1:
	
	Input: nums1 = [1,2,2,1], nums2 = [2,2]
	Output: [2]
	Example 2:
	
	Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
	Output: [9,4]
	Explanation: [4,9] is also accepted.
	 
	
	Constraints:
	
	1 <= nums1.length, nums2.length <= 1000
	0 <= nums1[i], nums2[i] <= 1000
	 */
	
	
	
	public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Arrays.sort(nums2);
        for (Integer num : nums1) {
            if (binarySearch(nums2, num)) {
                set.add(num);
            }
        }
        int i = 0;
        int[] result = new int[set.size()];
        for (Integer num : set) {
            result[i++] = num;
        }
        return result;
    }
    
    public boolean binarySearch(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return true;
            }
            if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }
	

}
