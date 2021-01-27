package sorting.algorithms;

public class BubbleSort {

	public static int[] bubbleSort(int[] arr) {
		boolean sorted = false;
		while (!sorted) {
			sorted = true;
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					// SWITCH between arr[i] and arr[i + 1];
					sorted = false;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = { 4, 7, 2, 1, 3, 5, 6 };
		bubbleSort(arr);

		for (int e : arr) {
			System.out.print(e + " ");
		}
	}

}
