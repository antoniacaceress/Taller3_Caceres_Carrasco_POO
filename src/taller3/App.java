package taller3;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
	
	private static SistemaAdm adm = new Administrador();
	private static SistemaAn an = new Analista();
	
	
	public static void MenuPrincipal(Scanner scanner) {
		
		int op;
		
		do {
			System.out.println("Bienvenido! \nSeleccione el menú al que desea ingresar (Ingrese 1 o 2): \n1) Administrador\n2) Analista\n3) Salir");
			op = Integer.parseInt(scanner.nextLine());
			
			while (op > 3 || op < 0) {
				System.out.println("Opción incorrecta. Porfavor ingrese de nuevo.");
				op = Integer.parseInt(scanner.nextLine());
			}
			
			switch (op) {
			case 1:
				MenuAdministrador(scanner);
				break;
			case 2:
				MenuAnalista(scanner);
				break;
			default:
				System.out.println("Saliendo...");
			}
		} while (op != 3);
		
		
		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MenuPrincipal(scanner);
	}

	public static void MenuAdministrador(Scanner scanner) {
		
		int op;
		do {
			System.out.println("Seleccione lo que desea hacer: ");
			System.out.println("1. Agregar Mago");
			System.out.println("2. Modificar Mago");
			System.out.println("3. Eliminar Mago");
			System.out.println("4. Agregar Hechizo");
			System.out.println("5. Modificar Hechizo");
			System.out.println("6. Eliminar Hechizo");
			System.out.println("7. Salir");
			
			op = Integer.parseInt(scanner.nextLine());
			
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
				System.out.println("Mago eliminado con éxito");
				break;
			case 4:
				System.out.println();
				adm.agregarHechizo();
				System.out.println("Hechizo agregado con éxito");
			case 5:
				System.out.println();
				adm.modificarHechizo();
				break;
			case 6:
				System.out.println();
				adm.eliminarHechizo();
				System.out.println("Hechizo eliminado con éxito");
				break;
			default:
				System.out.println("Saliendo...");
				break;
			}
		} while (op != 7);
		
		
	}
	
	public static void MenuAnalista(Scanner scanner) {
		
		int op;	
		do {
			System.out.println("Seleccione lo que desea hacer: ");
			System.out.println("1. Top 10 Mejores Hechizos");
			System.out.println("2. Top 3 Mejores Magos");
			System.out.println("3. Mostrar todos los Hechizos");
			System.out.println("4. Mostrar todos los magos");
			System.out.println("5. Mostrar todos los Hechizos junto a su puntuacion");
			System.out.println("6. Mostrar todos los magos junto a su puntuacion");
			System.out.println("7. Salir");
			
			op = Integer.parseInt(scanner.nextLine());
			
			switch (op) {
			case 1:
				System.out.println();
				an.mejores10hechizos();

				break;
			case 2:
				System.out.println();
				an.mejores3magos();
				break;
			case 3:
				System.out.println();
				an.mostrarTodosHechizos();

				break;
			case 4:
				System.out.println();
				an.mostrarTodosMagos();

			case 5:
				System.out.println();
				an.mostrarHechizosYPutuacion();
				break;
			case 6:
				System.out.println();
				an.mostrarMagosYPuntuacion();
				break;
			default:
				System.out.println("Saliendo...");
				break;
			}
		} while (op != 7);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
