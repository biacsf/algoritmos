package br.com.algoritmos;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SearchTest {
	
	int[] array = {3,6,8,10,14,26,38,39,57,67,88,91,93};

	@Test
	public void testaBuscaBinariaValorExistente() {
		int busca = 91;
		
		assertEquals(11, Search.buscaBinaria(array, busca));
	}
	
	@Test
	public void testaBuscaBinariaValorNaoExistente() {
		int busca = 5;
		
		assertEquals(0, Search.buscaBinaria(array, busca));
	}
}
