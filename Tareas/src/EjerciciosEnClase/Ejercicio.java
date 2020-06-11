package EjerciciosEnClase;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio {
	private static Scanner teclado = new Scanner(System.in);
	private static int[] vector;

	public Ejercicio() {
		vector = new int[10];
	}

	public void cargarposicion(int pos) {

		try {
			System.out.println("Ingrese el valor del elemento: " + pos);
			vector[pos] = teclado.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Debe ingresar un numero entero.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Debe ingresar un numero entero.");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {

		/*
		 * try { for (int i = 0; i < vector.length; i++) {
		 * System.out.println("Ingrese el valor del elemento: " + i); vector[i] =
		 * teclado.nextInt(); }
		 * 
		 * for (int i = 0; i < vector.length; i++) { System.out.println(vector[i]); }
		 * 
		 * } catch (InputMismatchException e) {
		 * System.out.println("Debe ingresar un numero entero."); } catch (Exception e)
		 * { System.out.println(e); }
		 * 
		 * }
		 */
		Ejercicio e = new Ejercicio();
		System.out.println("Digite la cantidad de numero a ingresar");
		int cantidad = teclado.nextInt();

		for (int i = 0; i < cantidad; i++) {
			System.out.println("Digite la posicion");
			int pos = teclado.nextInt();
			e.cargarposicion(pos);
		}

	}

}
