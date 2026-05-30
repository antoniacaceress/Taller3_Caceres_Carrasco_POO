package taller3;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
	
	private static SistemaAdm adm = new Administrador();
	private static SistemaAn an = new Analista();
	
	
	public static void MenuPrincipal(Scanner scanner) {
		
		System.out.println("Bienvenido! \nSeleccione el menú al que desea ingresar (Ingrese 1 o 2): \n1) Administrador\n2) Analista");
		int op = Integer.parseInt(scanner.nextLine());
		
		while (op > 3 || op < 0) {
			System.out.println("Opción incorrecta. Porfavor ingrese de nuevo.");
			op = Integer.parseInt(scanner.nextLine());
		}
		
		if (op == 1) {
			MenuAdministrador(scanner);
		} else {
			MenuAnalista(scanner);
		}
		
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MenuPrincipal(scanner);
	}

	public static void MenuAdministrador(Scanner scanner) {
		
		System.out.println("Seleccione lo que desea hacer: ");
		System.out.println("1. Agregar Mago");
		System.out.println("2. Modificar Mago");
		System.out.println("3. Eliminar Mago");
		System.out.println("4. Agregar Hechizo");
		System.out.println("5. Modificar Hechizo");
		System.out.println("6. Eliminar Hechizo");
		
		int op = Integer.parseInt(scanner.nextLine());
		
		switch (op) {
			case 1:
				System.out.println();
				adm.agregarMago();
				System.out.println("Mago agregado con éxito");
				break;
			case 2:
				System.out.println();
				adm.agregarMago();
				break;
			case 3:
				System.out.println();
				adm.eliminarMago();
				break;
			case 4:
				System.out.println();
				adm.agregarHechizo();
				System.out.println("Hechizo agregado con éxito");
				break;
			case 5:
				System.out.println();
				adm.modificarHechizo();
				break;
			case 6:
				System.out.println();
				adm.eliminarHechizo();
				break;
		}
		
		
		
	}
	
	
	public static void MenuAnalista(Scanner scanner) {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
