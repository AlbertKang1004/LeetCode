package com.leetcode.recursion;

public class RecursionExample3 {

	static int f(int n) {
		if (n <= 1)
			return 1;
		if (n % 2 == 0)
			return f(n / 2);
		return f(n / 2) + f(n / 2 + 1);
	}

	public static void main(String[] args) {
		System.out.println(f(11));
	}
}
