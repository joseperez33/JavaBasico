package Interfase;

public class Principal {

	public static void main(String[] args) {
		
		Persona p = new Persona();
		p.setNombre("Jose");
		p.setHuella("huella");
		
		Android a = new Android("Samsung", p);
		a.setPatron(p.getHuella());
		
		System.out.println(a.validar(p));
	}

}
