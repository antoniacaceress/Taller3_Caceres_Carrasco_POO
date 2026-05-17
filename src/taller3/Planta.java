package taller3;

public class Planta extends Hechizo {
	private int DuracionStun;
	private int CantPlantas;
	
	public Planta(String nombre, String tipo, int daño, int duracionStun, int cantPlantas) {
		super(nombre, tipo, daño);
		DuracionStun = duracionStun;
		CantPlantas = cantPlantas;
	}

	public int getDuracionStun() {
		return DuracionStun;
	}

	public void setDuracionStun(int duracionStun) {
		DuracionStun = duracionStun;
	}

	public int getCantPlantas() {
		return CantPlantas;
	}

	public void setCantPlantas(int cantPlantas) {
		CantPlantas = cantPlantas;
	}

	@Override
	public String toString() {
		return this.getNombre() + ";" + this.getTipo() + ";" + this.getDaño() + ";" + this.DuracionStun + "," + this.CantPlantas;
	}
	

}
