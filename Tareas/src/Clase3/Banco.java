package Clase3;

public class Banco {

	public static void main(String[] args) {
		int  saldos, proceso, valor;

		Personas pe = new Personas();
		pe.cargar();
		proceso = pe.proceso;
		valor = pe.valor;
		saldos = pe.saldo;
		Cuentas cu = new Cuentas();
		
		
		cu.saldo(saldos);;

		if (proceso == 1) {
			cu.consignar(valor);
		} else {
			cu.retirar(valor);
		}
		
		pe.imprimir();
		cu.mostrarSaldo();

	}

}
