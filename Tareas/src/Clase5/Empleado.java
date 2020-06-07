package Clase5;

public abstract class Empleado {

	String Nombre, Apellido;
	int Edad, Salario;
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public int getEdad() {
		return Edad;
	}
	public void setEdad(int edad) {
		Edad = edad;
	}
	public int getSalario() {
		return Salario;
	}
	public void setSalario(int salario) {
		Salario = salario;
	}
	
	public Empleado(String nombre, String apellido, int edad, int salario) {
		super();
		Nombre = nombre;
		Apellido = apellido;
		Edad = edad;
		Salario = salario;
	}
	
	public abstract boolean extras (double sueldoExtra);
	

}
