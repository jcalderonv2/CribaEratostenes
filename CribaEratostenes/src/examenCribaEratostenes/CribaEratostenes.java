package examenCribaEratostenes;

public class CribaEratostenes {

	public int[] generaCriba(int tope) {

		return retornoPrimos(tope);

	}

	public void CalcularPrimos(int dim, boolean[] primo) {

		int i;

		for (i = 0; i < dim; i++) {

			primo[i] = true;

		}

		primo[0] = primo[1] = false;

		for (i = 2; i < Math.sqrt(dim) + 1; i++) {

			if (primo[i]) {

				for (int j = 2 * i; j < dim; j += i) {

					primo[j] = false;

				}

			}

		}

	}

	public int[] contadorNumeros(int tope, boolean[] primo) {

		int i, j, cuenta = 0;

		for (i = 0; i < tope; i++) {

			if (primo[i])

				cuenta++;

		}
		int[] primos = new int[cuenta];

		for (i = 0, j = 0; i < tope; i++) {

			if (primo[i])

				primos[j++] = i;

		}

		return primos;

	}

	public int[] retornoPrimos(int tope) {

		int dim = tope + 1;
		if (tope >= 2) {

			boolean[] primo = new boolean[dim];
			CalcularPrimos(dim, primo);
			int[] primos = contadorNumeros(tope, primo);

			return primos;

		} else {

			return new int[0];

		}

	}

}
