package Clase11;

public class DatosAlumno {

	String nombre, direccion, numero, telefono;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public void imprimir() {
		System.out.println("Identificacion:" + getNumero());
		System.out.println("Nombre:" + getNombre());
		System.out.println("Direccion:" + getDireccion());
		System.out.println("Telefono:" + getTelefono());
	}

}
