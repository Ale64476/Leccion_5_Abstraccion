package Herencia;

public class Controladora {

	public static void main(String[] args) {
		
		Gameboy gameboy = new Gameboy();
		gameboy.encender();
		gameboy.leerJuego("Pokemon rojo fuego");
		gameboy.jugarJuego();
		gameboy.apagar();
		Camara camera = new Camara();
		camera.encender();
		camera.tomarFotografia("Perro");
		camera.verFotografia();
		camera.apagar();
	}
}
