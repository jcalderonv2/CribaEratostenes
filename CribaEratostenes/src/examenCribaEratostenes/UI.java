package examenCribaEratostenes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class UI {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {

		digitarNumero();

	}

	private static void digitarNumero() throws IOException {

		int num;

		System.out.println("Digite el numero tope");
		num = Integer.parseInt(in.readLine());
		System.out.println();

		primos(num);

	}

	private static void primos(int num) throws IOException {
		
		CribaEratostenes criba = new CribaEratostenes();
		System.out.println("Los numero primos hasta " + num + " son: ");
		System.out.println();
		System.out.println(Arrays.toString(criba.generaCriba(num)));
		System.out.println();
		digitarNumero();
	}

}
