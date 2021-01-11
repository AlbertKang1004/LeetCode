package com.leetcode.hashmap;

class Solution3 {
    public boolean isHappy(int n) {
    	String temp = Integer.toString(n);
    	int[] arr = new int[temp.length()];
    	for (int i = 0; i < temp.length(); i++) {
    		arr[i] = temp.charAt(i) - '0';
    	}
    	
    	@SuppressWarnings("unused")
		int result = 0;
    	for(int i = 0; i < arr.length; i++) {
    		result += (arr[i] * arr[i]);
    	}

        	return true;
    }
    
   
}

public class HashMapProblem3 {

	public static void main(String[] args) {
		int n = 192;
		Solution3 sol = new Solution3();
		System.out.println(sol.isHappy(n));
	}

}
