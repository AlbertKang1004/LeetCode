package com.leetcode.hashmap;

import java.util.*;

public class HashMapProblem5 {

	public static void main(String[] args) {
		String s = "loveleetcode";
		Map<Character, Integer> hash = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char a = s.charAt(i);
			hash.put(a, hash.getOrDefault(a, 0) + 1);
		}
		
		char a = ' ';
		
		for (int i = 0; i < s.length(); i++) {
			if (hash.get(s.charAt(i)) == 1) {
				a = s.charAt(i);
				break;
			}
		}
		System.out.println(a);
	}

}
