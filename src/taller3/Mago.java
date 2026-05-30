package taller3;

import java.util.ArrayList;

public class Mago {

	private String nombre;
	private ArrayList<String> hechizos = new ArrayList<>();
	
	public Mago(String nombre, ArrayList<String> hechizos) {
		this.nombre = nombre;
		this.hechizos = hechizos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<String> getHechizos() {
		return hechizos;
	}

	public void setHechizos(ArrayList<String> hechizos) {
		this.hechizos = hechizos;
	}

	@Override
	public String toString() {
		String salida = this.nombre + ";";
		for (int i = 0; i < this.hechizos.size(); i++) {
			if (i == (this.hechizos.size() - 1)) {
				salida += this.hechizos.get(i);
			} else {
				salida += this.hechizos.get(i) + "|";
			}
		}
		return salida;
		
	}
	
	
	
	
}
