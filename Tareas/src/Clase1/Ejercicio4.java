package Clase1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		int precio = 0, cantidad = 0, valor = 0;
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite el precio del artículo");
		precio = teclado.nextInt();
		System.out.println("Digite la cantidad del artículo");
		cantidad = teclado.nextInt();
		
		
		valor = precio * cantidad;

	
		System.out.println("El valor a pagar es: " + valor);

	}

}
