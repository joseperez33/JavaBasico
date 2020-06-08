package Interfase;

public interface Validar {

	public void on();

	public void off();

	public boolean validarCodigo(int numero);

	public boolean validarPatron(String patron);

	public boolean validarHuella(String patronHuella);

	public boolean validarRostro(String patronRostro);

}
