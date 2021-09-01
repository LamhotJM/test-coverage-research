package com.lamhot.app.common;

public class TreeNode {
	public int val;
	public TreeNode left;
	public TreeNode right;

	TreeNode() {
	}

	public TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
	
	 public static void PrintLevelNodes(TreeNode root, int level) {
			if (level == 0) {
				System.out.print(root.val + " ");
				return;
			}

			if (root.left != null) {
				PrintLevelNodes(root.left, level - 1);
			}

			if (root.right != null) {
				PrintLevelNodes(root.right, level - 1);
			}
		}
}
