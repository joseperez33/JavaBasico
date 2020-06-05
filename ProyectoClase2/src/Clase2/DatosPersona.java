package Clase2;

/***
 * Clase para almacenar la info de la persona
 * 
 * @author jose.perez
 *
 */

public class DatosPersona {

	int identificacion;
	String tipoIdentificacion;
	String nombre_completo;

	/**
	 * @param identificacion
	 * @param tipoIdentificacion
	 * @param nombre_completo
	 */
	public DatosPersona(int identificacion, String tipoIdentificacion, String nombre_completo) {
		this.identificacion = identificacion;
		this.tipoIdentificacion = tipoIdentificacion;
		this.nombre_completo = nombre_completo;
	}
	
	

}
