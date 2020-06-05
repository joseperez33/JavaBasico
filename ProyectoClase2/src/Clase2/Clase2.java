package Clase2;

import java.util.Scanner;

public class Clase2 {

	public static void main(String[] args) {
		
		Scanner capturar = new Scanner(System.in);
		System.out.println("Digite su nombre");		
		String nombre = capturar.nextLine();
		System.out.println("Digite su edad");
		int edad = capturar.nextInt();
		String	mayor = "Mayor de edad";
		
		if (edad < 18) {			
			mayor = "Menor de edad";
		}
		
		System.out.println("Bienvenido(a): "+nombre);
		System.out.println("Usted es: "+mayor);

	}

}
