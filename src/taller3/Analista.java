package taller3;

import java.util.ArrayList;
import java.util.Scanner;

public class Analista implements SistemaAn {
	
	Scanner scanner = new Scanner(System.in);
	ArrayList<Hechizo> listaHechizos = LectorArchivos.lectorHechizos();
	ArrayList<Mago> listaMagos = LectorArchivos.lectorMagos();
	
	

	private double puntajeMago(Mago mago) {
	    double total = 0;

	    for (String nombreHechizo : mago.getHechizos()) {
	        for (Hechizo h : listaHechizos) {
	            if (h.getNombre().equals(nombreHechizo)) {
	                total += h.calcularPuntaje();
	            }
	        }
	    }

	    return total;
	}
	
	
	@Override
	public void mejores10hechizos() {
		ArrayList<Hechizo> copia = new ArrayList<>();

		for (Hechizo h : listaHechizos) {
		    copia.add(h);
		}
		
		for (int i = 0; i < copia.size() - 1; i++) {
		    for (int j = 0; j < copia.size() - 1 - i; j++) {
		        if (copia.get(j).calcularPuntaje() < copia.get(j + 1).calcularPuntaje()) {
		            Hechizo aux = copia.get(j);
		            copia.set(j, copia.get(j + 1));
		            copia.set(j + 1, aux);
		        }
		    }
		}
		
		for (int i = 0; i < 10; i++) {
		    System.out.println((i + 1) + ") "+ copia.get(i).getNombre()+ " " + copia.get(i).calcularPuntaje());
		}
		
	}

	@Override
	public void mejores3magos() {
		ArrayList<Mago> copia = new ArrayList<>();

		for (Mago h : listaMagos) {
		    copia.add(h);
		}
		
		for (int i = 0; i < copia.size() - 1; i++) {
		    for (int j = 0; j < copia.size() - 1 - i; j++) {
		        if (puntajeMago(copia.get(j)) < puntajeMago(copia.get(j +1))) {
		            Mago aux = copia.get(j);
		            copia.set(j, copia.get(j + 1));
		            copia.set(j + 1, aux);
		        }
		    }
		}
		
		for (int i = 0; i < 3; i++) {
		    System.out.println((i + 1) + ") "+ copia.get(i).getNombre()+ " " + puntajeMago(copia.get(i)));
		}
		System.out.println("");
		
	}

	@Override
	public void mostrarTodosHechizos() {
		System.out.println("Estos son todos los hechizos que posees: ");
		for (int i = 0; i < listaHechizos.size(); i++) {
			System.out.println((i + 1) + ") " + listaHechizos.get(i));
		}
		
	}

	@Override
	public void mostrarTodosMagos() {
		System.out.println("Estos son todos los magos que posees: ");
		for (int i = 0; i < listaMagos.size(); i++) {
			System.out.println((i + 1) + ") " + listaMagos.get(i));
		}
	}

	@Override
	public void mostrarHechizosYPutuacion() {
		for(Hechizo h : listaHechizos){
			System.out.println(h.getNombre() + " -> " + h.calcularPuntaje());
		}
		
	}

	@Override
	public void mostrarMagosYPuntuacion() {
		for(Mago m : listaMagos){
			System.out.println(m.getNombre() + " -> " + puntajeMago(m));
		}
		
	}


	
	
}
