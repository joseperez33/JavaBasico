package Clase3;

import java.util.Scanner;

/**
 * Realice un programa que almacene en una matriz 10 valores capturados por
 * pantalla, y los almacene en una matriz de 2 x 5 y al final me genere un
 * vector con el resultado de la suma de cada fila
 * 
 * @author jose.perez
 * @since 31/05/2020
 * @version 1
 */

public class Matriz2 {

	private Scanner teclado;
	private int[][] matriz;
	private int[] vector;
	int valor;

	/**
	 * Metodo de carga de la informacion
	 */

	public void cargar() {
		teclado = new Scanner(System.in);
		matriz = new int[2][5];

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println("Digite el valor:");
				valor = teclado.nextInt();
				matriz[i][j] = valor;
			}

		}

	}

	/**
	 * MEtodo para cargar el vector
	 */
	public void cargarVector() {
		vector = new int[2];
		int suma;

		for (int i = 0; i < 2; i++) {
			suma = 0;
			for (int j = 0; j < 5; j++) {
				suma = suma + matriz[i][j];
			}
			vector[i] = suma;
		}

	}

	/**
	 * MEtodo para imprimir el vector
	 */

	public void imprimir() {

		for (int i = 0; i < 2; i++) {
			System.out.println(vector[i]);
		}
	}

	public static void main(String[] args) {
		Matriz2 m2 = new Matriz2();
		m2.cargar();
		m2.cargarVector();
		m2.imprimir();
	}

}
