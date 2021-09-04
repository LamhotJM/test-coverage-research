package prep60.chap6.Tree_BST;

import java.util.LinkedList;
import java.util.Queue;

import com.lamhot.app.common.BTreePrinter;
import com.lamhot.app.common.BinarySearchTree;
import com.lamhot.app.common.TreeNode;

public class Q22_111_Minimum_Depth_of_Binary_Tree {
	/*
	 * 111. Minimum Depth of Binary Tree
	 * Given a binary tree, find its minimum depth.

	The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
	
	Note: A leaf is a node with no children.
	
	 
	
	Example 1:
	
	
	Input: root = [3,9,20,null,null,15,7]
	Output: 2
	Example 2:
	
	Input: root = [2,null,3,null,4,null,5,null,6]
	Output: 5
	 
	
	Constraints:
	
	The number of nodes in the tree is in the range [0, 105].
	-1000 <= Node.val <= 1000

	 */
	
	 public static void main(String[] args) {
	    
	        
	        Q22_111_Minimum_Depth_of_Binary_Tree ob = new Q22_111_Minimum_Depth_of_Binary_Tree();
	   
	       
	       
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

			int depth = ob.minDepth(root);
			for (int i = 0; i < depth; i++) {
				TreeNode.PrintLevelNodes(root, i);
				System.out.println();
			}
	      
	    }
	 
	
	// (1) DFS recursion
	public int minDepth(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null) return 1 + minDepth(root.right);
        if (root.right == null) return 1 + minDepth(root.left);
        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }
	
	// (2) BFS
	public int minDepth2(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int depth = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            ++depth;

            for (int i = 0; i < size; i++) {
                TreeNode curNode = queue.remove();

                if (curNode.left == null && curNode.right == null) {
                    return depth;
                }

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
