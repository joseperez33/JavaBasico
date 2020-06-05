package ArrayList;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {

//		ArrayList<String> al = new ArrayList<String>();
//		al.add("Jose");
//		al.add("Juan");
//		al.add("Mauricio");
//		al.add("Maria");
//		al.add(1, "Pedro");
//
//		System.out.println("Dato: " + al);
//
//		for (String nombres : al) {
//			System.out.println("Dato: " + nombres);
//		}
//
//		System.out.println("Valor: " + al.get(2));
//		al.set(2, "Juan Jose");
//		System.out.println("Dato: " + al);
//		Collections.sort(al);
//
//		for (String nombres : al) {
//			System.out.println("Dato: " + nombres);
//		}
//
//		ArrayList<Integer> al1 = new ArrayList<Integer>();
//
//		al1.add(21);
//		al1.add(31);
//		al1.add(11);
//		al1.add(1);
//		Collections.sort(al1);
//
//		for (Integer edad : al1) {
//			System.out.println("Edad: " + edad);
//		}

		ArrayList<DatosPersona> al1 = new ArrayList<DatosPersona>();
		for (int i = 0; i < 1; i++) {
			DatosPersona dp = new DatosPersona();
			al1.add(dp);
		}
		
		for (int i = 0; i < al1.size(); i++) {
			System.out.println("Tipo: " + al1.get(i).getTipoIdentificacion());
			System.out.println("Numero: " + al1.get(i).getNumeroIdentificacion());
			System.out.println("Nombre: " + al1.get(i).getNombreCompleto());
			System.out.println("Edad: " + al1.get(i).getEdad());
		}
		
		for (DatosPersona dp1 : al1) {
			System.out.println("Nombre: "+ dp1.getNombreCompleto());
			
			
		}

	}

}
