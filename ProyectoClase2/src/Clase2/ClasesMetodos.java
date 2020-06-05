package Clase2;

import java.util.Scanner;

public class ClasesMetodos {

	static int edad;
	static String mayor, nombre;

	public void mayorEdad() {
		if (edad < 18) {
			mayor = "Menor de edad";
		}
	}

	public void imprimir() {
		mayorEdad();
		System.out.println("Bienvenido(a): " + nombre);
		System.out.println("Usted es: " + mayor);
	}

	public static void main(String[] args) {
		ClasesMetodos cm = new ClasesMetodos();

		Scanner capturar = new Scanner(System.in);
		System.out.println("Digite su nombre");
		nombre = capturar.nextLine();
		System.out.println("Digite su edad");
		edad = capturar.nextInt();
		mayor = "Mayor de edad";
		// cm.mayorEdad();
		cm.imprimir();
	}

}
