package com.leetcode.hashmap;

import java.util.*;

public class HashMapProblem11 {

	public static void main(String[] args) {
		int[] A = { -1, -1 };
		int[] B = { -1, 1 };
		int[] C = { -1, 1 };
		int[] D = { 1, -1 };
		int count = 0;
		Map<Integer, Integer> sums = new HashMap<>();
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B.length; j++) {
				int sum = A[i] + B[j];
				sums.put(sum, sums.getOrDefault(sum, 0) + 1);
			}
		}
		
		for (int i = 0; i < C.length; i++) {
			for (int j = 0; j < D.length; j++) {
				int sum = C[i] + D[j];
				count += sums.getOrDefault(-sum, 0);
			}
		}
		System.out.println(sums);
		System.out.println(count);
	}

}
