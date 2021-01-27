package com.leetcode.linkedlist;

public class LinkedListDeletion {

	public static void main(String[] args) {
		
		ListNode d1 = new ListNode(5);
		ListNode d2 = new ListNode(6);
		ListNode d3 = new ListNode(1);
		ListNode d4 = new ListNode(7);
		ListNode d5 = new ListNode(0);
		
		d1.next = d2;
		d2.next = d3;
		d3.next = d4;
		d4.next = d5;
		
		System.out.println(d1.removeNthFromEnd(d1, 2));

	}

}
