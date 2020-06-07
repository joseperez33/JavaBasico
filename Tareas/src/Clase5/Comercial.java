package Clase5;

public class Comercial extends Empleado {

	int extras;



	public int getExtras() {
		return extras;
	}

	public void setExtras(int extras) {
		this.extras = extras;
	}

	public Comercial(String nombre, String apellido, int edad, int salario, int extras) {
		super(nombre, apellido, edad, salario);
		this.extras = extras;
	}


	@Override
	public boolean extras(double sueldoExtra) {
		
		if (sueldoExtra > 0) {
			return true;
		}

		return false;
	}

}
