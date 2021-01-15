package com.leetcode.hashmap;

import java.util.*;

public class HashMapProblem8 {

	public static void main(String[] args) {
		Map<String, List<String>> hash = new HashMap<>();
		String[] arr = { "eat", "tea", "tan", "ate", "nat", "bat" };
		for (String e : arr) {
			char[] char_arr = e.toCharArray();
			Arrays.sort(char_arr);
			String str = String.valueOf(char_arr);
			if (!hash.containsKey(str)) {
				hash.put(str, new ArrayList<String>());
				hash.get(str).add(e);
			} else {
				hash.get(str).add(e);
			}
		}
		System.out.println(hash);
		
	}

}
