package Stack;

import java.util.Stack;

import Persona.DatosPersona;

/**
 *  Lista Pila LIFO
 * @author jose.perez 
 *
 */

public class Stacktest {

	public static void main(String[] args) {
		Stack<String> pila1 = new Stack<String>();

		System.out.println("Insertamos 3 elementos en la pila: Juan, Ana y Luis");
		pila1.push("Hugo");
		pila1.push("Paco");
		pila1.push("Luis");
		System.out.println("Cantidad: " + pila1.size());
		System.out.println("Extraemos un elemento: " + pila1.pop());
		System.out.println("Cantidad: " + pila1.size());
		System.out.println("Consultar el primer elemento sin extraerlo: " + pila1.peek());
		System.out.println("Cantidad: " + pila1.size());
		System.out.println("Extraemos todos los elementos");
		while (!pila1.isEmpty())
			System.out.println(pila1.pop());
		System.out.println();
		System.out.println("Cantidad: " + pila1.size());

		System.out.println("Pila 2");
		Stack<Integer> pila2 = new Stack<Integer>();
		pila2.push(1);
		pila2.push(2);
		pila2.push(3);
		System.out.println("Borramos la pila");
		pila2.clear();
		System.out.println("Cantidad: " + pila2.size());
		System.out.println();

		Stack<DatosPersona> pila3 = new Stack<DatosPersona>();
		DatosPersona dp = new DatosPersona();
		dp.setNumero(123);
		dp.setNombre("Jose");
		pila3.push(dp);
		System.out.println("Cantidad: " + pila2.size());
		System.out.println("Consultar el primer elemento sin extraerlo: ");
		pila3.peek().imprimir();

	}

}
