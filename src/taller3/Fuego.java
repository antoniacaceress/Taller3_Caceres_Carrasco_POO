package taller3;

public class Fuego extends Hechizo {

	private int DuracionQuemadura;

	public Fuego(String nombre, String tipo, int daño, int duracionQuemadura) {
		super(nombre, tipo, daño);
		DuracionQuemadura = duracionQuemadura;
	}

	public int getDuracionQuemadura() {
		return DuracionQuemadura;
	}

	public void setDuracionQuemadura(int duracionQuemadura) {
		DuracionQuemadura = duracionQuemadura;
	}

	@Override
	public String toString() {
		return this.getNombre() + ";" + this.getTipo() + ";" + this.getDaño() + ";" + this.DuracionQuemadura;
	}
	
}

