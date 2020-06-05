package Stwich;

import java.util.Scanner;

public class Switch {
	Scanner teclado = new Scanner(System.in);

	private void menuOpcion1() {

		System.out.println("Menu Opcion 1");
		System.out.println("1. Opcion 1 Sub menu");
		System.out.println("2. Retornar al menu principal");
		System.out.println("Digite la opcion");

		int opcion = teclado.nextInt();

		switch (opcion) {
		case 1:
			System.out.println("Entro al submenu");
			break;
		case 2:
			System.out.println("Digito retornar");
			menuPrincipal();
			break;
		default:
			System.out.println("error");
			break;
		}
	}

	public void menuPrincipal() {

		System.out.println("Menu Principal");
		System.out.println("1. Opcion 1");
		System.out.println("2. Opcion 2");
		System.out.println("3. Salir");
		System.out.println("Digite la opcion");

		int opcion = teclado.nextInt();

		switch (opcion) {
		case 1:
			System.out.println("Digito la opcion 1");
			menuOpcion1();
			break;
		case 2:
			System.out.println("Digito la opcion 2");
			break;
		case 3:
			System.out.println("Digito la opcion 3");
			System.exit(0);
			break;

		default:
			System.out.println("error");
			menuPrincipal();
			break;
		}

	}

	public static void main(String[] args) {
		Switch s = new Switch();
		s.menuPrincipal();

	}

}
