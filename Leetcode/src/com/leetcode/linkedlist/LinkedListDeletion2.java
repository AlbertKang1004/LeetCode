package com.leetcode.linkedlist;

public class LinkedListDeletion2 {
	
	public static ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode curr1 = dummy.next;
		ListNode curr2 = dummy;
	
		
		for (int i = 1 ; i <= n; i++) {
			curr1 = curr1.next;
		}
		while (curr1 != null) {
			curr1 = curr1.next;
			curr2 = curr2.next;
		}
		curr2.next = curr2.next.next;
		return dummy.next;
	}

	public static void main(String[] args) {
		ListNode d1 = new ListNode(1);
		ListNode d2 = new ListNode(2);
		d1.next = d2;
		removeNthFromEnd(d1, 2);
		
	}

}
