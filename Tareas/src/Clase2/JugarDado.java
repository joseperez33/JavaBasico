package Clase2;

/**
 * 
 * @author jose.perez
 * @since 27/05/2020
 * @version 1
 *
 */

public class JugarDado {

	private Dado dado1, dado2, dado3;

	/**
	 * Constructor
	 */

	public JugarDado() {
		dado1 = new Dado();
		dado2 = new Dado();
		dado3 = new Dado();
	}

	/**
	 * Metodo para realizar el juego de los dados
	 */

	public void jugar() {

		int valor_dado1, valor_dado2, valor_dado3;

		dado1.lanzarDado();
		dado1.imprimir();
		valor_dado1 = dado1.retornaDado();
		dado2.lanzarDado();
		dado2.imprimir();
		valor_dado2 = dado2.retornaDado();
		dado3.lanzarDado();
		dado3.imprimir();
		valor_dado3 = dado3.retornaDado();

		if (valor_dado1 == valor_dado2 && valor_dado1 == valor_dado3) {
			System.out.println("Gano");
		} else {
			System.out.println("Perdió");
		}

	}

	public static void main(String[] args) {
		JugarDado jd = new JugarDado();
		jd.jugar();

	}

}
