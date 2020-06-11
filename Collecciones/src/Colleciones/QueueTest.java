package Colleciones;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Cola FIFO
 * @author jose.perez
 *
 */

public class QueueTest {

	public static void main(String[] args) {
		Queue<String> Cola1 = new LinkedList<String>();
		
		System.out.println("Insertamos 3 elementos en la Cola: Juan, Ana y Luis");
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
		
		
		PriorityQueue<Integer> Cola2 = new PriorityQueue<Integer>();
		Cola2.add(70);
		Cola2.add(120);
		Cola2.add(5);
		System.out.println("Impresion");
		while (!Cola2.isEmpty())
			System.out.println(Cola2.poll());
		

	}

}
