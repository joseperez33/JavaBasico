package Clase3;

import java.util.Scanner;

public class Personas {

	protected String nombre, apellido;
	protected int edad, telefono, tipoCuenta, saldo, valor, proceso;
	protected Scanner teclado;

	/**
	 * Constructor
	 */

	public Personas() {
		teclado = new Scanner(System.in);
	}

	/**
	 * Metodo para cargar la información de la persona
	 */

	public void cargar() {
		System.out.println("Digite el Nombre: ");
		nombre = teclado.nextLine();
		System.out.println("Digite el Apellido: ");
		apellido = teclado.nextLine();
		System.out.println("Digite la Edad: ");
		edad = teclado.nextInt();
		System.out.println("Digite el teléfono: ");
		telefono = teclado.nextInt();
		System.out.println("Digite el tipo de cuenta Ahorros(1) corriente(2): ");
		tipoCuenta = teclado.nextInt();
		System.out.println("Digite el saldo de la cuenta: ");
		saldo = teclado.nextInt();
		System.out.println("Qué proceso desea realizar? 1 - Consignar 2 - Retirar");
		proceso = teclado.nextInt();

		if (proceso == 1) {
			System.out.println("Cuanto desea consignar?");
			valor = teclado.nextInt();
		} else {
			System.out.println("Cuanto desea retirar?");
			valor = teclado.nextInt();
		}

	}

	/**
	 * Metodo para imprimir la información de la persona
	 */

	public void imprimir() {
		System.out.println("El Nombre es: " + this.nombre);
		System.out.println("El Apellido es: " + this.apellido);
		System.out.println("La Edad es: " + this.edad);
		System.out.println("El Teléfono es: " + this.telefono);

		if (this.tipoCuenta == 1) {
			System.out.println("La cuenta es Ahorros.");
		} else {
			System.out.println("La cuenta es Corriente.");
		}

		System.out.println("El Saldo Anterior es: " + this.saldo);

	}
	
	
	

}
