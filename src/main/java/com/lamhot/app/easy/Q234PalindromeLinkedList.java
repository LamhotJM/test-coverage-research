package com.lamhot.app.easy;

import static junit.framework.TestCase.assertEquals;

import com.lamhot.app.common.LinkedListUtils;
import com.lamhot.app.common.ListNode;

public class Q234PalindromeLinkedList {
	
	    public static void main(String args[])
	    {
	    	ListNode head;
	    	Q234PalindromeLinkedList ob = new Q234PalindromeLinkedList();
	    	head = LinkedListUtils.contructLinkedList(new int[]{4, 1, 2, 7, 8});
	        assertEquals(true, ob.isPalindrome(head));
	    }
        /**
         * O(n) time
         * O(1) space
         */
        public boolean isPalindrome(ListNode head) {
            if (head == null) {
                return true;
            }

            ListNode slow = head;
            ListNode fast = head;
            while (fast.next != null && fast.next.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            }

            ListNode secondHalfHead = reverse(slow.next);
            ListNode firstHalfHead = head;
            while (firstHalfHead != null && secondHalfHead != null) {
                if (firstHalfHead.val != secondHalfHead.val) {
                    return false;
                }
                firstHalfHead = firstHalfHead.next;
                secondHalfHead = secondHalfHead.next;
            }
            return true;
        }

        private ListNode reverse(ListNode head) {
            ListNode newHead = null;
            while (head != null) {
                ListNode next = head.next;
                head.next = newHead;
                newHead = head;
                head = next;
            }
            return newHead;
        }
    }