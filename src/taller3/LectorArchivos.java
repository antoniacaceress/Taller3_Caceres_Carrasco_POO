package taller3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LectorArchivos {
	
	static ArrayList<Hechizo> listaHechizos = new ArrayList<>();
	
	public ArrayList<Hechizo> lectorHechizos(ArrayList<Hechizo> listaHechizos) {
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("Hechizos.txt"));
			String linea;
			
			while ((linea = br.readLine()) != null) {
				String[] partes = linea.split(";");
				
				if ((partes[1]).equals("Fuego")) {
					listaHechizos.add(new Fuego(partes[0], partes[1], Integer.parseInt(partes[2]), Integer.parseInt(partes[3])));
				} else if (partes[1].equals("Tierra")) {
					listaHechizos.add(new Tierra(partes[0], partes[1], Integer.parseInt(partes[2]), Integer.parseInt(partes[3])));
				} else if (partes[1].equals("Planta")) {
					listaHechizos.add(new Planta(partes[0], partes[1], Integer.parseInt(partes[2]), Integer.parseInt(partes[3]), Integer.parseInt(partes[4])));
				} else {
					listaHechizos.add(new Agua(partes[0], partes[1], Integer.parseInt(partes[2]), Integer.parseInt(partes[3]), Integer.parseInt(partes[4])));
				}
				
				
			}
			
			
		} catch (IOException e) {
			System.out.print("Se encontró un problema al leer el archivo" + e.getMessage());
		}
		
		
		
		return listaHechizos;
		
	}
	
	
	public void lectorMagos() {
		
	}
	

}
