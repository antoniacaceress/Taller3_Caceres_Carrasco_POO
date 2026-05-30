package taller3;
import java.util.ArrayList;
import java.util.Scanner;


public class Administrador implements SistemaAdm {

	Scanner scanner = new Scanner(System.in);
	ArrayList<Hechizo> listaHechizos = LectorArchivos.lectorHechizos();
	ArrayList<Mago> listaMagos = LectorArchivos.lectorMagos();
	
	@Override
	public void agregarMago() {
		System.out.println("Ingrese los datos de su mago (NombreMago;Hechizo 1|Hechizo 2|Hechizo N...): ");
		String nuevoMago = scanner.nextLine();
		ArrayList<String> hechizosDelMago = new ArrayList<>();
		
		String[] partes = nuevoMago.split(";");
		String[] partes2 = partes[1].split("\\|");
		for (int i = 0; i < partes2.length; i++) {
			hechizosDelMago.add(partes2[i]);
		}
		listaMagos.add(new Mago(partes[0], hechizosDelMago));
		LectorArchivos.agregarMago(listaMagos);
	}

	@Override	
	public void modificarMago() {
		
		
	}

	@Override
	public void eliminarMago() {
		
		
	}

	@Override
	public void agregarHechizo() {
		System.out.println("Elige el tipo de tipo de hechizo (Fuego, Tierra, Planta o Agua): ");
		String op = scanner.nextLine();
		
		if (op.equals("Fuego")) {
			System.out.println("Escribe el nuevo hechizo en el siguiente formato: NombreHechizo;Tipo;Daño;DuracionQuemadura");
			String nuevoHechizo = scanner.nextLine();
			while (nuevoHechizo.length() < 4) {
				System.out.println("Formato de hechizo incorrecto. Intente de nuevo");
				nuevoHechizo = scanner.nextLine();
			}
			String[] partes = nuevoHechizo.split(";");
			listaHechizos.add(new Fuego(partes[0], partes[1], Integer.parseInt(partes[2]), Integer.parseInt(partes[3])));
			LectorArchivos.agregarHechizo(listaHechizos);
			
		} else if (op.equals("Tierra")) {
			System.out.println("Escribe el nuevo hechizo en el siguiente formato: NombreHechizo;Tipo;Daño;MejoraDefensa");
			String nuevoHechizo = scanner.nextLine();
			while (nuevoHechizo.length() < 4) {
				System.out.println("Formato de hechizo incorrecto. Intente de nuevo");
				nuevoHechizo = scanner.nextLine();
			}
			String[] partes = nuevoHechizo.split(";");
			listaHechizos.add(new Tierra(partes[0], partes[1], Integer.parseInt(partes[2]), Integer.parseInt(partes[3])));
			LectorArchivos.agregarHechizo(listaHechizos);
			
		} else if (op.equals("Planta")) {
			System.out.println("Escribe el nuevo hechizo en el siguiente formato: NombreHechizo;Tipo;Daño;DuracionStun,CantPlantas");
			String nuevoHechizo = scanner.nextLine();
			while (nuevoHechizo.length() < 4) {
				System.out.println("Formato de hechizo incorrecto. Intente de nuevo");
				nuevoHechizo = scanner.nextLine();
			}
			String[] partes = nuevoHechizo.split(";");
			listaHechizos.add(new Planta(partes[0], partes[1], Integer.parseInt(partes[2]), Integer.parseInt(partes[3]), Integer.parseInt(partes[4])));
			LectorArchivos.agregarHechizo(listaHechizos);
			
		} else {
			System.out.println("Escribe el nuevo hechizo en el siguiente formato: NombreHechizo;Tipo;Daño;CantidadHeal,PresionDelAgua");
			String nuevoHechizo = scanner.nextLine();
			while (nuevoHechizo.length() < 4) {
				System.out.println("Formato de hechizo incorrecto. Intente de nuevo");
				nuevoHechizo = scanner.nextLine();
			}
			String[] partes = nuevoHechizo.split(";");
			listaHechizos.add(new Agua(partes[0], partes[1], Integer.parseInt(partes[2]), Integer.parseInt(partes[3]), Integer.parseInt(partes[4])));
			LectorArchivos.agregarHechizo(listaHechizos);
			
		}
		
			
	}

	@Override
	public void modificarHechizo() {

	}

	@Override
	public void eliminarHechizo() {
		
		
	}
	


	
}
