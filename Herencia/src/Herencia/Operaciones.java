package Herencia;

import java.util.Scanner;

/**
 * Clase para capturar la informacion para las operaciones
 * 
 * @author jose.perez
 * @since 28/05/2020
 * @version 1
 *
 */

public class Operaciones {
	protected Scanner teclado;
	protected int valor1, valor2, resultado;

	/**
	 * Constructor de la clase
	 */

	public Operaciones() {

		teclado = new Scanner(System.in);
	}

	public void cargar() {
		System.out.println("Digite el valor de a: ");
		valor1 = teclado.nextInt();
		System.out.println("Digite el valor de b: ");
		valor2 =teclado.nextInt();
	}
	
	
	public void mostrarResultado() {
		System.out.println("El resultado es: " +this.resultado);
	}
}
