package projects.dsa;

public class InsertionSort {

	public static void insertionSort(int[] array) {
		int n = array.length;
		for (int i = 1; i < n; i++) {
			int key = array[i];
			int j = i - 1;

			// move to right when key is less than

			while (j >= 0 && array[j] > key) {
				array[j + 1] = array[j];
				j = j - 1;
			}

			// assign key

			array[j + 1] = key;
		}

	}

	public static void main(String[] args) {

		int[] arr = { 22, 27, 16, 2, 18, 6 };

		insertionSort(arr);

		System.out.println("Sorted Array:");
		for (int num : arr) {
			System.out.print(num + " ");
		}

	}

	/*
	 * Best Case: O(n) Worst Case: O(n^2) Average Case: O(n^2)
	 * 18 : Average Case
	 * 
	 */

}
