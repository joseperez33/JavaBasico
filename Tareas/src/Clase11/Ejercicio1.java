package Clase11;

import java.util.Scanner;

public class Ejercicio1 {
	static Scanner teclado = new Scanner(System.in);
	static int opcion;

	

	public static void menuPrincipal() {

		System.out.println("Bienvenido al menú");
		System.out.println("1. Matricula alumno");
		System.out.println("2. Buscar alumno");
		System.out.println("3. Ver datos curso");
		System.out.println("4. Salir");
		System.out.print("Digite la opción: ");

		opcion = teclado.nextInt();

		switch (opcion) {
		case 1:
			Curso c = new Curso();
			c.CargarAlumno();
			menuPrincipal();
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		default:
			System.out.println("error");
			break;
		}
	}

	public static void main(String[] args) {

		menuPrincipal();

	}

}
