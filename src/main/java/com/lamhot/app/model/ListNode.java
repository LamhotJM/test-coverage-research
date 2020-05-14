package com.lamhot.app.model;
public class ListNode {
	public int val;
	public ListNode next;

	public ListNode(int x) {
		val = x;
	}

	@Override
	public String toString() {
		return "" + val + "next:" + (next != null ? next.val : "non");
	}

}