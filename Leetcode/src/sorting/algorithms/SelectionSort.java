package sorting.algorithms;

public class SelectionSort {

	public static int[] selectionSort(int[] arr) {
		int min = Integer.MAX_VALUE;
		int location = -1;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[j] < min) {
					min = arr[j];
					location = j;
				}	
			}
			int temp = arr[i];
			arr[i] = min;
			arr[location] = temp;
			min = Integer.MAX_VALUE;
			location = -1;
		}
		return arr;
	}
	public static void main(String[] args) {
		int[] arr = { 4, 7, 2, 1, 3, 5, 6 };
		selectionSort(arr);

		for (int e : arr) {
			System.out.print(e + " ");
		}
	}

}
