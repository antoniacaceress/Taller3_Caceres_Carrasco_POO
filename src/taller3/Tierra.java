package taller3;

public class Tierra extends Hechizo {

	private int MejoraDefensa;

	public Tierra(String nombre, String tipo, int daño, int mejoraDefensa) {
		super(nombre, tipo, daño);
		MejoraDefensa = mejoraDefensa;
	}

	public int getMejoraDefensa() {
		return MejoraDefensa;
	}

	public void setMejoraDefensa(int mejoraDefensa) {
		MejoraDefensa = mejoraDefensa;
	}

	@Override
	public String toString() {
		return this.getNombre() + ";" + this.getTipo() + ";" + this.getDaño() + ";" + this.MejoraDefensa;
	}
	
	
}
