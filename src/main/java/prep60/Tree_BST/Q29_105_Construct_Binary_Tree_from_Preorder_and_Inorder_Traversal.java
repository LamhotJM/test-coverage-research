package prep60.Tree_BST;

import java.util.HashMap;

import com.lamhot.app.common.TreeNode;

public class Q29_105_Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal {
	/*
	 * 105. Construct Binary Tree from Preorder and Inorder Traversal
	 * 
	 * Given preorder and inorder traversal of a tree, construct the binary tree.

	Note:
	You may assume that duplicates do not exist in the tree.
	
	For example, given
	preorder = [3,9,20,15,7]
	inorder = [9,3,15,20,7]
	Return the following binary tree:
	
	    3
	   / \
	  9  20
	    /  \
	   15   7
	 */
	
	int preIndex = 0;
	HashMap<Integer, Integer> map = new HashMap();
	int[] preorder;
	int[] inorder;

	public TreeNode buildTree(int[] preorder, int[] inorder) {
		int len = preorder.length;
		this.preorder = preorder;
		this.inorder = inorder;
		for (int i = 0; i < len; i++) {
			map.put(inorder[i], i);
		}

		return dfs(0, len - 1);
	}

	private TreeNode dfs(int start, int end) {
		if (start > end)
			return null;

		int rootVal = preorder[preIndex];
		TreeNode root = new TreeNode(rootVal);
		int index = map.get(rootVal);
		preIndex++;
		root.left = dfs(start, index - 1);
		root.right = dfs(index + 1, end);

		return root;
	}


}
