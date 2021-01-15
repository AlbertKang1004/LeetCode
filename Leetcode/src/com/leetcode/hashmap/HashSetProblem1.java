package com.leetcode.hashmap;
import java.util.*;
public class HashSetProblem1 {

	public static void main(String[] args) {
		String jewels = "aA";
		String stones = "aAAbbBB";
		int count = 0;
		
		Set<Character> hash = new HashSet<>();
		for (int i = 0; i < jewels.length(); i++) {
			hash.add(jewels.charAt(i));
		}
		
		for (int i = 0 ; i < stones.length(); i++) {
			if (hash.contains(stones.charAt(i))) {
				count++;
			}
		}
		System.out.println(hash);
		System.out.println(count);
	}

}
