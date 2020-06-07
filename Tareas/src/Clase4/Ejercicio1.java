package Clase4;

/**
 * Crear una lista de nombres y edades en un tipo de lista generica. Luego de
 * almacenarla se debe ordenar de menor a mayor.
 * 
 * @author jose.perez
 * @since 06/06/2020
 * @version 1
 *
 */

public class Ejercicio1 {

	class Nodo {
		int info;
		String nombre;
		Nodo sig;
	}

	private Nodo raiz;

	public Ejercicio1() {
		raiz = null;
	}

	void insertar(int pos, int x, String y) {
		if (pos <= cantidad() + 1) {
			Nodo nuevo = new Nodo();
			nuevo.info = x;
			nuevo.nombre = y;
			if (pos == 1) {
				nuevo.sig = raiz;
				raiz = nuevo;
			} else if (pos == cantidad() + 1) {
				Nodo reco = raiz;
				while (reco.sig != null) {
					reco = reco.sig;
				}
				reco.sig = nuevo;
				nuevo.sig = null;
			} else {
				Nodo reco = raiz;
				for (int f = 1; f <= pos - 2; f++)
					reco = reco.sig;
				Nodo siguiente = reco.sig;
				reco.sig = nuevo;
				nuevo.sig = siguiente;
			}
		}
	}

	public int cantidad() {
		int cant = 0;
		Nodo reco = raiz;
		while (reco != null) {
			reco = reco.sig;
			cant++;
		}
		return cant;
	}

	public void intercambiar(int pos1, int pos2) {
		if (pos1 <= cantidad() && pos2 <= cantidad()) {
			Nodo reco1 = raiz;
			for (int f = 1; f < pos1; f++)
				reco1 = reco1.sig;
			Nodo reco2 = raiz;
			for (int f = 1; f < pos2; f++)
				reco2 = reco2.sig;
			int aux = reco1.info;
			String aux2 = reco1.nombre;
			reco1.info = reco2.info;
			reco1.nombre = reco2.nombre;
			reco2.info = aux;
			reco2.nombre = aux2;
		}
	}

	public void ordenarMenor() {
		int cant = 0;
		Nodo reco = raiz;
		while (reco != null) {
			reco = reco.sig;
			cant++;
		}

		for (int i = 0; i < cant; i++) {
			for (int j = 0; j < cant; j++) {

				Nodo reco1 = raiz;
				for (int f = 1; f < i; f++)
					reco1 = reco1.sig;
				Nodo reco2 = raiz;
				for (int f = 1; f < j; f++)
					reco2 = reco2.sig;

				int aux = reco1.info;
				int aux2 = reco2.info;

				if (aux < aux2) {
					intercambiar(i, j);
				}

			}
		}

	}

	public boolean vacia() {
		if (raiz == null)
			return true;
		else
			return false;
	}

	public void imprimir() {
		Nodo reco = raiz;
		while (reco != null) {
			System.out.print("Nombre: " + reco.nombre + " Edad: " + reco.info + " --- ");
			reco = reco.sig;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Ejercicio1 lg = new Ejercicio1();
		lg.insertar(1, 100, "Maria");
		lg.imprimir();
		lg.insertar(2, 15, "Jose");
		lg.imprimir();
		lg.insertar(3, 60, "Jesus");
		lg.imprimir();
		lg.insertar(4, 10, "Juan");
		lg.imprimir();
		lg.insertar(5, 200, "Joseph");
		lg.imprimir();
		lg.ordenarMenor();
		lg.imprimir();

	}
}
