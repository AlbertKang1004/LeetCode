package com.leetcode.hashmap;
import java.util.*;
public class HashMapProblem9 {

	public static void main(String[] args) {
		boolean bool = true;
		char[][] board = 
			{{'8','3','.','.','7','.','.','.','.'}
			,{'6','.','.','1','9','5','.','.','.'}
			,{'.','9','7','.','.','.','.','6','.'}
			,{'1','.','.','.','6','.','.','.','3'}
			,{'4','.','.','8','.','3','.','.','1'}
			,{'7','.','.','.','2','.','.','.','6'}
			,{'.','6','.','.','.','.','2','8','.'}
			,{'.','.','.','4','1','9','.','.','5'}
			,{'.','.','.','.','8','.','.','7','9'}};
		Map<Integer, ArrayList<Character>> row = new HashMap<>();
		Map<Integer, ArrayList<Character>> col = new HashMap<>();
		Map<Integer, ArrayList<Character>> square = new HashMap<>();
		for (int i = 0 ; i < 9 ; i++) {
			row.put(i, new ArrayList<Character>());
			for (int j = 0; j < 9 ; j++) {
				if (row.get(i).contains(board[i][j]) && board[i][j] != '.') {
					bool = false;
					System.out.println("row");
				}
				row.get(i).add(board[i][j]);		
			}
		}
		for (int i = 0 ; i < 9 ; i++) {
			col.put(i, new ArrayList<Character>());
			for (int j = 0; j < 9 ; j++) {
				if (col.get(i).contains(board[j][i]) && board[j][i] != '.') {
					bool = false;
					System.out.println("col");
				}
				col.get(i).add(board[j][i]);	
			}
		}
		
		for (int i = 0; i < 9; i++) {
			square.put(i, new ArrayList<Character>());
			int IR = 0;
			int IC = 0;
			if (i % 3 == 0) {
				
			} else if (i % 3 == 1) {
				IR = 3;
			} else {
				IR = 6;
			}
			
			if (i < 3) {
				
			} else if (i < 6) {
				IC = 3;
			} else {
				IC = 6;
			}
			
			for (int j = 0; j < 3; j++) {
				for (int k = 0 ; k < 3; k++) {
					if (square.get(i).contains(board[j + IR][k + IC]) && board[j + IR][k + IC] != '.') {
						bool = false;
						System.out.println("squ");
					}
					square.get(i).add(board[j + IR][k + IC]);	
				}
			}
		}
		System.out.println(row);
		System.out.println(col);
		System.out.println(square);
		System.out.println(bool);
	}

}
