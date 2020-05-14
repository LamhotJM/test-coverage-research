package com.lamhot.app;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.lamhot.app.model.ListNode;
import com.lamhot.app.utils.Utils;

public class ConvertBinaryNumberInaLinkedListTest {

	ConvertBinaryNumberInaLinkedList cb;

	@Before
	public void setUp() {

		cb = new ConvertBinaryNumberInaLinkedList();

	}

	@Test
	public void test() {

		int[] lst = { 1, 0, 1 };
		ListNode head = Utils.loadList(lst);
		assertEquals(5, cb.getDecimalValue(head));

	}

	public void test1() {

		int[] lst1 = { 0 };
		ListNode head1 = Utils.loadList(lst1);
		assertEquals(0, cb.getDecimalValue(head1));

	}

	@Test
	public void test2() {
		int[] lst2 = { 1 };
		ListNode head2 = Utils.loadList(lst2);
		assertEquals(1, cb.getDecimalValue(head2));

	}

	@Test
	public void test3() {
		int[] lst3 = { 1, 0, 0, 1, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0 };
		ListNode head3 = Utils.loadList(lst3);
		assertEquals(18880, cb.getDecimalValue(head3));
	}

	@Test
	public void test4() {
		int[] lst4 = { 0, 0 };
		ListNode head4 = Utils.loadList(lst4);
		assertEquals(0, cb.getDecimalValue(head4));

	}

}
