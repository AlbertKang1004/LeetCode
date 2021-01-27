package com.leetcode.linkedlist;

public class LinkedListIntersection {

	public static void main(String[] args) {
		
		ListNode a1 = new ListNode(4);
		ListNode a2 = new ListNode(1);
		
		ListNode b1 = new ListNode(5);
		ListNode b2 = new ListNode(6);
		ListNode b3 = new ListNode(1);
		
		ListNode c1 = new ListNode(8);
		ListNode c2 = new ListNode(4);
		ListNode c3 = new ListNode(5);
		
		a1.next = a2;
		a2.next = c1;
		
		b1.next = b2;
		b2.next = b3;
		b3.next = c1;
		
		c1.next = c2;
		c2.next = c3;
/*
 * 		 	   a1 ==> a2 ==\
 * 					        ==> c1 ==> c2 ==> c3
 * 		b1 ==> b2 ==> b3 ==/
 */
		System.out.println(a1.getIntersectionNode(a1, b1).val);
		
	}

}
