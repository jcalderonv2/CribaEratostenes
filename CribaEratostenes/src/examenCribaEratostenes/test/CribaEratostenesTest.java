package examenCribaEratostenes.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;
import examenCribaEratostenes.CribaEratostenes;

public class CribaEratostenesTest {

	CribaEratostenes criba = new CribaEratostenes();

	// Verifica que si el numero es menor a 2 entonces el arreglo deberia estar
	// vacio.
	@Test
	public void ArregloSinPrimos() {

		int[] primosVacio;

		primosVacio = criba.generaCriba(1);

		assertEquals("[]", Arrays.toString(primosVacio));
	}

	// Verifica que si el tope es de 8 contenga los 4 numeros primos.
	@Test
	public void ArregloConPrimos() {

		int[] arregloConPrimos;

		arregloConPrimos = criba.generaCriba(8);

		assertEquals("[2, 3, 5, 7]", Arrays.toString(arregloConPrimos));
	}

	// Tamanno del arreglo hasta un tope de 8.
	@Test
	public void primosHastaTope8() {

		int[] tope;

		tope = criba.generaCriba(8);

		assertEquals(4, tope.length);
	}

	// Verifica los numeros primos con diferentes topes
	@Test
	public void PrimosConVariosTopes() {

		int[] arregloTope8;
		int[] arregloTope24;
		int[] arregloTope54;
		int[] arregloTope74;
		int[] arregloTope99;

		arregloTope8 = criba.generaCriba(8);
		arregloTope24 = criba.generaCriba(24);
		arregloTope54 = criba.generaCriba(54);
		arregloTope74 = criba.generaCriba(74);
		arregloTope99 = criba.generaCriba(99);

		assertEquals("[2, 3, 5, 7]", Arrays.toString(arregloTope8));
		assertEquals("[2, 3, 5, 7, 11, 13, 17, 19, 23]", Arrays.toString(arregloTope24));
		assertEquals("[2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53]", Arrays.toString(arregloTope54));
		assertEquals("[2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73]", Arrays.toString(arregloTope74));
		assertEquals("[2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97]", Arrays.toString(arregloTope99));
	}

}
