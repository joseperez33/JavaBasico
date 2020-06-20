package Clase10;

/**
 * Ejercicio 2 Mostrar los números del 1 al 20, con un retardo de tiempo de 1500
 * mili-segundos. Para usar este retardo usar la función sleep(1500) de java
 * 
 * @author jose.perez
 * @since 20/06/2020
 * @version 1
 *
 */

public class Ejercicio2 extends Thread {

	public void run() {
		for (int i = 1; i <= 20; i++) {
			System.out.println(i);

			try {
				sleep(1500);
			} catch (InterruptedException e) {
				System.out.println("Error: "+e);
			}

		}
	}

	public static void main(String[] args) {
		Ejercicio2 ej2 = new Ejercicio2();
		ej2.start();

	}

}
