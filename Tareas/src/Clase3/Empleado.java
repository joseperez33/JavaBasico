package Clase3;

/**
 * Clase Persona
 * 
 * @author jose.perez
 * @since 31/05/2020
 * @version 1
 */

public class Empleado extends Persona {
	protected int sueldo;

	public void cargarSueldo() {
		System.out.print("Ingrese el sueldo:");
		sueldo = teclado.nextInt();
	}

	public void imprimirSueldo() {
		System.out.println("El sueldo es:" + sueldo);
	}

}
