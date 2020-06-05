package Clase3;

import java.util.Scanner;

/**
 * Clase para capturar el nombre y la edad de la persona
 * 
 * @author jose.perez
 * @since 31/05/2020
 * @version 1
 *
 */

public class Persona {

	protected String nombre;
	protected int edad;
	protected Scanner teclado;

	/**
	 * Constructor
	 */

	public Persona() {
		teclado = new Scanner(System.in);
	}

	/**
	 * Metodo para cargar la información de la persona
	 */

	public void cargar() {
		System.out.println("Digite el Nombre: ");
		nombre = teclado.nextLine();
		System.out.println("Digite la Edad: ");
		edad = teclado.nextInt();
	}

	/**
	 * Metodo para imprimir la información de la persona
	 */

	public void imprimir() {
		System.out.println("El Nombre es: " + this.nombre);
		System.out.println("La Edad es: " + this.edad);
	}

}
