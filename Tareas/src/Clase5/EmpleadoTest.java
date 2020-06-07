package Clase5;

/**
 * Crear una clase abstracta Empleado public abstract class Empleado Esta clase
 * va a contener la información del empleado: Nombre Apellido Edad Salario Crear
 * los metodos abstractos:
 * 
 * extras public abstract boolean extras (double sueldoExtra);. Crear una clase
 * hija llamada Comercial que extienda de Empleado public class Comercial
 * extends Empleado Esta clase debe calcular las horas extras a pagar al
 * empleado. Y mostrar al final los datos del empleado, el salario y salario de
 * horas extras.
 * 
 * 
 * @author jose.perez
 * @since 06/06/2020
 * @version 1
 *
 */

public class EmpleadoTest {

	public static void main(String[] args) {
		Comercial comercial = new Comercial("Jose", "Perez", 30, 950000, 50);
		System.out.println(comercial.Nombre);
		System.out.println(comercial.Apellido);
		System.out.println(comercial.Edad);
		System.out.println(comercial.Salario);

		if (comercial.extras(comercial.extras)) {
			int hora = 5000, valorExtra = 0;
			valorExtra = hora * comercial.extras;
			System.out.println("Salario de horas extras es: " + valorExtra);
		} else {
			System.out.println("No hay Horas extras");
		}

	}

}
