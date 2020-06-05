package Clase2;

import java.util.Scanner;

public class TiposMEtodos {

	private Scanner teclado;
	private String nombre;
	private int edad;

	private TiposMEtodos() {
		teclado = new Scanner(System.in);
		System.out.println("Digite su nombre");
		this.nombre = teclado.nextLine();
		System.out.println("Digite su edad");
		this.edad = teclado.nextInt();
	}

	
	/**
	 * Metodo para validar si la persona es mayor de edad
	 * 
	 * @return mayor
	 */

	public String mayorEdad() {
		String mayor = "Mayor de edad";

		if (edad < 18) {
			mayor = "Menor de edad";
		}

		return mayor;
	}

	public void imprimir(String mayorEdad) {
		System.out.println("Bienvenido(a): " + nombre);
		System.out.println("Usted es: " + mayorEdad);
	}

	public static void main(String[] args) {

		TiposMEtodos tm = new TiposMEtodos();
		// tm.inicializar();
		String mayorEdad = tm.mayorEdad();
		tm.imprimir(mayorEdad);
	}

}
