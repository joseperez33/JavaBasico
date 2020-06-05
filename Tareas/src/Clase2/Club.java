package Clase2;

import java.util.Scanner;

/**
 * Clase Club
 * 
 * @author jose.perez
 * @since 27/05/2020
 * @version 1
 */

public class Club {

	private Socio socio1, socio2, socio3;
	static Scanner teclado;

	/**
	 * Constructor
	 */

	public Club() {

		teclado = new Scanner(System.in);
		socio1 = new Socio(digitarNombre(), digitarAntiguedad());
		socio2 = new Socio(digitarNombre(), digitarAntiguedad());
		socio3 = new Socio(digitarNombre(), digitarAntiguedad());
	}

	/**
	 * Metodo para digitar el nombre
	 * 
	 * @return nombre
	 */
	private static String digitarNombre() {
		String nombre;
		System.out.println("Digite el nombre del socio: ");
		nombre = teclado.next();
		return nombre;
	}

	/**
	 * Metodo para digitar la antiguedad
	 * 
	 * @return antiguedad
	 */

	private static int digitarAntiguedad() {
		int antiguedad;
		System.out.println("Digite la antiguedad en años: ");
		antiguedad = teclado.nextInt();
		return antiguedad;
	}

	/**
	 * Metodo para procesar la antiguedad
	 */

	private void antiguedad() {
		int anti1, anti2, anti3;
		anti1 = socio1.antiguedad();
		anti2 = socio2.antiguedad();
		anti3 = socio3.antiguedad();

		if (anti1 > anti2 && anti1 > anti3) {
			System.out.println("El socio con mayor antiguedad es: " + socio1.socio());
		} else {
			if (anti2 > anti3) {
				System.out.println("El socio con mayor antiguedad es: " + socio2.socio());
			} else {
				System.out.println("El socio con mayor antiguedad es: " + socio3.socio());
			}

		}

	}

	public static void main(String[] arg) {
		Club cl = new Club();
		cl.antiguedad();
	}

}
