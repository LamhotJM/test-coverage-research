package prep60.Tree_BST;

import java.util.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.lamhot.app.common.BTreePrinter;
import com.lamhot.app.common.BinarySearchTree;
import com.lamhot.app.common.TreeNode;

public class Q27_103_Binary_Tree_Zigzag_Level_Order_Traversal {
	/*
	 * 103. Binary Tree Zigzag Level Order Traversal
	 * Given the root of a binary tree, return the zigzag level order traversal of its nodes' values. (i.e., from left to right, then right to left for the next level and alternate between).

 

	Example 1:
	
	Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from left to right, then right to left for the next level and alternate between).

	For example:
	Given binary tree [3,9,20,null,null,15,7],
	    3
	   / \
	  9  20
	    /  \
	   15   7
	return its zigzag level order traversal as:
	[
	  [3],
	  [20,9],
	  [15,7]
	]
	
	Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from left to right, then right to left for the next level and alternate between).
		
	
	Input: root = [3,9,20,null,null,15,7]
	Output: [[3],[20,9],[15,7]]
	Example 2:
	
	Input: root = [1]
	Output: [[1]]
	Example 3:
	
	Input: root = []
	Output: []
	 
	
	Constraints:
	
	The number of nodes in the tree is in the range [0, 2000].
	-100 <= Node.val <= 100
	 */

	// Approach Queue

	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if (root == null)
			return result;

		boolean odd = true;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.offer(root);
		while (!q.isEmpty()) {
			ArrayList<Integer> level = new ArrayList<Integer>();
			for (int i = 0; i < q.size(); i++) {
				TreeNode node = q.poll();
				level.add(node.val);
				if (node.left != null)
					q.offer(node.left);
				if (node.right != null)
					q.offer(node.right);
			}

			if (odd) {
				result.add(level);
			} else {
				Collections.reverse(level);
				result.add(level);
			}

			odd = !odd;
		}

		return result;
	}

	// Approach DFS (Depth-First Search)

	public List<List<Integer>> zigzagLevelOrder2(TreeNode root) {
		if (root == null) {
			return new ArrayList<List<Integer>>();
		}

		List<List<Integer>> results = new ArrayList<List<Integer>>();
		DFS(root, 0, results);
		return results;
	}

	private void DFS(TreeNode node, int level, List<List<Integer>> results) {
		if (level >= results.size()) {
			LinkedList<Integer> newLevel = new LinkedList<Integer>();
			newLevel.add(node.val);
			results.add(newLevel);
		} else {
			if (level % 2 == 0) {
				results.get(level).add(node.val);
			} else {
				results.get(level).add(0, node.val);
			}

			if (node.left != null)
				DFS(node.left, level + 1, results);
			if (node.right != null)
				DFS(node.right, level + 1, results);
		}
	}

	public static void main(String[] args) {

		Q27_103_Binary_Tree_Zigzag_Level_Order_Traversal ob = new Q27_103_Binary_Tree_Zigzag_Level_Order_Traversal();

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

		System.out.println(ob.zigzagLevelOrder(root));

	}


}
