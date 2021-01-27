package com.leetcode.linkedlist;

import java.util.*;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}

	public boolean hasCycle(ListNode head) {
		ListNode curr = head;
		Set<ListNode> hash = new HashSet<>();
		while (curr != null) {
			if (hash.contains(curr)) {
				return true;
			}
			hash.add(curr);
			curr = curr.next;
		}
		return false;

	}

	public boolean hasCycle_fastslow(ListNode head) {
		if (head == null)
			return false;
		ListNode slow = head;
		ListNode fast = head;
		while (slow != fast) {
			if (fast == null || fast.next == null) {
				return false;
			}
			slow = slow.next;
			fast = fast.next.next;
		}
		return true;
	}

	public ListNode cycleDetector(ListNode head) {
		ListNode curr = head;
		Set<ListNode> hash = new HashSet<>();
		while (curr != null) {
			if (hash.contains(curr)) {
				return curr;
			}
			hash.add(curr);
			curr = curr.next;
		}
		return null;
	}

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if (headA == null || headB == null) return null;
		ListNode curr1 = headA;
		ListNode curr2 = headB;
		Set<ListNode> hash = new HashSet<>();
		while (curr1 != null) {
			hash.add(curr1);
			curr1 = curr1.next;
		}
		while (curr2 != null) {
			if (hash.contains(curr2)) return curr2;
			hash.add(curr2);
			curr2 = curr2.next;
		}
		return null;
	}
	
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode curr1 = head;
		ListNode curr2 = new ListNode(0);
		curr2.next = head;
		
		for (int i = 1 ; i <= n; i++) {
			curr1 = curr1.next;
		}
		while (curr1 != null) {
			curr1 = curr1.next;
			curr2 = curr2.next;
		}
		if (curr2.next.next == null) {
			curr2.next = null;
		} else {
			curr2.next = curr2.next.next;
		}
		return head;
	}
	
	public ListNode reverseList(ListNode head) {
        	ListNode pre = null;
		ListNode curr = head;
		while (curr != head) {
			ListNode next = curr.next;
			curr.next = pre;
			pre = curr;
			curr = next;
		}
		return pre;
    }
	
	public ListNode reverseList_recursion(ListNode head) {
		if (head == null || head.next == null) return head;
		else {
			ListNode n = reverseList_recursion(head.next);
			head.next.next = head;
			head.next = null;
			return n;
		}
	}
	
	public ListNode removeElements(ListNode head, int val) {
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode cur = dummy;
		while (head != null) {
			if (head.val != val) {
				cur.next = head;
				cur = cur.next;
			}
			head = head.next;
		}
		cur.next = null;
		return dummy.next;
	}
}

public class LinkedListCycle {

	public static void main(String[] args) {

		// initiate
		ListNode node1 = new ListNode(3);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(2);
		ListNode node4 = new ListNode(4);

		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node2;

		System.out.println(node1.hasCycle(node1));
		System.out.println(node1.hasCycle_fastslow(node1));

		System.out.println(node1.cycleDetector(node1).val);
	}

}
