package Clase10;

import java.util.Scanner;

/**
 * Ejericicio 3 Mostrar el nombre de un atleta y simular que corre 30 km. Para
 * simular el recorrido usar sleep(3500)
 * 
 * @author Jose.Perez
 *
 */

public class Ejercicio3 extends Thread {

	Scanner teclado = new Scanner(System.in);

	public void run() {
		String nombre;
		System.out.println("Digite el nombre del atleta: ");
		nombre = teclado.next();

		for (int i = 0; i <= 30; i++) {
			System.out.println(i + " KM");
		}
		
		try {
			sleep(3500);
		} catch (InterruptedException e) {
			System.out.println("Error: "+e);
		}
		System.out.println("Llego a la meta el atleta " + nombre);
		
	}

	public static void main(String[] args) {
		Ejercicio3 ej3 = new Ejercicio3();
		ej3.start();

	}

}
