package Clase3;

/**
 * Clase Cuenta
 * 
 * @author jose.perez
 * @since 31/05/2020
 * @version 1
 */

public class Cuentas extends Personas {

	void tipoCuenta(int pcuenta) {
		this.tipoCuenta = pcuenta;
	}

	public void saldo(int psaldo) {
		this.saldo = psaldo;
	}

	public void consignar(int pvalor) {
		this.saldo = this.saldo + pvalor;
	}

	public void retirar(int pvalor) {
		this.saldo = this.saldo - pvalor;
	}

	public void mostrarSaldo() {
		System.out.println("El nuevo saldo es: " + this.saldo);
	}

}
