package prep60.linkedlist;

import com.lamhot.app.common.ListNode;

public class Q33_83RemoveDuplicatesfromSortedList {

	/*
	 * 83. Remove Duplicates from Sorted List Easy
	 * 
	 * 
	 * Share Given the head of a sorted linked list, delete all duplicates such that
	 * each element appears only once. Return the linked list sorted as well.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * 
	 * Input: head = [1,1,2] Output: [1,2] Example 2:
	 * 
	 * 
	 * Input: head = [1,1,2,3,3] Output: [1,2,3]
	 * 
	 * 
	 * Constraints:
	 * 
	 * The number of nodes in the list is in the range [0, 300]. -100 <= Node.val <=
	 * 100 The list is guaranteed to be sorted in ascending order.
	 */
	
	 public ListNode deleteDuplicates(ListNode head) {
	        ListNode curr = head;
	        
	        while (curr != null && curr.next != null) {
	            //ListNode fast = curr.next;
	            if (curr.val == curr.next.val) {
	                curr.next = curr.next.next;
	            }
	            else{
	                curr = curr.next;
	            }
	            
	        }
	        return head;
	    }

}
