package prep60.Tree_BST;

import com.lamhot.app.common.BTreePrinter;
import com.lamhot.app.common.BinarySearchTree;
import com.lamhot.app.common.TreeNode;

public class Q25_112_Path_Sum {
	/*
	 * 112. Path Sum
	 * 
	 * Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.

	A leaf is a node with no children.
	
	 
	
	Example 1:
	
	
	Input: root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
	Output: true
	Example 2:
	
	
	Input: root = [1,2,3], targetSum = 5
	Output: false
	Example 3:
	
	Input: root = [1,2], targetSum = 0
	Output: false
	 
	
	Constraints:
	
	The number of nodes in the tree is in the range [0, 5000].
	-1000 <= Node.val <= 1000
	-1000 <= targetSum <= 1000

	 */
	
	 public boolean hasPathSum(TreeNode root, int sum) {
	        if (root == null) {
	            return false;
	        }
	        if (root.left == null && root.right == null) {
	            return sum == root.val;
	        }
	        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
	    }
	 
	 public static void main(String[] args) {
		    
	        
		 Q25_112_Path_Sum ob = new Q25_112_Path_Sum();
	   
	       
	       
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

			System.out.println(ob.hasPathSum(root, 65));
			
	      
	    }
	 

}
