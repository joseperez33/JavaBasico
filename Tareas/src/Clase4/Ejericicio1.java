package Clase4;

/**
 * Crear una lista de nombres y edades en un tipo de lista generica.
 * Luego de almacenarla se debe ordenar de menor a mayor.
 * 
 * @author jose.perez
 * @since 06/06/2020
 * @version 1
 *
 */

public class Ejericicio1 {

	class Nodo {
		int info;
		String nombre;
		Nodo sig;
	}

	private Nodo raiz;

	public Ejericicio1() {
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

	public int mayor() {
		if (!vacia()) {
			int may = raiz.info;
			Nodo reco = raiz.sig;
			while (reco != null) {
				if (reco.info > may)
					may = reco.info;
				reco = reco.sig;
			}
			return may;
		} else
			return Integer.MAX_VALUE;
	}

	public int posMayor() {
		if (!vacia()) {
			int may = raiz.info;
			int x = 1;
			int pos = x;
			Nodo reco = raiz.sig;
			while (reco != null) {
				if (reco.info > may) {
					may = reco.info;
					pos = x;
				}
				reco = reco.sig;
				x++;
			}
			return pos;
		} else
			return Integer.MAX_VALUE;
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
			int pos2 = i + 1;
			Nodo reco1 = raiz;
			for (int f = 1; f < i; f++)
				reco1 = reco1.sig;
			Nodo reco2 = raiz;
			for (int f = 1; f < pos2; f++)
				reco2 = reco2.sig;

			int aux = reco1.info;
			int aux2 = reco2.info;

			if (aux > aux2) {
				intercambiar(i, pos2);
			}

		}

	}

	public boolean ordenada() {
		if (cantidad() > 1) {
			Nodo reco1 = raiz;
			Nodo reco2 = raiz.sig;
			while (reco2 != null) {
				if (reco2.info < reco1.info) {
					return false;
				}
				reco2 = reco2.sig;
				reco1 = reco1.sig;
			}
		}
		return true;
	}

	public boolean existe(int x) {
		Nodo reco = raiz;
		while (reco != null) {
			if (reco.info == x)
				return true;
			reco = reco.sig;
		}
		return false;
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
		Ejericicio1 lg = new Ejericicio1();
		lg.insertar(1, 100, "Maria");
		lg.imprimir();
		lg.insertar(2, 10, "Jose");
		lg.imprimir();
		lg.insertar(4, 60, "Jesus");
		lg.imprimir();
		lg.insertar(3, 20, "Juan");
		lg.imprimir();	
		lg.ordenarMenor();
		lg.imprimir();

	}
}
