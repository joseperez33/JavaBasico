package Clase3;

import java.util.Scanner;

/**
 * Vector Desarrollar un programa que permita ingresar un vector de n elementos,
 * ingresar n por teclado. Luego imprimir la suma de todos sus elementos.
 * 
 * @author jose.perez
 * @since 31/05/2020
 * @version 1
 */

public class Vector1 {

	private Scanner teclado;
	private int[] vector;

	/**
	 * Metodo de cargar
	 */

	public void cargar() {
		int cantidad;
		teclado = new Scanner(System.in);
		System.out.println("Cuantos elementos va a tener el vector:");

		cantidad = teclado.nextInt();
		vector = new int[cantidad];
		for (int i = 0; i < vector.length; i++) {
			System.out.println("Ingrese el valor del elemento:");
			vector[i] = teclado.nextInt();
		}
	}

	/**
	 * Metodo para sumar la informacion
	 */
	public void sumar() {
		int suma = 0;
		for (int i = 0; i < vector.length; i++) {
			suma = suma + vector[i];
		}
		System.out.println("La suma es: " + suma);
	}

	public static void main(String[] args) {
		Vector1 pv = new Vector1();
		pv.cargar();
		pv.sumar();
	}

}
