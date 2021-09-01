package prep60.Tree_BST;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.lamhot.app.common.BTreePrinter;
import com.lamhot.app.common.BinarySearchTree;
import com.lamhot.app.common.TreeNode;

public class Q26_102_Binary_Tree_Level_OrderTraversal {
	/*
	 * 102. Binary Tree Level Order Traversal
	 * Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).

 

	Example 1:
	
    Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
	
	For example:
	Given binary tree [3,9,20,null,null,15,7],
	    3
	   / \
	  9  20
	    /  \
	   15   7
	return its level order traversal as:
	[
	  [3],
	  [9,20],
	  [15,7]
	]

	
	
	Input: root = [3,9,20,null,null,15,7]
	Output: [[3],[9,20],[15,7]]
	Example 2:
	
	Input: root = [1]
	Output: [[1]]
	Example 3:
	
	Input: root = []
	Output: []
	 
	
	Constraints:
	
	The number of nodes in the tree is in the range [0, 2000].
	-1000 <= Node.val <= 1000

	 */
	
	// Approach 3; BFS, two queues
	
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if (root == null)
			return result;

		List<TreeNode> Q1 = new ArrayList<TreeNode>();
		List<TreeNode> Q2 = new ArrayList<TreeNode>();

		Q1.add(root);
		while (Q1.size() != 0) {
			List<Integer> level = new ArrayList<Integer>();
			Q2.clear();
			for (int i = 0; i < Q1.size(); i++) {
				TreeNode node = Q1.get(i);
				level.add(node.val);
				if (node.left != null) {
					Q2.add(node.left);
				}
				if (node.right != null) {
					Q2.add(node.right);
				}
			}

			List<TreeNode> temp = Q1;
			Q1 = Q2;
			Q2 = temp;

			result.add(level);
		}

		return result;
	}

	public static void main(String[] args) {

		Q26_102_Binary_Tree_Level_OrderTraversal ob = new Q26_102_Binary_Tree_Level_OrderTraversal();

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

		System.out.println(ob.levelOrder(root));

	}
	
	

}
