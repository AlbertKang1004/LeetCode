package com.leetcode.linkedlist;

class Node {
	int data; 
	Node next;
	Node(int data) {
		this.data = data;
	}
}
public class LinkedList1 {

	public static void main(String[] args) {
		Node nodeA = new Node(6);
		Node nodeB = new Node(3);
		Node nodeC = new Node(4);
		Node nodeD = new Node(2);
		Node nodeE = new Node(1);
		
		nodeA.next = nodeB;
		nodeB.next = nodeC;
		nodeC.next = nodeD;
		nodeD.next = nodeE;
	}

}
