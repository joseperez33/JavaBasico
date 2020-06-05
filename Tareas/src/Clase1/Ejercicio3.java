package Clase1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		int x = 1, suma = 0, nota = 0, promedio = 0;
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);

		while (x <= 3) {
			System.out.println("Digite la nota " + x);
			nota = teclado.nextInt();
			suma = suma + nota;
			x = x + 1;
		}

		promedio = suma / 3;

		if (promedio >= 7) {
			System.out.println("Promocionado");
		}

	}

}
