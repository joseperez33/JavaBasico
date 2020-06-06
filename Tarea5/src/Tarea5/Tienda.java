package Tarea5;

import java.util.ArrayList;
import java.util.Scanner;

/***
 * 
 * @author jose.perez @since05/06/2020
 * @version 1
 *
 */

public class Tienda {

	Scanner teclado = new Scanner(System.in);
	ArrayList<DatosPersona> al1 = new ArrayList<DatosPersona>();
	private int busqueda;

	public void menuPrincipal() {

		System.out.println("Bienvenido a la Tienda");
		System.out.println("1. Digitar Cliente");
		System.out.println("2. Productos");
		System.out.println("3. Ventas");
		System.out.println("4. Salir");
		System.out.println("Digite la opcion");

		int opcion = teclado.nextInt();

		switch (opcion) {
		case 1:
			cliente();
			break;
		case 2:
			System.out.println("Digito la opcion 2");
			break;
		case 3:
			System.out.println("Digito la opcion 3");
			break;
		case 4:
			System.out.println("Digito la opcion 4");
			System.exit(0);
			break;

		default:
			System.out.println("error");
			menuPrincipal();
			break;
		}

	}

	public void cliente() {
		
				
		if (!buscar()) {
			System.out.println("El cliente no existe debe digitarlo");
			for (int i = 0; i < 1; i++) {
				DatosPersona dp = new DatosPersona();
				al1.add(dp);
			}
		}
		
	}

	public boolean buscar() {
		System.out.println("Digite el numero de documento del cliente");
		setBusqueda(teclado.nextInt());

		int indice = al1.indexOf(getBusqueda());
				
		
		if (indice != -1) {
			System.out.println("El elemento SÍ existe en la lista");
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {

		Tienda t = new Tienda();
		t.menuPrincipal();

	}

	public int getBusqueda() {
		return busqueda;
	}

	public void setBusqueda(int busqueda) {
		this.busqueda = busqueda;
	}

	

}
