package br.com.algoritmos;

public class Search {
	public static int buscaBinaria(int[] sortedArray, int search) {

		int begin = 0;
		int end = sortedArray.length;
		int middle = 0;

		while (begin <= end) {
			middle = (end + begin)/2;
			if (search > sortedArray[middle]) {
				begin = middle + 1;
			} else {
				if (search < sortedArray[middle]) {
					end = middle - 1;
				} else {
					System.out.println("Achei na posicao " + middle);
					return middle;
				}
			}
		}
		return 0;
	}
}
