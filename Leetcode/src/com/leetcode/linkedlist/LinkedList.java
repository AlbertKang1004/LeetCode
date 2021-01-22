package com.leetcode.linkedlist;

class MyLinkedList {
	class ListNode {
		int val; 
		ListNode next;
		ListNode pre;
		ListNode(int value) {
			this.val = value;
		}
	}
	
	ListNode head, tail;
	int size = 0;
	public MyLinkedList() {
		head = new ListNode(0);
		tail = new ListNode(0);
		head.next = tail;
		tail.pre = head;
	}

	/**
	 * Get the value of the index-th node in the linked list. If the index is
	 * invalid, return -1.
	 */
	public int get(int index) {
		if (index >= size || index < 0) return -1; // Invalid
		ListNode curr = head;
		for (int i = 0; i <= index; i++) {
			curr = curr.next;
		}
		return curr.val;
	}

	/**
	 * Add a node of value val before the first element of the linked list. After
	 * the insertion, the new node will be the first node of the linked list.
	 */
	public void addAtHead(int val) {
		addAtIndex(0, val);
	}

	/** Append a node of value val to the last element of the linked list. */
	public void addAtTail(int val) {
		addAtIndex(size, val);
	}

	/**
	 * Add a node of value val before the index-th node in the linked list. If index
	 * equals to the length of linked list, the node will be appended to the end of
	 * linked list. If index is greater than the length, the node will not be
	 * inserted.
	 */
	public void addAtIndex(int index, int val) {
		if (index > size || index < 0) return;
		ListNode curr = head;
		for (int i = 0 ; i < index; i++) {
			curr = curr.next;
		}
		ListNode temp = new ListNode(val);
		curr.next.pre = temp;
		temp.next = curr.next;
		curr.next = temp;
		temp.pre = curr;
		size++;
	}

	/** Delete the index-th node in the linked list, if the index is valid. */
	public void deleteAtIndex(int index) {
		if (index >= size || index < 0) return;
		ListNode curr = head;
		for (int i = 0 ; i <= index; i++) {
			curr = curr.next;
		}
		curr.next.pre = curr.pre;
		curr.pre.next = curr.next;
		size--;
	}
}

public class LinkedList {
	public static void main(String args[]) {
		 MyLinkedList obj = new MyLinkedList();
		 
		 obj.addAtHead(3);
		 obj.addAtTail(4);
		 obj.addAtIndex(1,4);
		 //obj.deleteAtIndex(1);
		 System.out.println(obj.get(0));
		 System.out.println(obj.get(1));
		 System.out.println(obj.get(2));
	}
}
