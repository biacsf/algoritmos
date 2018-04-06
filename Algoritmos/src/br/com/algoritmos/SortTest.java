package br.com.algoritmos;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class SortTest {
	
	int[] array = {87,43,65,1,47,5,8,2,3,94,87,34,65,23,15,8,3,5,67};

	@Test
	public void testaSelectionSort() {
		
		int[] sortedBySelectionSort = Sort.selectionSort(array);
		
		Arrays.sort(array);
		
		assertEquals(array, sortedBySelectionSort);		
	}
	
	@Test
	public void testaInsertionSort() {
		
		int[] sortedByInsertionSort = Sort.insertionSort(array);
		
		Arrays.sort(array);
		
		assertEquals(array, sortedByInsertionSort);		
	}
}
