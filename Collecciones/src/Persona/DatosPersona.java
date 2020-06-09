package Persona;

public class DatosPersona {

	int numero;
	String nombre;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public DatosPersona() {
		super();
	}
	
	
	public void imprimir() {
		System.out.println("Numero:" + getNumero());
		System.out.println("Nombre:" + getNombre());
	}

}
