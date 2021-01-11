package com.leetcode.hashmap;

import java.util.*;

class Solution {
    public boolean isIsomorphic(String s, String t) {
    	Map<Character, Integer> hash = new HashMap<>();
    	Map<Character, Integer> hash2 = new HashMap<>();
    	int[] arr = new int[s.length()];
    	int[] arr2 = new int[s.length()];
    	int value = 1;
    	int value2 = 1;
    	
    	for (int i = 0; i < s.length(); i++) {
    		if (!hash.containsKey(s.charAt(i))) {
    			hash.put(s.charAt(i), value);
    			arr[i] = value;
    			value++;
    		} else {
    			arr[i] = hash.get(s.charAt(i));
    		}
    	}
    	
    	for (int i = 0; i < t.length(); i++) {
    		if (!hash2.containsKey(t.charAt(i))) {
    			hash2.put(t.charAt(i), value2);
    			arr2[i] = value2;
    			value2++;
    		} else {
    			arr2[i] = hash2.get(t.charAt(i));
    		}
    	}
    	
    	return arr.equals(arr2);
    }
    
}

public class HashMapProblem1 {

	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.isIsomorphic("add", "egg"));
	}

}
