package com.leetcode.recursion;

public class PrintReverse2 {

	private static void reverse(char[] arr) {
		for (int i = 0; i < arr.length / 2; i++) {
			char temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
	}
	public static void main(String[] args) {
		char[] characters = {'H', 'e', 'l', 'l', 'o', '!'};
		reverse(characters);
		System.out.println(characters);
	}

}
