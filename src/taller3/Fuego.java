package taller3;

public class Fuego extends Hechizo {

	private int DuracionQuemadura;

	public Fuego(String nombre, String tipo, int daño, int duracionQuemadura) {
		super(nombre, tipo, daño);
		DuracionQuemadura = duracionQuemadura;
	}


	
}
