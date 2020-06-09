package Vector;

import java.util.Scanner;

/**
 * 
 * @author jose.perez
 * @version 1
 *
 */

public class Vector {
	private Scanner teclado;
	private int[] sueldos;
	private String[] empleados;

	public void cargar() {
		teclado = new Scanner(System.in);
		sueldos = new int[5];
		empleados = new String[5];

		for (int f = 0; f < sueldos.length; f++) {
			System.out.print("Ingrese el nombre del empleado:");
			empleados[f] = teclado.next();
			System.out.print("Ingrese sueldo del empleado:");
			sueldos[f] = teclado.nextInt();
		}

	}

	public void imprimir() {

		for (int f = 0; f < sueldos.length; f++) {
			System.out.println(empleados[f]);
			System.out.println(sueldos[f]);
		}

	}

	public static void main(String[] args) {
		Vector pv = new Vector();
		pv.cargar();
		pv.imprimir();

	}

}
