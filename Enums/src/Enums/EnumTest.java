package Enums;

import java.util.Arrays;

public class EnumTest {

	public static void main(String[] args) {
		/*
		 * System.out.println(Estaciones.OTOÑO); System.out.println(Estaciones.class);
		 * System.out.println("La longitud " + Estaciones.values().length);
		 * System.out.println(Estaciones.values());
		 * System.out.println(Estaciones.values()[0]);
		 * System.out.println(Estaciones.values()[1]);
		 * 
		 * 
		 * System.out.println(Estaciones.valueOf("invierno".toUpperCase())); String
		 * buscar = "verano".toUpperCase();
		 * System.out.println(Estaciones.valueOf(buscar));
		 * System.out.println(Estaciones.PRIMAVERA.name());
		 * System.out.println(Estaciones.VERANO.ordinal());
		 * System.out.println(.OTOÑO.ordinal()); String primavera =
		 * Estaciones.PRIMAVERA.name();
		 * System.out.println(primavera.compareTo("PRIMAVERA")==0);
		 * System.out.println(primavera.compareTo("primavera")==0);
		 * System.out.println(primavera.compareTo("VERANO")==0);
		 
		
		System.out.println(Estaciones.OTOÑO);
		System.out.println(Estaciones.OTOÑO.getCodigoEstacion());
		System.out.println(Estaciones.OTOÑO.getTemperatura());
		*/
		
		System.out.println(Arrays.toString(Estaciones.values()));
		
	
		for (int i = 0; i < Estaciones.values().length; i++) {
			System.out.println(Estaciones.values()[i]);
		}
		
		for (Estaciones dia : Estaciones.values()) {
			System.out.println(dia);
		}
		

	}

}
