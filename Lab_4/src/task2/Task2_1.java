package task2;

import java.util.Arrays;

public class Task2_1 {
	public static void mergeSort(int[] array, int first, int last) {
		if (first < last) {
			int middle = (first + last) / 2;
			mergeSort(array, first, middle);
			mergeSort(array, middle + 1, last);
			merge(array, first, middle, last);
		}
	}

	public static void merge(int[] array, int first, int middle, int last) {
		int[] leftArray = new int[middle - first + 1];
		int[] rightArray = new int[last - middle];

		for (int i = 0; i < leftArray.length; i++) {
			leftArray[i] = array[first + i];
		}

		for (int i = 0; i < rightArray.length; i++) {
			rightArray[i] = array[middle + 1 + i];
		}

		int leftIndex = 0;
		int rightIndex = 0;
		int currentIndex = first;

		while (leftIndex < leftArray.length && rightIndex < rightArray.length) {
			if (leftArray[leftIndex] >= rightArray[rightIndex]) {
				array[currentIndex] = leftArray[leftIndex];
				leftIndex++;
			} else {
				array[currentIndex] = rightArray[rightIndex];
				rightIndex++;
			}
			currentIndex++;
		}

		while (leftIndex < leftArray.length) {
			array[currentIndex] = leftArray[leftIndex];
			leftIndex++;
			currentIndex++;
		}

		while (rightIndex < rightArray.length) {
			array[currentIndex] = rightArray[rightIndex];
			rightIndex++;
			currentIndex++;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 6, 0, 7, 8, 1, 5, 2, 3, 4, 8 };
		mergeSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}
}
