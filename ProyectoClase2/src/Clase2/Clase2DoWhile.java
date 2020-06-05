package Clase2;

import java.util.Scanner;

public class Clase2DoWhile {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int valor;

		do {
			System.out.println("Ingrese el valor entre 0 y 999, (0 = Salir)");
			valor = teclado.nextInt();

			if (valor >= 100) {
				System.out.println("Tiene 3 digitos");
			} else {
				if (valor >= 10) {
					System.out.println("Tiene 2 digitos");
				} else {
					System.out.println("Tiene 1 digitos");
				}
			}

		} while (valor != 0);

	}

}
