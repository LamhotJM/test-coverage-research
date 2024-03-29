package prep60.chap6.Tree_BST;

import com.lamhot.app.common.TreeNode;

public class Q24_108_Convert_Sorted_Array_to_Binary_Search_Tree {
	
	/*
	 * 108. Convert Sorted Array to Binary Search Tree
	 * 
	 * Given an integer array nums where the elements are sorted in ascending order, convert it to a height-balanced binary search tree.

	A height-balanced binary tree is a binary tree in which the depth of the two subtrees of every node never differs by more than one.
	
	 
	
	Example 1:
	
	
	Input: nums = [-10,-3,0,5,9]
	Output: [0,-3,9,-10,null,5]
	Explanation: [0,-10,5,null,-3,null,9] is also accepted:
	
	Example 2:
	
	
	Input: nums = [1,3]
	Output: [3,1]
	Explanation: [1,3] and [3,1] are both a height-balanced BSTs.
	 
	
	Constraints:
	
	1 <= nums.length <= 104
	-104 <= nums[i] <= 104
	nums is sorted in a strictly increasing order.

	 */
	
	public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0){
            return null;
        }
        return buildBST(nums, 0, nums.length - 1);
    }
    private TreeNode buildBST(int[] nums, int start, int end){
        if (start > end)
            return null;
        else{
            int mid = ( start + end ) / 2;
            TreeNode node = new TreeNode(nums[mid]);
            node.left = buildBST(nums, start, mid - 1);
            node.right = buildBST(nums, mid + 1, end);
            return node;
        }
    }

}
