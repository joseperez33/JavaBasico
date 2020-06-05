package Clase1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		int numero = 0, valor = 0;
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite un número entre 1 y 10");
		numero = teclado.nextInt();
		
		
		
		if (numero > 0 && numero <= 10) {
			for (int i = 1; i < 13; i++) {
				valor =  numero * i;
				System.out.println(valor+",");
			}
		} else {
			System.out.println("Número no valido.");
		}		

	}

}
