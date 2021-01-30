package com.leetcode.recursion;
import java.util.*;

public class RecursionTest {
	
	public static int fib(int n) {
		if (n == 1 || n == 2) return 1;
		else {
			return fib(n - 1) + fib(n - 2);
		}
	}

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = sc.nextInt();
		System.out.printf("Fibonacci series of %d numbers is : ", n);
		for (int i = 1; i <= n; i++) {
			System.out.print(fib(i) + " ");
		}
	}

}
