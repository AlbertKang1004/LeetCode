package com.leetcode.hashmap;

import java.util.*;

public class HashMapProblem7 {

	public static void main(String[] args) {
		int arr[] = { 2147483647, -2147483648, 2147483647, -2147483648 };
		int k = 2;

		Map<Integer, Integer> hash = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			hash.put(i, arr[i]);
		}

		boolean result = false;

		for (int i = 0; i < hash.size() - 1; i++) {
			for (int j = i + 1; j < hash.size(); j++) {
				if (hash.get(i) == hash.get(j) && Math.abs(i - j) <= k) {
					result = true;
					break;
				}
			}
		}

		System.out.println(result);
		System.out.println(hash.get(0) == hash.get(2));
	}

}
