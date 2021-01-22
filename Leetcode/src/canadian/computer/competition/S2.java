package canadian.computer.competition;

import java.util.*;

public class S2 {

	static Scanner sc = new Scanner(System.in);

	private static boolean function (Map<Integer, ArrayList<Integer>> hash) {
		for (int e : hash.get(1)) {
			for (int f : hash.get(e)) {
				
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] table = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				table[i][j] = sc.nextInt();
			}
		}
		
		Map<Integer, ArrayList<Integer>> hash = new HashMap<>();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				int location = (i + 1) * (j + 1);
				if (hash.containsKey(location)) {
					hash.get(location).add(table[i][j]);
				} else {
					hash.put(location, new ArrayList<>());
					hash.get(location).add(table[i][j]);
				}
			}
		}
		
		function(hash);
		
		System.out.println(hash);
	}

}
