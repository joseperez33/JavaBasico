package Clase5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Crear un programa con un ArrayList para Calcular la altura media de los
 * alumnos de una clase
 * 
 * Programa Java que pida por teclado las alturas de N alumnos de una clase y
 * las guarde en un ArrayList de tipo Double.
 * 
 * A continuaci�n el programa calcular� la altura media de todos los alumnos,
 * cuantos alumnos hay m�s altos que la media y cuantos m�s bajos.
 * 
 * Para resolverlo se deben utilizar 4 m�todos adem�s del m�todo main:
 * 
 * M�todo numeroAlumnos(): este m�todo pide por teclado el n�mero de alumnos de
 * la clase y devuelve dicho n�mero al programa principal.
 * 
 * M�todo leerAlturas(): pide por teclado las alturas de los N alumnos y las
 * almacena en el ArrayList. Este m�todo recibe como par�metros el ArrayList
 * inicialmente vac�o y el n�mero de alumnos a leer.
 * 
 * M�todo calcularMedias(): calcula y devuelve la media de los alumnos de la
 * clase. Este m�todo recibe como par�metro el ArrayList con las alturas de
 * todos los alumnos.
 * 
 * M�todo mostrarResultados(): muestra por pantalla todas las alturas y calcula
 * y muestra el n�mero de alumnos con altura superior e inferior a la media.
 * Recibe como par�metros el ArrayList con las alturas de todos los alumnos y la
 * media calculada anteriormente.
 * 
 * 
 * @author jose.perez
 * @since 06/06/2020
 * @version 1
 * 
 *
 */

public class Ejercicio1 {

	static Scanner teclado;

	/**
	 * M�todo numeroAlumnos(): este m�todo pide por teclado el n�mero de alumnos de
	 * la clase y devuelve dicho n�mero al programa principal.
	 * 
	 * @return pnumeroAlumnos
	 */

	public static int numeroAlumnos() {
		teclado = new Scanner(System.in);
		int pnumeroAlumnos;

		System.out.println("Digite la cantidad de alumnos: ");
		pnumeroAlumnos = teclado.nextInt();

		return pnumeroAlumnos;
	}

	/**
	 * M�todo leerAlturas(): pide por teclado las alturas de los N alumnos y las
	 * almacena en el ArrayList. Este m�todo recibe como par�metros el ArrayList
	 * inicialmente vac�o y el n�mero de alumnos a leer.
	 * 
	 * @param ald
	 * @param cantidad
	 */

	public static void leerAlturas(ArrayList<Double> ald, int cantidad) {
		teclado = new Scanner(System.in);
		int i;
		double altura;

		for (i = 1; i <= cantidad; i++) {
			System.out.println("Digite la altura del Alumno " + i + " : ");
			altura = teclado.nextDouble();
			ald.add(altura);
		}
	}

	/**
	 * M�todo calcularMedias(): calcula y devuelve la media de los alumnos de la
	 * clase. Este m�todo recibe como par�metro el ArrayList con las alturas de
	 * todos los alumnos.
	 * 
	 * @param al
	 * @return mediaCalculada
	 */

	public static double calcularMedia(ArrayList<Double> al) {
		double media = 0, mediaCalculada;

		for (Double altura : al) {
			media = media + altura;
		}
		mediaCalculada = media / al.size();

		return mediaCalculada;
	}

	/**
	 * M�todo mostrarResultados(): muestra por pantalla todas las alturas y calcula
	 * y muestra el n�mero de alumnos con altura superior e inferior a la media.
	 * Recibe como par�metros el ArrayList con las alturas de todos los alumnos y la
	 * media calculada anteriormente.
	 * 
	 * @param a
	 * @param media
	 */

	public static void mostrarResultados(ArrayList<Double> al, double media) {
		int alturaSuperior = 0, alturaInferior = 0;

		System.out.println("alturas introducidas: ");
		System.out.println(al);
		for (Double altura : al) {
			if (altura > media)
				alturaSuperior++;
			else if (altura < media)
				alturaInferior++;
		}
		System.out.println("La Mediade los alumnos es: " + media);
		System.out.println("Hay " + alturaSuperior + " alumnos m�s altos que la media");
		System.out.println("Hay " + alturaInferior + " alumnos m�s bajos que la media");
	}

	/**
	 * Crear un programa con un ArrayList para Calcular la altura media de los
	 * alumnos de una clase
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		ArrayList<Double> al = new ArrayList<Double>();
		int alumnos;
		double media;
		alumnos = numeroAlumnos();
		leerAlturas(al, alumnos);
		media = calcularMedia(al);
		mostrarResultados(al, media);
	}

}
