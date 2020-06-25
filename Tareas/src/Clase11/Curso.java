package Clase11;

import java.util.Scanner;
import java.util.Stack;

public class Curso {
	static Scanner teclado = new Scanner(System.in);
	static String dato;
	static int cantidad = 3;
	
	Stack<DatosAlumno> da = new Stack<DatosAlumno>();
	DatosAlumno da1 = new DatosAlumno();

	public void CargarAlumno() {
		System.out.print("Digite el nombre: ");
		dato = teclado.next();
		da1.setNombre(dato);
		System.out.print("Digite la identificacion: ");
		dato = teclado.next();
		da1.setNumero(dato);
		;
		System.out.print("Digite el telefono: ");
		dato = teclado.next();
		da1.setTelefono(dato);
		;
		System.out.print("Digite la direccion: ");
		dato = teclado.next();
		da1.setDireccion(dato);
		da.push(da1);
	}
	
	public boolean validarCupo() {
		
		if (da.size() >= cantidad) {
			return false;
		} else {
			return true;
		}
		
	}


}
