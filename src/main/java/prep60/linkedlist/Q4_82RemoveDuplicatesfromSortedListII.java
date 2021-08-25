package prep60.linkedlist;

import com.lamhot.app.leetcode.ListNode;

public class Q4_82RemoveDuplicatesfromSortedListII {

	/*
	 * 82. Remove Duplicates from Sorted List II 
	 * Given the head of a sorted linked
	 * list, delete all nodes that have duplicate numbers, leaving only distinct
	 * numbers from the original list. Return the linked list sorted as well.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * 
	 * Input: head = [1,2,3,3,4,4,5] Output: [1,2,5] Example 2:
	 * 
	 * 
	 * Input: head = [1,1,1,2,3] Output: [2,3]
	 * 
	 * 
	 * Constraints:
	 * 
	 * The number of nodes in the list is in the range [0, 300]. -100 <= Node.val <=
	 * 100 The list is guaranteed to be sorted in ascending order.
	 * 
	 */
	
	 public ListNode deleteDuplicates(ListNode head) {
	        
	        ListNode result = new ListNode();
	        ListNode curr = head;
	        ListNode prev = result;
	        prev.next = curr;
	        while (curr != null) {
	            while (curr.next != null && curr.val == curr.next.val){
	                curr = curr.next;
	            }
	            if (prev.next != curr) { //catching duplicates
	                prev.next = curr.next; //removing duplicates
	                curr = prev.next;  //repositioning the pointer
	            }
	            else {
	                prev =prev.next;
	                curr = curr.next;
	            }
	        }
	        return result.next;
	    }

}
