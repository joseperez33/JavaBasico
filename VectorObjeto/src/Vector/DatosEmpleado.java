package Vector;

import java.util.Scanner;

public class DatosEmpleado {

	String nombreEmpleado;
	int Salario;
	Scanner teclado;

	public DatosEmpleado() {
		teclado = new Scanner(System.in);
		System.out.print("Ingrese el nombre del empleado:");
		nombreEmpleado = teclado.nextLine();
		System.out.print("Ingrese sueldo del empleado:");
		Salario = teclado.nextInt();
	}

	public String getNombreEmpleado() {
		return nombreEmpleado;
	}

	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}

	public int getSalario() {
		return Salario;
	}

	public void setSalario(int salario) {
		Salario = salario;
	}

}
