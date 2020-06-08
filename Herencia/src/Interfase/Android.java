package Interfase;

public class Android extends Telefono implements Validar {

	private String patron;

	public Android(String marca, Persona persona) {
		super(marca, persona);

	}

	public String getPatron() {
		return patron;
	}

	public void setPatron(String patron) {
		this.patron = patron;
	}

	

	@Override
	public boolean validar(Persona persona) {
		
		return persona.getPatron().equals(patron);
		}

	@Override
	public boolean validarCodigo(int numero) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean validarPatron(String patron) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean validarHuella(String patronHuella) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean validarRostro(String patronRostro) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
