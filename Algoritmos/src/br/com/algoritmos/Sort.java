package br.com.algoritmos;

public class Sort {

	public static int[] selectionSort(int[] array) {

		for (int i = 0; i < array.length; i++) {
			int min_idx = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[min_idx]) {
					min_idx = j;
				}
			}
			array = swap(min_idx, i, array);
		}
		return array;
	}

	public static int[] insertionSort(int[] array) {

		for (int i = 1; i < array.length; i++) {
			int indice = i;
			while (indice > 0 && array[indice] < array[indice - 1]) {
				swap(indice, indice-1, array);
				indice--;
			}
		}
		return array;
	}

	public static int[] swap(int i, int j, int[] array) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
		return array;
	}
}
