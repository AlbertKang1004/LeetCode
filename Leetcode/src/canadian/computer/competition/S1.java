package canadian.computer.competition;

import java.util.*;

public class S1 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int row = sc.nextInt();
		double arr[][] = new double[row][2];
		for (int i = 0; i < row; i++) {
			arr[i][0] = sc.nextDouble(); // TIME
			arr[i][1] = sc.nextDouble(); // POSITION
		}
		
		Arrays.sort(arr, (a, b) -> Double.compare(a[0], b[0]));
		
		double max = 0.0;
		for (int i = 0 ; i < arr.length - 1; i++) {
			double speed = Math.abs(arr[i + 1][1] - arr[i][1]) / Math.abs(arr[i + 1][0] - arr[i][0]);
			if (speed > max) max = speed;
		}
		System.out.println(max);
	}

}
