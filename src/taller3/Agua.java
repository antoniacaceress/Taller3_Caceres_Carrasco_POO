package taller3;

public class Agua extends Hechizo {
	private int CantidadHeal;
	private int PresionDelAgua;
	
	public Agua(String nombre, String tipo, int daño, int cantidadHeal, int presionDelAgua) {
		super(nombre, tipo, daño);
		CantidadHeal = cantidadHeal;
		PresionDelAgua = presionDelAgua;
	}

	public int getCantidadHeal() {
		return CantidadHeal;
	}

	public void setCantidadHeal(int cantidadHeal) {
		CantidadHeal = cantidadHeal;
	}

	public int getPresionDelAgua() {
		return PresionDelAgua;
	}

	public void setPresionDelAgua(int presionDelAgua) {
		PresionDelAgua = presionDelAgua;
	}

	@Override
	public String toString() {
		return this.getNombre() + ";" + this.getTipo() + ";" + this.getDaño() + ";" + this.CantidadHeal + "," + this.PresionDelAgua;
	}
	
	
	
}
