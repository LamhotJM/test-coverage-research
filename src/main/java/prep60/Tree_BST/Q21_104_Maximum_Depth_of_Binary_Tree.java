package prep60.Tree_BST;

import java.util.LinkedList;
import java.util.Queue;

import com.lamhot.app.common.BTreePrinter;
import com.lamhot.app.common.BinarySearchTree;
import com.lamhot.app.common.TreeNode;

public class Q21_104_Maximum_Depth_of_Binary_Tree {
	/*
	 * 104. Maximum Depth of Binary Tree
	 * 
	 * Given the root of a binary tree, return its maximum depth.

    A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

 

	Example 1:
	
	
	Input: root = [3,9,20,null,null,15,7]
	Output: 3
	Example 2:
	
	Input: root = [1,null,2]
	Output: 2
	Example 3:
	
	Input: root = []
	Output: 0
	Example 4:
	
	Input: root = [0]
	Output: 1
	 
	
	Constraints:
	
	The number of nodes in the tree is in the range [0, 104].
	-100 <= Node.val <= 100


	 */
	
	 public static void main(String[] args) {
	        /*
	         *        5
	         *      3   8
	         *    0   4
	         * */
	        TreeNode node1 = new TreeNode(5);
	        TreeNode node2 = new TreeNode(3);
	        TreeNode node3 = new TreeNode(8);
	        TreeNode node4 = new TreeNode(0);
	        node1.left = node2;
	        node1.right = node3;
	        node2.left = node4;
	        node2.right = new TreeNode(4);
	        
	        Q21_104_Maximum_Depth_of_Binary_Tree ob = new Q21_104_Maximum_Depth_of_Binary_Tree();
	       System.out.println(node1.toString());
	       System.out.println(ob.maxDepth(node1));
	       
	       
//	       BinarySearchTree bst = new BinarySearchTree();
//			TreeNode root = new TreeNode(30);
//			bst.insert(root, 20);
//			bst.insert(root, 25);
//			bst.insert(root, 15);
//			bst.insert(root, 50);
//			bst.insert(root, 40);
//			bst.insert(root, 60);
//			bst.insert(root, 70);
//
//			BTreePrinter.printNode(root);
//
//			int depth = ob.maxDepth(root);
//			for (int i = 0; i < depth; i++) {
//				TreeNode.PrintLevelNodes(root, i);
//				System.out.println();
//			}
	      
	    }
	

	 //(1) DFS
	 public int maxDepth(TreeNode root) {
	        if (root == null) {
	            return 0;
	        }
	        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
	    }
	 
	 //(2) BFS
	 public int maxDepth2(TreeNode root) {
	        if (root == null) {
	            return 0;
	        }

	        Queue<TreeNode> queue = new LinkedList<>();
	        queue.add(root);
	        int size = 0, depth = 0;

	        while (!queue.isEmpty()) {
	            size = queue.size();
	            ++depth;

	            for (int i = 0; i < size; i++) {
	                TreeNode curNode = queue.remove();

	                if (curNode.left != null) {
	                    queue.add(curNode.left);
	                }

	                if (curNode.right != null) {
	                    queue.add(curNode.right);
	                }
	            }
	        } 
	        return depth;
	    }

}
