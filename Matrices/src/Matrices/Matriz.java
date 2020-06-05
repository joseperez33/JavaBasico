package Matrices;

import java.util.Scanner;

public class Matriz {

	private Scanner teclado;
	private String[][] empleado;

	public Matriz() {
		teclado = new Scanner(System.in);
		empleado = new String[3][5];

		for (int i = 0; i < 5; i++) {
			System.out.println("Digite el nombre del empleado");
			empleado[0][i] = teclado.next();
			System.out.println("Digite el tipo de contrato");
			empleado[1][i] = teclado.next();
			System.out.println("Digite el salario");
			empleado[2][i] = teclado.next();
		}

	}

	public void imprimir() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(empleado[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Matriz mt = new Matriz();
		mt.imprimir();
	}

}
