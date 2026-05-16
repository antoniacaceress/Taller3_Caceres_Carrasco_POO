package taller3;

public class Agua extends Hechizo {
	private int CantidadHeal;
	private int PresionDelAgua;
	
	public Agua(String nombre, String tipo, int daño, int cantidadHeal, int presionDelAgua) {
		super(nombre, tipo, daño);
		CantidadHeal = cantidadHeal;
		PresionDelAgua = presionDelAgua;
	}


	
	
	
}
