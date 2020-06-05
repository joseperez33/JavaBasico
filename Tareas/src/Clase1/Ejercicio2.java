package Clase1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int x= 1, suma=0, numero=0,promedio=0;
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		while (x <= 4) {
			System.out.println("Digite un número");
			numero = teclado.nextInt();
			suma = suma + numero;	
			x = x +1;
		}
		
		promedio = suma / 4;

		System.out.println("La suma de los números es: "+suma);
		System.out.println("El promedio de los números es: "+promedio);

	}

}
