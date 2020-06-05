package Clase2;

import java.util.Scanner;

public class ColaboracionClases {	
	
	static int identificacion,salario;
	static String tipoIdentificacion;
	static String nombreCompleto;
	
	
	
	public ColaboracionClases() {
		Scanner teclado = new  Scanner(System.in);
		System.out.println("Digite su numero de identificación");
		identificacion = teclado.nextInt();
		System.out.println("Digite su tipo de identificación");
		tipoIdentificacion = teclado.next();
		System.out.println("Digite su nombre");
		nombreCompleto = teclado.next();
		System.out.println("Digite su salario");
		salario = teclado.nextInt();
	}



	public static void main(String[] args) {
		ColaboracionClases cc = new ColaboracionClases();
		DatosPersona dp = new DatosPersona(identificacion, tipoIdentificacion, nombreCompleto);
		Salario s = new Salario(salario);
		s.imprimir();
		
	}

}
