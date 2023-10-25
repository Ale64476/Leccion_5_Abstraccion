package Herencia;

public class Camara extends DispositivoMovil{

	protected String fotografia;
	
	public Camara () {
		super(0);
	}
	
	public void tomarFotografia(String fotografia) {
		this.fotografia = fotografia;
	}
	
	public void verFotografia() {
		System.out.println("Es una foto de: " + fotografia);
	}
	
}
