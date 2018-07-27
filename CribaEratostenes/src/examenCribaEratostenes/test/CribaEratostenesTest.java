package examenCribaEratostenes.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import examenCribaEratostenes.CribaEratostenes;

public class CribaEratostenesTest {

	CribaEratostenes criba = new CribaEratostenes();

	@Test
	public void ArregloPrimosConTope8() {

		int[] tope = criba.generaCriba(8);

		assertFalse(1 == tope[0]);
		assertTrue(2 == tope[0]);
		assertTrue(3 == tope[1]);
		assertTrue(5 == tope[2]);
		assertTrue(7 == tope[3]);
	}

}
