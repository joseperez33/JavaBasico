package Clase3;

import java.util.Scanner;

/**
 * Crear una matriz de n * m filas (cargar n y m por teclado) Intercambiar la
 * primer fila con la segundo. Imprimir luego la matriz.
 * 
 * @author jose.perez
 * @since 31/05/2020
 * @version 1
 *
 */

public class Matriz1 {

	private Scanner teclado;
	private int[][] matriz;
	int fila, columna, valor;
	
	/**
	 * Metodo carga de informacion
	 */

	public void cargar() {

		teclado = new Scanner(System.in);

		System.out.println("Cuantas fila tiene la matriz:");
		fila = teclado.nextInt();
		System.out.println("Cuantas columnas tiene la matriz:");
		columna = teclado.nextInt();
		matriz = new int[fila][columna];

		for (int i = 0; i < fila; i++) {
			for (int j = 0; j < columna; j++) {
				System.out.println("Digite el valor:");
				valor = teclado.nextInt();
				matriz[i][j] = valor;
			}

		}

	}
	
	/**
	 * Metodo cambio de fila
	 */

	public void cambio() {
		int valor = 0;
		for (int i = 0; i < matriz.length; i++) {
			valor = matriz[0][i];
			matriz[0][i] = matriz[1][i];
			matriz[1][i] = valor;
		}
	}
	
	/**
	 * Metodo para imprimir
	 */

	public void imprimir() {
		for (int i = 0; i < fila; i++) {
			for (int j = 0; j < columna; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Matriz1 m1 = new Matriz1();
		m1.cargar();
		m1.cambio();
		m1.imprimir();
	}

}
