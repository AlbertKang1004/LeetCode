package com.leetcode.hashmap;

import java.util.*;

public class HashMapProblem10 {

	public static void main(String[] args) {
		int[] nums = {1, 1, 1, 2, 4, 4, 4, 4, 2, 3};
		Map<Integer, Integer> hash = new HashMap<>();
		Map<Integer, Integer> hash2 = new HashMap<>();
		for (int a : nums) {
			hash.put(a, hash.getOrDefault(a, 0) + 1);
			hash2.put(hash.get(a), a);
		}	
		

		System.out.println(hash);
		System.out.println(hash2);
	}

}
