package Clase10;

import java.util.Scanner;

/**
 * Ejercicio 1 Ingresar el nombre de dos usuarios, el día y la hora que ingreso
 * a su centro de labores, e indicar si llego temprano o tarde, cabe señalar que
 * la hora de ingreso es a las 8:00.
 * 
 * @author jose.perez
 * @since 20/06/2020
 * @version 1
 *
 */

public class Ejercicio1 extends Thread {

	Scanner teclado = new Scanner(System.in);
	String nombre, dia;
	int hora;

	/**
	 * Constructor de la clase
	 * 
	 * @param nombre
	 * @param dia
	 * @param hora
	 */

	public Ejercicio1(String vnombre, String vdia, int vhora) {
		this.nombre = vnombre;
		this.dia = vdia;
		this.hora = vhora;

		System.out.println("Ingrese el nombre del usuario :");
		nombre = teclado.next();
		System.out.println("Ingrese el dia :");
		dia = teclado.next();
		System.out.println("Ingrese la hora :");
		hora = teclado.nextInt();

	}

	public void run() {
		if (hora > 800) {
			System.out.println("El usuario " + nombre + " llego tarde el día " + dia + " a las " + hora);
		} else {
			System.out.println("El usuario " + nombre + " llego temprano el día " + dia + " a las " + hora);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Ejercicio1 u1 = new Ejercicio1(" ", " ", 0);
		u1.start();
		Thread.sleep(3000);
		Ejercicio1 u2 = new Ejercicio1(" ", " ", 0);
		u2.start();

	}

}
