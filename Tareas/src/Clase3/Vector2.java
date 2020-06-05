package Clase3;

import java.util.Scanner;

/**
 * Desarrollar un programa que pregunte la cantidad de personas a almacenar. Con
 * la cantidad de personas crear un vector con ese tamaño. Solicitar los nombres
 * de las personas por consola y almacenarlos en los vectores. El programa debe
 * permitir lo siguiente:
 * 
 * Contar la cantidad de nombres que se tienen almacenados en el vector Imprimir
 * los nombres almacenados en el vector Buscar un nombre en el vector y contar
 * la cantidad de veces que esta almacenado Actualizar un nombre del vector e
 * imprimir el resultado
 * 
 * @author jose.perez
 * @since 31/05/2020
 * @version 1
 */

public class Vector2 {

	private Scanner teclado;
	private String[] nombre;

	/**
	 * Metodo de carga
	 */

	public void cargar() {
		int cantidad;
		teclado = new Scanner(System.in);
		System.out.println("Cuantas Personas se van almacenar?:");

		cantidad = teclado.nextInt();
		nombre = new String[cantidad];
		for (int i = 0; i < nombre.length; i++) {
			System.out.println("Ingrese el nombre de la persona:");
			nombre[i] = teclado.next();
		}
	}

	/**
	 * Metodo impimir cantidad de nombres
	 */

	public void imprimirCantidad() {

		System.out.println("La cantidad de nombres es: " + nombre.length);

	}

	/**
	 * Metodo para imprimir los nombres
	 */
	public void imprimir() {

		for (int i = 0; i < nombre.length; i++) {
			System.out.println(nombre[i]);

		}
	}

	/**
	 * Metodo para buscar el nombre
	 */
	public void buscar() {
		String buscar;
		int contador = 0;

		System.out.println("Ingrese el nombre que desea buscar: ");
		buscar = teclado.next();

		for (int i = 0; i < nombre.length; i++) {
			if (nombre[i].equals(buscar)) {
				contador++;
			}

		}
		System.out.println("La cantidad de veces que esta el nombre :" + buscar + " es " + contador);
	}

	/**
	 * Metodo para reemplazar la informacion
	 */
	public void reemplazar() {
		String buscar, reemplazo;

		System.out.println("Ingrese el nombre que desea reemplazar: ");
		buscar = teclado.next();
		System.out.println("Reemplazar por : ");
		reemplazo = teclado.next();

		for (int i = 0; i < nombre.length; i++) {
			if (nombre[i].equals(buscar)) {
				nombre[i] = reemplazo;
			}

		}

		imprimir();

	}

	public static void main(String[] args) {
		Vector2 pv = new Vector2();
		pv.cargar();
		pv.imprimirCantidad();
		pv.imprimir();
		pv.buscar();
		pv.reemplazar();

	}

}
