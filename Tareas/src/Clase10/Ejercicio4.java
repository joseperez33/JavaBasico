package Clase10;

public class Ejercicio4 extends Thread {

	String nombre;

	/**
	 * Constructor de la clase
	 * 
	 * @param prioridad
	 * @param nombre
	 */
	public Ejercicio4(int prioridad, String nombre) {
		this.nombre = nombre;
		setPriority(prioridad);
	}

	public void run() {
		for (int i = 0; i < 30; i++) {
			System.out.print(i + " Mts " + nombre+"  ");
			yield();
		}
		System.out.println("\n Llego a la meta el " + nombre);
	}

	static Ejercicio4 liebre;
	static Ejercicio4 Conejo;
	static Ejercicio4 Tortuga;

	public static void main(String[] args)  {

		liebre = new Ejercicio4(5, "liebre");
		Conejo = new Ejercicio4(1, "conejo");
		Tortuga = new Ejercicio4(5, "tortuga");

		liebre.start();
		Conejo.start();
		Tortuga.start();

	//	liebre.join();
	//	Conejo.join();
	//	Tortuga.join();

	}

}
