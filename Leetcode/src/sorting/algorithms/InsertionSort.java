package sorting.algorithms;

public class InsertionSort {
	
	public static int[] insertionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int j = i - 1;
			while (j >= 0 && arr[j] > arr[j + 1]) {
				int temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
				j--;
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		int[] arr = { 4, 7, 2, 1, 3, 5, 6 };
		insertionSort(arr);

		for (int e : arr) {
			System.out.print(e + " ");
		}

	}

}
