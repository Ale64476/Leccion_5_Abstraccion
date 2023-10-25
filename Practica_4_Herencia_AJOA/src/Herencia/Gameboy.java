package Herencia;

public class Gameboy extends DispositivoMovil {

	protected String game;
	
	public Gameboy(){
		super(0);
		game = null; //repetitivo pero sirve para ejemplificar
	}
	
	public void leerJuego(String game) {
		this.game = game;
	}
	
	public void jugarJuego() {
		if(game == null){
			System.out.println("No hay ningun juego para jugar :(");
		} else {
		System.out.println("Usted está jugando" + game + ":D");
		}
	}
}
