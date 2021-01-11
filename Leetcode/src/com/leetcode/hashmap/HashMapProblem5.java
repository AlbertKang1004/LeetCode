package com.leetcode.hashmap;

import java.util.*;

public class HashMapProblem5 {

	public static void main(String[] args) {
		String s = "loveleetcode";
		Map<Character, Integer> hash = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (!hash.containsKey(s.charAt(i))) {
				hash.put(s.charAt(i), 1);
			} else {
				int temp = hash.get(s.charAt(i));
				temp++;
				hash.put(s.charAt(i), temp);
			}
		}
	}

}
