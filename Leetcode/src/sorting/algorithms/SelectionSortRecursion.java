package sorting.algorithms;

public class SelectionSortRecursion {

//	public static int[] selectionSort(int[] arr) {
//		int min = Integer.MAX_VALUE;
//		int location = -1;
//		for (int i = 0; i < arr.length - 1; i++) {
//			for (int j = i; j < arr.length; j++) {
//				if (arr[j] < min) {
//					min = arr[j];
//					location = j;
//				}
//			}
//			int temp = arr[i];
//			arr[i] = min;
//			arr[location] = temp;
//			min = Integer.MAX_VALUE;
//			location = -1;
//		}
//		return arr;
//	}

	public static int[] selectionSort(int arr[], int start_index, int end_index) {
		if (start_index >= end_index) {
			return arr;
		} else {
			int val = minIndex(arr, start_index, end_index);
			int temp = arr[start_index];
			arr[start_index] = arr[val];
			arr[val] = temp;

			return selectionSort(arr, start_index + 1, end_index);
		}
	}

	private static int minIndex(int arr[], int s, int e) {
		int min = Integer.MAX_VALUE;
		int loc = -1;
		for (int i = s; i <= e; i++) {
			if (arr[i] < min) {
				min = arr[i];
				loc = i;
			}
		}
		return loc;
	}

	public static void main(String[] args) {
		int[] arr = { 4, 7, 2, 1, 3, 5, 6 };
		selectionSort(arr, 0, 6);

		for (int e : arr) {
			System.out.print(e + " ");
		}

	}

}
