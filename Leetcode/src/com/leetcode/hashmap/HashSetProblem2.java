package com.leetcode.hashmap;

import java.util.*;

public class HashSetProblem2 {

	public static void main(String[] args) {
		String s = "e h";
		char[] c_arr = s.toCharArray();
		int max = 0;
		for (int i = 0; i < c_arr.length; i++) {
			Set<Character> hash = new HashSet<>();
			for (int j = i; j < c_arr.length; j++) {
				if (hash.contains(c_arr[j])) {
					if (hash.size() > max) {
						max = hash.size();
					}
					break;
				} else {
					hash.add(c_arr[j]);
					if (hash.size() > max) {
						max = hash.size();
					}
				}
			}
		}
		System.out.println(max);

	}

}
