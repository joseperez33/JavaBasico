package Clase10;

import java.util.Scanner;

/**
 * En una clase con extension hilo crear el promedio de un alumno con el
 * ingreso de 5 notas
 * 
 * @author jose.perez
 *
 */

public class Ejercicio7 extends Thread {

	Scanner dato = new Scanner(System.in);

	public void run() {
		int n;
		int promedio = 0, nota = 1;
		int contador = 0;
		System.out.println("Promedio de notas");
		while (nota < 6) {
			System.out.println("digite la nota "+nota+ "ª");
			n = dato.nextInt();
			
			try {
				Thread.sleep(1500);
			} catch (Exception e) {
				System.out.println("error"+e);
			}
			nota++;
			contador = contador+n;
			promedio = contador/nota;
		}
		System.out.println("El promedio del alumno es: " + promedio);
	}

	public static void main(String[] args) {
		Ejercicio7 ej7 = new Ejercicio7();
		ej7.start();

	}

}
