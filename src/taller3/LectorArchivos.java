package taller3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class LectorArchivos {

	public static ArrayList<Hechizo> lectorHechizos() {
		ArrayList<Hechizo> listaHechizos = new ArrayList<>();
		
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
					String[] partes2 = partes[3].split(",");
					listaHechizos.add(new Planta(partes[0], partes[1], Integer.parseInt(partes[2]), Integer.parseInt(partes2[0]), Integer.parseInt(partes2[1])));
				} else {
					String[] partes2 = partes[3].split(",");
					listaHechizos.add(new Agua(partes[0], partes[1], Integer.parseInt(partes[2]), Integer.parseInt(partes2[0]), Integer.parseInt(partes2[1])));
				}
					
			}
			br.close();
			
		} catch (IOException e) {
			System.out.print("Se encontró un problema al leer el archivo" + e.getMessage());
		}
		return listaHechizos;	
	}
	
	public static  ArrayList<Mago> lectorMagos(){
		ArrayList<Mago> listaMagos = new ArrayList<>();	
		try {
			BufferedReader br = new BufferedReader(new FileReader("Magos.txt"));
			String linea;
			
			while ((linea = br.readLine()) != null) {
				ArrayList<String> hechizosMagos = new ArrayList<>();
				String[] partes = linea.split(";");
				String[] partes2 = partes[1].split("\\|");
				for (int i = 0; i < partes2.length; i++) {
					hechizosMagos.add(partes2[i]);
				}
				listaMagos.add(new Mago(partes[0], hechizosMagos));
			}
			br.close();
			
		} catch (IOException e) {
			System.out.println("No se pudo leer el archivo" + e.getMessage());
		}	
		return listaMagos;	
	}	     
	
	public static void modificarTXTHechizo(ArrayList<Hechizo> lista) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("Hechizos.txt"));
			for (Hechizo h : lista) {
				bw.write(h.toString());
				bw.newLine();
			}
			bw.close();
		} catch (IOException e) {
			System.out.println("Error al agregar el texto" + e.getMessage());
		}
	}
	
	public static void modificarTXTMago(ArrayList<Mago> lista) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("Magos.txt"));
			for (Mago m : lista) {
				bw.write(m.toString());
				bw.newLine();
			}
			bw.close();
		} catch (IOException e) {
			System.out.println("Error al abrir el archivo" + e.getMessage());
		}
	}

	
}
