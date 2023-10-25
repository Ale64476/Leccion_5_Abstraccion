package Herencia;

public class Camara extends DispositivoMovil{

	protected String fotografia;
	
	public Camara () {
		super(0);
	}
	
	public void tomarFotografia(String fotografia) {
		this.fotografia = fotografia;
	}
	
	public String verFotografia() {
		return fotografia;
	}
	
}
