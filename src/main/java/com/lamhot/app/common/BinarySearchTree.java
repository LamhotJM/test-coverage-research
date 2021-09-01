package com.lamhot.app.common;

public class BinarySearchTree {

	public void insert(TreeNode root, int data) {
		TreeNode n = new TreeNode(data);

		if (root == null) {
			root = n;
		} else {
			TreeNode current = root;
			TreeNode parent = null;
			while (true) {
				parent = current;
				/*
				 * if(data == current.val) { System.out.println("data already present"); return;
				 * }
				 */
				if (data < current.val) {
					current = current.left;
					if (current == null) {
						parent.left = n;
						return;
					}
				} else {
					current = current.right;
					if (current == null) {
						parent.right = n;
						return;
					}
				}
			}
		}
	}

	public boolean find(TreeNode root, int key) {
		if (root == null)
			return false;
		TreeNode current = root;
		while (current != null) {
			if (key == current.val) {
				return true;
			} else if (key < current.val) {
				current = current.left;
			} else {
				current = current.right;
			}
		}
		return false;
	}

	public boolean delete(TreeNode root, int data) {
		TreeNode current = root;
		TreeNode parent = root;
		boolean isLeftChild = true;
		while (current.val != data) {
			parent = current;
			if (data < current.val) {
				current = current.left;
				isLeftChild = true;
			} else {
				current = current.right;
				isLeftChild = false;
			}

			if (current == null)
				return false;
		}

		// node to be deleted has no leaves
		if (current.left == null && current.right == null) {
			if (current == root) {
				root = null;
			} else if (isLeftChild) {
				parent.left = null;
			} else {
				parent.right = null;
			}
		}

		// node to be deleted has just one child (either left or right)
		else if (current.left == null) { // it has right child
			if (current == root) {
				root = current.right;
			} else if (isLeftChild) {
				parent.left = current.right;
			} else {
				parent.right = current.right;
			}
		} else if (current.right == null) { // it has left child
			if (current == root) {
				root = current.left;
			} else if (isLeftChild) {
				parent.left = current.left;
			} else {
				parent.right = current.left;
			}
		}

		// node to be deleted has both left and right child
		else {
			// find successor node
			TreeNode successor = inorderSuccessor(root, new TreeNode(data));
			System.out.println(successor.val);

		}

		return true;
	}

	public TreeNode findMin(TreeNode root) {
		TreeNode current = root;
		while (current.left != null) {
			current = current.left;
		}
		return current;
	}

	// find the successor of the node p
	public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
		if (root == null || p == null)
			return null;
		if (p.right != null)
			return findMin(p.right); // find the minimum from the right subtree

		TreeNode current = root;
		TreeNode successor = null;
		while (current != null) {
			if (p.val < current.val) {
				successor = current;
				current = current.left;
			} else if (p.val > current.val) {
				current = current.right;
			} else {
				break;
			}
		}
		return successor;
	}

	public void inorderTraversal(TreeNode root) {
		if (root == null)
			return;

		inorderTraversal(root.left);
		System.out.print(root.val + " ");
		inorderTraversal(root.right);

	}

	public void preorderTraversal(TreeNode root) {
		if (root == null)
			return;

		System.out.print(root.val + " ");
		preorderTraversal(root.left);
		preorderTraversal(root.right);
	}

	public void postorderTraversal(TreeNode root) {
		if (root == null)
			return;

		postorderTraversal(root.left);
		postorderTraversal(root.right);
		System.out.print(root.val + " ");
	}

	public static void main(String[] args) {

		TreeNode root = new TreeNode(30);
		BinarySearchTree bst = new BinarySearchTree();

		bst.insert(root, 20);
		bst.insert(root, 25);
		bst.insert(root, 50);
		bst.insert(root, 40);
		bst.insert(root, 60);

		// should give you sorted in ascending order
		System.out.print("inorder traversal: ");
		bst.inorderTraversal(root);
		System.out.println();

		System.out.print("preorder traversal: ");
		bst.preorderTraversal(root);
		System.out.println();

		System.out.print("postorder traversal: ");
		bst.postorderTraversal(root);
		System.out.println();

		System.out.println("find 20: " + bst.find(root, 20));

		/*
		 * System.out.print("delete 30: "); bst.delete(root, 30);
		 * bst.inorderTraversal(root); System.out.println();
		 * System.out.print("insert 30: "); bst.insert(root, 30);
		 * bst.inorderTraversal(root); System.out.println();
		 */
		BTreePrinter.printNode(root);
		System.out.print("delete 40: ");
		bst.delete(root, 40);
		bst.inorderTraversal(root);
		System.out.println();
		BTreePrinter.printNode(root);
		System.out.println();
		System.out.print("insert 40: ");
		bst.insert(root, 40);
		bst.inorderTraversal(root);
		System.out.println();

		System.out.println("find 60: " + bst.find(root, 30));
		System.out.println("find 30: " + bst.find(root, 25));
		System.out.println("find 40: " + bst.find(root, 40));
		System.out.println("find 80: " + bst.find(root, 80));

		System.out.println("inorder successor of 25: " + bst.inorderSuccessor(root, new TreeNode(25)).val);
		System.out.println("inorder successor of 25: " + bst.inorderSuccessor(root, new TreeNode(40)).val);
	}
}
