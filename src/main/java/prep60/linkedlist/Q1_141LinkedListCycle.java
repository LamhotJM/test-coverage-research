package prep60.linkedlist;

import java.util.HashMap;

import com.lamhot.app.leetcode.ListNode;

class Q1_141LinkedListCycle {

	/**
	 * 
	 * 141. Linked List Cycle
	 * 
	 * The following methods, i.e:
	 *
	 * 1. public int whereCycle(ListNode head) 2. public boolean hasCycle(ListNode
	 * head)
	 *
	 * Uses the `ListNode` class as described on the Leetcode challenge:
	 * https://leetcode.com/problems/linked-list-cycle/
	 *
	 * ListNode is briefly mentioned under Assumptions in the README.md
	 *
	 * The hasCycle() function passed the challenge requirements.
	 * 
	 * Given head, the head of a linked list, determine if the linked list has a
	 * cycle in it.
	 * 
	 * There is a cycle in a linked list if there is some node in the list that can
	 * be reached again by continuously following the next pointer. Internally, pos
	 * is used to denote the index of the node that tail's next pointer is connected
	 * to. Note that pos is not passed as a parameter.
	 * 
	 * Return true if there is a cycle in the linked list. Otherwise, return false.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * 
	 * Input: head = [3,2,0,-4], pos = 1 Output: true Explanation: There is a cycle
	 * in the linked list, where the tail connects to the 1st node (0-indexed).
	 * Example 2:
	 * 
	 * 
	 * Input: head = [1,2], pos = 0 Output: true Explanation: There is a cycle in
	 * the linked list, where the tail connects to the 0th node. Example 3:
	 * 
	 * 
	 * Input: head = [1], pos = -1 Output: false Explanation: There is no cycle in
	 * the linked list.
	 * 
	 * 
	 * Constraints:
	 * 
	 * The number of the nodes in the list is in the range [0, 104]. -105 <=
	 * Node.val <= 105 pos is -1 or a valid index in the linked-list.
	 * 
	 * 
	 * Follow up: Can you solve it using O(1) (i.e. constant) memory?
	 * 
	 * Given head, the head of a linked list, determine if the linked list has a
	 * cycle in it.
	 * 
	 * There is a cycle in a linked list if there is some node in the list that can
	 * be reached again by continuously following the next pointer. Internally, pos
	 * is used to denote the index of the node that tail's next pointer is connected
	 * to. Note that pos is not passed as a parameter.
	 * 
	 * Return true if there is a cycle in the linked list. Otherwise, return false.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * 
	 * Input: head = [3,2,0,-4], pos = 1 Output: true Explanation: There is a cycle
	 * in the linked list, where the tail connects to the 1st node (0-indexed).
	 * Example 2:
	 * 
	 * 
	 * Input: head = [1,2], pos = 0 Output: true Explanation: There is a cycle in
	 * the linked list, where the tail connects to the 0th node. Example 3:
	 * 
	 * 
	 * Input: head = [1], pos = -1 Output: false Explanation: There is no cycle in
	 * the linked list.
	 * 
	 * 
	 * Constraints:
	 * 
	 * The number of the nodes in the list is in the range [0, 104]. -105 <=
	 * Node.val <= 105 pos is -1 or a valid index in the linked-list.
	 * 
	 * 
	 * Follow up: Can you solve it using O(1) (i.e. constant) memory?
	 * 
	 */

	// return the index of the start of the cycle in the linked list
	// return -1 if no cycle exists
	public int whereCycle(ListNode head) {

		if (head == null)
			return -1;

		// Do Not assume unique node values of `val`
		HashMap<ListNode, Integer> track = new HashMap<ListNode, Integer>();
		// keys as ListNode objects
		// values as indices starting from zero

		ListNode curr = head;

		int index = 0;

		while (curr.next != null) {

			if (track.get(curr) == null) {

				track.put(curr, index);
				index++;

			} else {
				return curr.val;
			}
			curr = curr.next;

		}
		return -1;
	}

	// return true if the linked list contains a cycle
	public boolean hasCycle(ListNode head) {

		boolean result = whereCycle(head) == -1 ? false : true;
		return result;
	}

}
