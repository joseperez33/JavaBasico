package Clase2;

import java.util.Scanner;

/**
 * Ejericicio Número operaciones
 * 
 * @author jose.perez
 * @since 27/05/2020
 * @version 1
 */

public class Ejericicio1 {

	private Scanner teclado;
	private int numero1, numero2, resultado;

	public Ejericicio1() {
		teclado = new Scanner(System.in);
		System.out.println("Digite el primer número");
		this.numero1 = teclado.nextInt();
		System.out.println("Digite el segundo número");
		this.numero2 = teclado.nextInt();

	}

	/**
	 * Metodo para realizar la suma
	 * 
	 * @return resultado
	 */

	public int suma() {

		resultado = numero1 + numero2;

		return resultado;
	}

	/**
	 * Metodo para realizar la resta
	 * 
	 * @return resultado
	 */

	public int resta() {

		resultado = numero1 - numero2;

		return resultado;
	}

	/**
	 * Metodo para realizar la multiplicacion
	 * 
	 * @return resultado
	 */

	public int multiplicacion() {

		resultado = numero1 * numero2;

		return resultado;
	}

	/**
	 * Metodo para realizar la division
	 * 
	 * @return resultado
	 */
	public int division() {

		resultado = numero1 / numero2;

		return resultado;
	}

	public void imprimir() {
		System.out.println("La suma de los valores es: " + suma());
		System.out.println("La resta de los valores es: " + resta());
		System.out.println("La multiplicación de los valores es: " + multiplicacion());
		System.out.println("La división de los valores es: " + division());
	}

	public static void main(String[] args) {
		Ejericicio1 ej = new Ejericicio1();
		ej.imprimir();

	}

}
