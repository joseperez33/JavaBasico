package Clase2;

import java.util.Scanner;

public class Salario {

	Scanner teclado;
	int salario = 0;
	final int valorExtra = 120000;
	int salarioExtra = 0;
	boolean impuesto = false;

	public Salario(int salario) {
		this.salario = salario;
	}

	private boolean impuestos() {

		if (salario >= 3000000) {
			impuesto = true;
		}
		return impuesto;
	}

	private void extras(int cantiExtras) {

		this.salarioExtra = valorExtra * cantiExtras;

	}

	public void imprimir() {

		impuestos();
		teclado = new Scanner(System.in);
		System.out.println("Digite la cantidad de horas");
		extras(teclado.nextInt());

		System.out.println("El salario de la persona es: " + this.salario);

		if (impuesto)
			System.out.println("Debe pagar impuesto");
		else
			System.out.println("No Debe pagar impuesto");

		System.out.println("La cantidad de he son: " + this.salarioExtra);
	}

}
