package com.lamhot.app;

import com.lamhot.app.model.ListNode;

public class ConvertBinaryNumberInaLinkedList {

	public int getDecimalValue(ListNode head) {
		if (head == null) {
			return 0;
		}

		StringBuilder sb = new StringBuilder();

		while (head != null) {
			sb.append(head.val);
			head = head.next;
		}

		return Integer.parseInt(sb.toString(), 2);

	}

}
