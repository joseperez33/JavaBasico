package PaqueteInicial;

import java.util.Scanner;

public class ProgramaSecuencial {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);

		int a = 0, b = 0, suma = 0, resta = 0;

		System.out.println("Digite el valor de a");
		a = teclado.nextInt();
		System.out.println("Digite el valor de b");
		b = teclado.nextInt();

		if (a > b) {
			suma = a + b;
			System.out.println("El resultado de la Suma de a: " + a + " + b: " + b + " es " + suma);
		}

		if (a > b) {
			suma = a + b;
			System.out.println("El resultado de la Suma de a: " + a + " + b: " + b + " es " + suma);
		} else {
			resta = a - b;
			System.out.println("El resultado de la Resta de a: " + a + " - b: " + b + " es " + resta);
		}

		if (a > b) {
			suma = a + b;
			System.out.println("El resultado de la Suma de a: " + a + " + b: " + b + " es " + suma);
		} else {
			if (a > b) {
				resta = a - b;
				System.out.println("El resultado de la Resta de a: " + a + " - b: " + b + " es " + resta);
			} else {
				System.out.println("Los valores son iguales");
			}
		}

		int x = 1;
		System.out.println("x");
		while (x <= 10) {
			System.out.println(x);
			x = x + 1;
		}

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}

}
