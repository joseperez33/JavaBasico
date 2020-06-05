package Clase3;

/**
 * Clase para cargar e imprimir la información
 * 
 * @author jose.perez
 * @since 31/05/2020
 * @version 1
 */

public class Empresa {

	public static void main(String[] args) {
		Persona pe = new Persona();
		pe.cargar();
		pe.imprimir();
		Empleado em = new Empleado();
		em.cargarSueldo();
		em.imprimirSueldo();

	}

}
