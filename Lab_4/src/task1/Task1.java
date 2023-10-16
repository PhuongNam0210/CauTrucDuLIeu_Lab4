package task1;

import java.util.Arrays;

public class Task1 {
	// sort by descending order
	public static void selectionSort(int[] array) {
		int n = array.length;

		for (int i = 0; i < n - 1; i++) {
			int maxIndex = i;

			for (int j = i + 1; j < n; j++) {
				if (array[j] > array[maxIndex]) {
					maxIndex = j;
				}
			}
			int temp = array[i];
			array[i] = array[maxIndex];
			array[maxIndex] = temp;
		}
	}

	// sort by descending order
	public static void bubbleSort(int[] array) {
		int n = array.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (array[j] < array[j + 1]) {
					// swap array[j+1] and array[i]
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
	}

	public static void insertionSort(int[] array) {
		int n = array.length;
		for (int j = 1; j < n; j++) {
			int key = array[j];
			int i = j - 1;
			while ((i > -1) && (array[i] < key)) {
				array[i + 1] = array[i];
				i--;
			}
			array[i + 1] = key;
		}
	}

	public static void main(String[] args) {
		int[] arr1 = { 64, 34, 25, 12, 22, 11, 90 };
		int[] arr2 = { 6, 74, 8, 10, 5, 22, 3, 41 };
		int[] arr3 = { 6, 72, 84, 11, 50, 24, 30, 4 };
		selectionSort(arr1);
		bubbleSort(arr2);
		insertionSort(arr3);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));

	}

}
