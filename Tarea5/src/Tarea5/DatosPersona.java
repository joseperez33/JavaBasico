package Tarea5;

import java.util.Scanner;

/**
 * Clase para alamacenar la informacion de la persona
 * 
 * @author jose.perez
 * @since 05/06/2020
 * @version 1
 */
public class DatosPersona {

	Scanner teclado;
	String tipoIdentificacion;
	int numeroIdentificacion;
	String nombreCompleto;

	public DatosPersona() {
		teclado = new Scanner(System.in);
		System.out.println("Digite el tipo de identificación: ");
		this.tipoIdentificacion = teclado.next();
		System.out.println("Digite el número de identificación: ");
		this.numeroIdentificacion = teclado.nextInt();
		System.out.println("Digite su nombre completo: ");
		this.nombreCompleto = teclado.next();
	}

	public String getTipoIdentificacion() {
		return tipoIdentificacion;
	}

	public void setTipoIdentificacion(String tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}

	public int getNumeroIdentificacion() {
		return numeroIdentificacion;
	}

	public void setNumeroIdentificacion(int numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

}
