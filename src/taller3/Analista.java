package taller3;

import java.util.ArrayList;
import java.util.Scanner;

public class Analista implements SistemaAn {
	
	Scanner scanner = new Scanner(System.in);
	ArrayList<Hechizo> listaHechizos = LectorArchivos.lectorHechizos();
	ArrayList<Mago> listaMagos = LectorArchivos.lectorMagos();

	@Override
	public void mejores10hechizos() {
		
		
	}

	@Override
	public void mejores3magos() {
		
		
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
		
		
	}

	@Override
	public void mostrarMagosYPuntuacion() {
		
		
	}

	@Override
	public void calculoPuntaje() {
		
	}

}
