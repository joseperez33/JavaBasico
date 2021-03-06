package Abstractas;

public class Oveja extends Animal {

	// Atributos
	int patas;

	// Getters & Setters
	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

	// Constructor
	public Oveja(String nombre, int patas) {
		super(nombre);
		this.patas = patas;
	}

	@Override
	void sonido() {
		System.out.println( "BEEEE!" );
	}

	@Override
	void comer() {
		System.out.println( "�am �am!" );
	}

	@Override
	String saludar() {
		return "Mi cabra dice BEEEE y su nombre es "+this.nombre ;
	}
	
	

}
