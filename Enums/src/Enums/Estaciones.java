package Enums;

public enum Estaciones {

	PRIMAVERA(1, "18°C"), VERANO(2, "33°C"), OTOÑO(3, "25°C"), INVIERNO(4, "°C");

	private final int codigoEstacion;
	private final String temperatura;

	Estaciones(int codigoEstacion,String temperatura) {
		this.codigoEstacion = codigoEstacion;
		this.temperatura = temperatura;
	}

	public int getCodigoEstacion() {
		return codigoEstacion;
	}

	public String getTemperatura() {
		return temperatura;
	}

}
