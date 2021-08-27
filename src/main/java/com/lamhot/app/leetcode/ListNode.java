package com.lamhot.app.leetcode;

import java.util.ArrayList;
import java.util.List;

// Definition for singly-linked list.
public class ListNode {
	public int val;
	public ListNode next;
	
	@Override
	public String toString()
	{
		return  "," +val;
		
	}

}

class Solution {
	
	ListNode header;
	
	public boolean isPalindrome() {
		ListNode head =header;
		List<ListNode> list = new ArrayList<ListNode>();

		ListNode current = head;
		while (current != null) {
			list.add(current);
			current = current.next;
		}
		return isPalindrome(list);
	}
	
	 public boolean isPalindrome(List<ListNode> list) {
         if (list.size() == 0) return false;
         if (list.size() == 1) return true; 
         if (list.size() == 2) return list.get(0).val == list.get(1).val; 
         return list.get(0).val == list.get(list.size() - 1).val && isPalindrome(list.subList(1, list.size() - 1));
     }
	
	public void addLast(int input)
	{
		ListNode newNode = new ListNode();
		newNode.val = input;
		newNode.next = header;
		header = newNode;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		ListNode current = header;
		while (current != null) {
			sb.append(current.toString());
			current = current.next;
		}
		
		return sb.toString();

	}
	

	public static void main(String[] args) {
		Solution list = new Solution();
		list.addLast(1);
		list.addLast(1);
		list.addLast(2);
		list.addLast(2);
		list.addLast(1);	
		list.addLast(1);

		System.out.println(list);
		System.out.println(list.isPalindrome());

	}
}


