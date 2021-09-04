package prep60.chap6.Tree_BST;

import com.lamhot.app.common.BTreePrinter;
import com.lamhot.app.common.BinarySearchTree;
import com.lamhot.app.common.TreeNode;

public class Q28_98_Validate_Binary_Search_Tree {
	/*
	 * 98. Validate Binary Search Tree
	 * 
	 * Given the root of a binary tree, determine if it is a valid binary search tree (BST).

	A valid BST is defined as follows:
	
	The left subtree of a node contains only nodes with keys less than the node's key.
	The right subtree of a node contains only nodes with keys greater than the node's key.
	Both the left and right subtrees must also be binary search trees.
	 
	
	Example 1:
	
	    2
	   / \
	  1   3
	
	
	Input: root = [2,1,3]
	Output: true
	Example 2:
	
	
	Input: root = [5,1,4,null,null,3,6]
	Output: false
	Explanation: The root node's value is 5 but its right child's value is 4.
	 
	
	Constraints:
	
	The number of nodes in the tree is in the range [1, 104].
	-231 <= Node.val <= 231 - 1
	 */
	
	public boolean isValidBST(TreeNode root) {
		if (root == null)
			return true;

		return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
	}

	private boolean helper(TreeNode root, long lower, long upper) {
		if (root == null)
			return true;

		if (root.val >= upper || root.val <= lower)
			return false;

		boolean isLeftValidBST = helper(root.left, lower, root.val);
		boolean isRightValidBST = helper(root.right, root.val, upper);

		return isLeftValidBST && isRightValidBST;
	}
	
	public static void main(String[] args) {

		Q28_98_Validate_Binary_Search_Tree ob = new Q28_98_Validate_Binary_Search_Tree();

		BinarySearchTree bst = new BinarySearchTree();
		TreeNode root = new TreeNode(30);
		bst.insert(root, 20);
		bst.insert(root, 25);
		bst.insert(root, 15);
		bst.insert(root, 50);
		bst.insert(root, 40);
		bst.insert(root, 60);
		bst.insert(root, 70);

		BTreePrinter.printNode(root);

		System.out.println(ob.isValidBST(root));

	}

}
