package com.leetcode.hashmap;

import java.util.*;

class Solution2 {
	public Integer[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> hash1 = new HashSet<>();
        Set<Integer> hash2 = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            if (!hash1.contains(nums1[i])) {
                hash1.add(nums1[i]);
            }
        }
        
        for (int i = 0; i < nums2.length; i++) {
            if (!hash2.contains(nums2[i])) {
                hash2.add(nums2[i]);
            }
        }
        
        	hash1.retainAll(hash2);
        	Integer[] array = new Integer[hash1.size()];
        hash1.toArray(array);
        return array;
    }
}

public class HashMapProblem2 {

	public static void main(String[] args) {
		int[] arr1 = {1, 3, 4, 6, 1};
		int[] arr2 = {4, 6, 2, 7, 7, 3};
		Solution2 sol = new Solution2();
		for(int e : sol.intersection(arr1, arr2)) {
			System.out.print(e + " ");
		}
	}

}
