package Clase2;

import java.util.Scanner;

public class EjercicioEmpleado {
	
	private Scanner teclado;
	private String nombre;
	private int salario;
	
	 /**
     * Metodo para cargar la informacion
     * 
     */
	
	public void carga() {
		teclado = new Scanner(System.in);
		System.out.println("Digite su nombre");
		nombre = teclado.nextLine();
		System.out.println("Digite su salario");
		salario = teclado.nextInt();
	}
	
	 /**
     * Metodo para imprimir los datos
     * 
     */
	
	public void imprimir() {
		System.out.println("Bienvenido(a): " + nombre);
		System.out.println("su salario es: " + salario);
	}
	
	 /**
     * Metodo para imprimir si debe pagar impuesto
     * 
     */
	public void imprimirImpuesto() {
		String impuesto = "Debe Pagar impuesto";
		if (salario < 3000000) {
			impuesto = "No debe pagar impuesto";
		}
		
		System.out.println(nombre +" "+impuesto );
	}
	

	public static void main(String[] args) {
		EjercicioEmpleado ee = new EjercicioEmpleado();
		ee.carga();
		ee.imprimir();
		ee.imprimirImpuesto();

	}

}
