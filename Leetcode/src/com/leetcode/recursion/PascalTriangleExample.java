package com.leetcode.recursion;

import java.util.*;

public class PascalTriangleExample {

	public static List<Integer> getRow(int rowIndex) {
		if (rowIndex == 1) {
			List<Integer> newList = new ArrayList<>();
			newList.add(1);
			return newList;
		} else {
		List<Integer> newList = new ArrayList<>();
		newList.add(0, 1);
		newList.add(rowIndex - 1, 1);
		
		return newList;
		}
		
	}
	
	public static void main(String[] args) {
		getRow(3);

	}

}
