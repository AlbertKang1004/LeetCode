package com.leetcode.recursion;

import java.util.*;

public class RecursionTest2 {

	public static int fact(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * fact(n - 1);
		}
	}

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		System.out.printf("factorial of %d is : %d", n, fact(n));
	}

}
