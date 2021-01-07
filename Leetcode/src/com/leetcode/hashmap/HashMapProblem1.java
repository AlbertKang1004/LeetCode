package com.leetcode.hashmap;

import java.util.*;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Integer,Integer> hash = new HashMap<>();
        int var = 0;
        hash.put(0, var);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1)) var++;
            hash.put(i, var);
            
        }
        
        Map<Integer,Integer> hash2 = new HashMap<>();
        int var2 = 0;
        hash2.put(0, var2);
        for (int i = 1; i < t.length(); i++) {
            if (t.charAt(i) != t.charAt(i - 1)) var2++;  
            hash2.put(i, var);
        }
        
        return hash.equals(hash2);
    }
    
}

public class HashMapProblem1 {

	public static void main(String[] args) {
		Solution sol = new Solution();
		sol.isIsomorphic("foo", "bar");
	}

}
