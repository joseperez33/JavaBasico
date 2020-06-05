package Herencia;

/**
 * Clase para probalas las clases de herencia de operaciones
 * 
 * @author jose.perez
 *
 */

public class Test {

	public static void main(String[] args) {
		int tvalor1, tvalor2;
		Operaciones o = new Operaciones();
		o.cargar();
		tvalor1 = o.valor1;
		tvalor2 = o.valor2;

		Suma s = new Suma();
		s.sumar(tvalor1, tvalor2);
		s.mostrarResultado();
		Resta r = new Resta();
		r.restar(tvalor1, tvalor2);
		r.mostrarResultado();

	}

}
