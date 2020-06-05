package Clase1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		int numero1 = 0, numero2 = 0, numero3 = 0, numero4 = 0, suma = 0, producto = 0;
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite el primer número");
		numero1 = teclado.nextInt();
		System.out.println("Digite el segundo número");
		numero2 = teclado.nextInt();
		System.out.println("Digite el tercer número");
		numero3 = teclado.nextInt();
		System.out.println("Digite el cuarto número");
		numero4 = teclado.nextInt();

		suma = numero1 + numero2;
		producto = numero3 * numero4;

		System.out.println("La suma de los dos primeros números es: " + suma);
		System.out.println("El producto de los dos últimos números es: " + producto);

	}

}
