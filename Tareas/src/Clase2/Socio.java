package Clase2;

/**
 * Clase Socio
 * 
 * @author jose.perez
 * @since 27/05/2020
 * @version 1
 */

public class Socio {

	private String nombre;
	private int antiguedad;

	/**
	 * Constructor
	 * 
	 * @param nombreSocio
	 * @param antiguedadSocio
	 */

	public Socio(String nombreSocio, int antiguedadSocio) {
		this.nombre = nombreSocio;
		this.antiguedad = antiguedadSocio;
	}

	/**
	 * Metodo que retorna el nombre del socio
	 * 
	 * @return nombre
	 */

	public String socio() {
		return nombre;
	}

	/**
	 * Metodo que retorna la antiguedad del socio
	 * 
	 * @return antiguedad
	 */

	public int antiguedad() {
		return antiguedad;
	}

}
