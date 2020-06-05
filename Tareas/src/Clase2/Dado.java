package Clase2;

/**
 * 
 * @author jose.perez
 * @since 27/05/2020
 * @version 1
 *
 */

public class Dado {

	private int valor_dado;

	/**
	 * Metodo para lanzar el dado
	 */

	public void lanzarDado() {
		valor_dado = 1 + (int) (Math.random() * 6);
	}

	/**
	 * Metodo para imprimir el valor del dado
	 */

	public void imprimir() {
		System.out.println("El valor del dado es: " + valor_dado);
	}

	/**
	 * Metodo para retornar el valor del dado
	 * 
	 * @return valor_dado
	 */

	public int retornaDado() {
		return valor_dado;
	}

}
