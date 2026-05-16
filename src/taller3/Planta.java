package taller3;

public class Planta extends Hechizo {
	private int DuracionStun;
	private int CantPlantas;
	
	public Planta(String nombre, String tipo, int daño, int duracionStun, int cantPlantas) {
		super(nombre, tipo, daño);
		DuracionStun = duracionStun;
		CantPlantas = cantPlantas;
	}


	

}
