package ArrayList;

import java.util.Scanner;

/**
 * Clase para alamacenar la informacion de la persona
 * 
 * @author jose.perez
 * @since 02/06/2020
 * @version 1
 */
public class DatosPersona {

	Scanner teclado;
	String tipoIdentificacion;
	int numeroIdentificacion;
	String nombreCompleto;
	int edad;

	public DatosPersona() {
		teclado = new Scanner(System.in);
		System.out.println("Digite su tipo de identificacion: ");
		this.tipoIdentificacion = teclado.next();
		System.out.println("Digite su numero de identificacion: ");
		this.numeroIdentificacion = teclado.nextInt();
		System.out.println("Digite su nombre completo: ");
		this.nombreCompleto = teclado.next();
		System.out.println("Digite su edad: ");
		this.edad = teclado.nextInt();
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
