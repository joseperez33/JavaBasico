package Colleciones;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		Queue<String> Cola1 = new LinkedList<String>();
		
		System.out.println("Insertamos 3 elementos en la pila: Juan, Ana y Luis");
		Cola1.add("Hugo");
		Cola1.add("Paco");
		Cola1.add("Luis");
		System.out.println("Cantidad: " + Cola1.size());
		System.out.println("Extraemos un elemento: " + Cola1.poll());
		System.out.println("Cantidad: " + Cola1.size());
		System.out.println("Consultar el primer elemento sin extraerlo: " + Cola1.peek());
		System.out.println("Cantidad: " + Cola1.size());
		System.out.println("Extraemos todos los elementos");
		while (!Cola1.isEmpty())
			System.out.println(Cola1.poll());
		System.out.println();
		System.out.println("Cantidad: " + Cola1.size());

	}

}
