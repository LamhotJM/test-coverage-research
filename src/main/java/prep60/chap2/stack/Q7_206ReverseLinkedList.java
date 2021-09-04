package prep60.chap2.stack;

public class Q7_206ReverseLinkedList {

	/*
	 * 206. Reverse Linked List

	 * Given the head of a singly linked list, reverse the list, and return the
	 * reversed list.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * 
	 * Input: head = [1,2,3,4,5] Output: [5,4,3,2,1] Example 2:
	 * 
	 * 
	 * Input: head = [1,2] Output: [2,1] Example 3:
	 * 
	 * Input: head = [] Output: []
	 * 
	 * 
	 * Constraints:
	 * 
	 * The number of nodes in the list is the range [0, 5000]. -5000 <= Node.val <=
	 * 5000
	 * 
	 * 
	 * Follow up: A linked list can be reversed either iteratively or recursively.
	 * Could you implement both?
	 * 
	 * 
	 */

	public static void main(String[] args) {
		ListNode head = new ListNode(0, null);
		ListNode cur = head;
		for (int i = 1; i < 5; i++) {
			ListNode n = new ListNode(i, null);
			cur.next = n;
			cur = cur.next;
		}
		Solution s = new Solution();
		head = s.reverseList(head);
		cur = head;
		for (int i = 0; i < 5; i++) {
			System.out.print(cur.val + " ");
			cur = cur.next;
		}
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}

class Solution {
	public ListNode reverseList(ListNode head) {
		if (head == null) {
			return null;
		}
		ListNode new_head = new ListNode(head.val, null), cur;
		if (head.next != null) {
			cur = head.next;
		} else {
			return head;
		}
		new_head = head;
		new_head.next = null;
		while (cur != null) {
			head = cur;
			cur = head.next;
			head.next = new_head;
			new_head = head;
		}
		return new_head;
	}
}
