package com.leetcode.recursion;

public class RecursionExample {
	static int fact(int n) {
		// assuming that n is a positive integer or 0
		if (n >= 1) {
			return n * fact(n - 1);
		} else {
			return 1;
		}
	}

	public static void main(String args[]) {
		System.out.println(fact(4));
	}
}
