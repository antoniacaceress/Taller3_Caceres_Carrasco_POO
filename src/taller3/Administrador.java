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
		LectorArchivos.modificarTXTMago(listaMagos);
	}

	@Override	
	public void modificarMago() {
		
		for (int i = 0; i < listaMagos.size(); i++) {
			System.out.println((i + 1) + ") " + listaMagos.get(i));
		}
		System.out.println("¿Qué mago desea modificar?");
		int op1 = Integer.parseInt(scanner.nextLine()); 
		System.out.println("¿Qué desea modificar?\n1) Nombre del mago\n2) Hechizos que el mago posee\nEscriba el número de su opción: ");
		int op2 = Integer.parseInt(scanner.nextLine());
		while (op2 < 1 || op2 > 2) {
			System.out.println("Opción incorrecta. Intente de nuevo");
			op2 = Integer.parseInt(scanner.nextLine());
		}
		
		if (op2 == 1) {
			System.out.println("Ingrese el nuevo nombre: ");
			String nombreNuevo = scanner.nextLine();
			listaMagos.get(op1 - 1).setNombre(nombreNuevo);
			LectorArchivos.modificarTXTMago(listaMagos);
			System.out.println("Nombre de mago modificado con éxito!");
		} else {
			System.out.print("¿Desea agregar un hechizo o eliminar alguno? (Escriba 1 para agregar y 2 para eliminar): ");
			int opcion = Integer.parseInt(scanner.nextLine());
			if (opcion == 1) {
				System.out.println("Escriba el nuevo hechizo: ");
				String hechizoNuevo = scanner.nextLine();
				listaMagos.get(op1 - 1).getHechizos().add(hechizoNuevo);
				LectorArchivos.modificarTXTMago(listaMagos);
				System.out.println("Hechizo agregado con éxito!");
			} else {
				System.out.println("Escriba el hechizo a eliminar: ");
				String hechizoEliminar = scanner.nextLine();
				if (!listaMagos.get(op1 - 1).getHechizos().contains(hechizoEliminar)) {
					System.out.println("Hechizo no encontrado. Intente nuevamente");
					hechizoEliminar = scanner.nextLine();
				}
				listaMagos.get(op1 - 1).getHechizos().remove(hechizoEliminar);
				LectorArchivos.modificarTXTMago(listaMagos);
				System.out.println("Hechizo eliminado con éxito!");
			}	
		}
	}

	@Override
	public void eliminarMago() {
		System.out.println("Seleccione el mago a eliminar (Seleccione el número): ");
		for (int i = 0; i < listaMagos.size(); i++) {
			System.out.println((i + 1) + ") " + listaMagos.get(i));
		}
		int op = Integer.parseInt(scanner.nextLine());
		while (op > listaMagos.size()) {
			System.out.println("Número de mago inexistente. Intente de nuevo");
			op = Integer.parseInt(scanner.nextLine());
		}
		listaMagos.remove(op - 1);
		LectorArchivos.modificarTXTMago(listaMagos);		
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
			LectorArchivos.modificarTXTHechizo(listaHechizos);
			
		} else if (op.equals("Tierra")) {
			System.out.println("Escribe el nuevo hechizo en el siguiente formato: NombreHechizo;Tipo;Daño;MejoraDefensa");
			String nuevoHechizo = scanner.nextLine();
			while (nuevoHechizo.length() < 4) {
				System.out.println("Formato de hechizo incorrecto. Intente de nuevo");
				nuevoHechizo = scanner.nextLine();
			}
			String[] partes = nuevoHechizo.split(";");
			listaHechizos.add(new Tierra(partes[0], partes[1], Integer.parseInt(partes[2]), Integer.parseInt(partes[3])));
			LectorArchivos.modificarTXTHechizo(listaHechizos);
			
		} else if (op.equals("Planta")) {
			System.out.println("Escribe el nuevo hechizo en el siguiente formato: NombreHechizo;Tipo;Daño;DuracionStun,CantPlantas");
			String nuevoHechizo = scanner.nextLine();
			while (nuevoHechizo.length() < 4) {
				System.out.println("Formato de hechizo incorrecto. Intente de nuevo");
				nuevoHechizo = scanner.nextLine();
			}
			String[] partes = nuevoHechizo.split(";");
			listaHechizos.add(new Planta(partes[0], partes[1], Integer.parseInt(partes[2]), Integer.parseInt(partes[3]), Integer.parseInt(partes[4])));
			LectorArchivos.modificarTXTHechizo(listaHechizos);
			
		} else {
			System.out.println("Escribe el nuevo hechizo en el siguiente formato: NombreHechizo;Tipo;Daño;CantidadHeal,PresionDelAgua");
			String nuevoHechizo = scanner.nextLine();
			while (nuevoHechizo.length() < 4) {
				System.out.println("Formato de hechizo incorrecto. Intente de nuevo");
				nuevoHechizo = scanner.nextLine();
			}
			String[] partes = nuevoHechizo.split(";");
			listaHechizos.add(new Agua(partes[0], partes[1], Integer.parseInt(partes[2]), Integer.parseInt(partes[3]), Integer.parseInt(partes[4])));
			LectorArchivos.modificarTXTHechizo(listaHechizos);
			
		}
		
			
	}

	@Override
	public void modificarHechizo() {
		
		for (int i = 0; i < listaHechizos.size(); i++) {
			System.out.println((i + 1) + ") " + listaHechizos.get(i));
		}
		System.out.println("¿Qué hechizo desea modificar? (Escriba el número del hechizo): ");
		int opHechizo = Integer.parseInt(scanner.nextLine());
		while (opHechizo < 1 || opHechizo > listaHechizos.size()) {
			System.out.println("Número de hechizo incorrecto. Intente de nuevo");
			opHechizo = Integer.parseInt(scanner.nextLine());
		}
		
		if (listaHechizos.get(opHechizo - 1).getTipo().equals("Fuego")) {
			System.out.println("Qué desea modificar de este hechizo?(Seleccione el número de la opción): ");
			System.out.println("1) Nombre\n2) Tipo\n3) Daño\n4) Duración quemadura");
			int op = Integer.parseInt(scanner.nextLine());
			if (op == 1) {
				System.out.println("Escriba el nuevo nombre: ");
				String nuevoNombre = scanner.nextLine();
				listaHechizos.get(opHechizo - 1).setNombre(nuevoNombre);
				LectorArchivos.modificarTXTHechizo(listaHechizos);
			} else if (op == 2) {
				System.out.println("Escriba el nuevo tipo: ");
				String nuevoTipo = scanner.nextLine();
				listaHechizos.get(opHechizo - 1).setTipo(nuevoTipo);
				LectorArchivos.modificarTXTHechizo(listaHechizos);
			} else if (op == 3) {
				System.out.println("Escriba el nuevo daño: ");
				int nuevoDaño = Integer.parseInt(scanner.nextLine());
				listaHechizos.get(opHechizo - 1).setDaño(nuevoDaño);
				LectorArchivos.modificarTXTHechizo(listaHechizos);
			} else {
				System.out.println("Escriba la nueva duración de quemadura: ");
				int nuevaDuracion = Integer.parseInt(scanner.nextLine());
				listaHechizos.get(opHechizo - 1).setDuracionQuemadura(nuevaDuracion);
				LectorArchivos.modificarTXTHechizo(listaHechizos);
			}
			
			
		} else if (listaHechizos.get(opHechizo - 1).getTipo().equals("Tierra")) {
			System.out.println("Qué desea modificar de este hechizo?(Seleccione el número de la opción): ");
			System.out.println("1) Nombre\n2) Tipo\n3) Daño\n4) Mejora defensa");
			int op = Integer.parseInt(scanner.nextLine());
			if (op == 1) {
				System.out.println("Escriba el nuevo nombre: ");
				String nuevoNombre = scanner.nextLine();
				listaHechizos.get(opHechizo - 1).setNombre(nuevoNombre);
				LectorArchivos.modificarTXTHechizo(listaHechizos);
			} else if (op == 2) {
				System.out.println("Escriba el nuevo tipo: ");
				String nuevoTipo = scanner.nextLine();
				listaHechizos.get(opHechizo - 1).setTipo(nuevoTipo);
				LectorArchivos.modificarTXTHechizo(listaHechizos);
			} else if (op == 3) {
				System.out.println("Escriba el nuevo daño: ");
				int nuevoDaño = Integer.parseInt(scanner.nextLine());
				listaHechizos.get(opHechizo - 1).setDaño(nuevoDaño);
				LectorArchivos.modificarTXTHechizo(listaHechizos);
			} else {
				System.out.println("Escriba la nueva mejora defensa: ");
				int nuevaMejora = Integer.parseInt(scanner.nextLine());
				listaHechizos.get(opHechizo - 1).setMejoraDefensa(nuevaMejora);
				LectorArchivos.modificarTXTHechizo(listaHechizos);
			}
			
			
		} else if (listaHechizos.get(opHechizo - 1).getTipo().equals("Planta")) {
			System.out.println("Qué desea modificar de este hechizo?(Seleccione el número de la opción): ");
			System.out.println("1) Nombre\n2) Tipo\n3) Daño\n4) Duración stun\n5) Cantidad Plantas");
			int op = Integer.parseInt(scanner.nextLine());
			if (op == 1) {
				System.out.println("Escriba el nuevo nombre: ");
				String nuevoNombre = scanner.nextLine();
				listaHechizos.get(opHechizo - 1).setNombre(nuevoNombre);
				LectorArchivos.modificarTXTHechizo(listaHechizos);
			} else if (op == 2) {
				System.out.println("Escriba el nuevo tipo: ");
				String nuevoTipo = scanner.nextLine();
				listaHechizos.get(opHechizo - 1).setTipo(nuevoTipo);
				LectorArchivos.modificarTXTHechizo(listaHechizos);
			} else if (op == 3) {
				int nuevoDaño = Integer.parseInt(scanner.nextLine());
				listaHechizos.get(opHechizo - 1).setDaño(nuevoDaño);
				LectorArchivos.modificarTXTHechizo(listaHechizos);
			} else if (op == 4){
				System.out.println("Escriba la nueva duración stun: ");
				int nuevaDuracionStun = Integer.parseInt(scanner.nextLine());
				listaHechizos.get(opHechizo - 1).setDuracionStun(nuevaDuracionStun);
				LectorArchivos.modificarTXTHechizo(listaHechizos);
			} else {
				System.out.println("Escriba la nueva cantidad de plantas: ");
				int nuevaCantidad = Integer.parseInt(scanner.nextLine());
				listaHechizos.get(opHechizo - 1).setCantPlantas(nuevaCantidad);
				LectorArchivos.modificarTXTHechizo(listaHechizos);
			}
				
		} else if (listaHechizos.get(opHechizo - 1).getTipo().equals("Agua")) {
			System.out.println("Qué desea modificar de este hechizo?(Seleccione el número de la opción): ");
			System.out.println("1) Nombre\n2) Tipo\n3) Daño\n4) Cantidad Heal\n5) Presión del agua");
			int op = Integer.parseInt(scanner.nextLine());
			if (op == 1) {
				System.out.println("Escriba el nuevo nombre: ");
				String nuevoNombre = scanner.nextLine();
				listaHechizos.get(opHechizo - 1).setNombre(nuevoNombre);
				LectorArchivos.modificarTXTHechizo(listaHechizos);
			} else if (op == 2) {
				System.out.println("Escriba el nuevo tipo: ");
				String nuevoTipo = scanner.nextLine();
				listaHechizos.get(opHechizo - 1).setTipo(nuevoTipo);
				LectorArchivos.modificarTXTHechizo(listaHechizos);
			} else if (op == 3) {
				int nuevoDaño = Integer.parseInt(scanner.nextLine());
				listaHechizos.get(opHechizo - 1).setDaño(nuevoDaño);
				LectorArchivos.modificarTXTHechizo(listaHechizos);
			} else if (op == 4){
				System.out.println("Escriba la nueva duración stun: ");
				int cantHeal = Integer.parseInt(scanner.nextLine());
				listaHechizos.get(opHechizo - 1).setCantidadHeal(cantHeal);
				LectorArchivos.modificarTXTHechizo(listaHechizos);
			} else {
				System.out.println("Escriba la nueva cantidad de plantas: ");
				int nuevaPresion = Integer.parseInt(scanner.nextLine());
				listaHechizos.get(opHechizo - 1).setPresionDelAgua(nuevaPresion);
				LectorArchivos.modificarTXTHechizo(listaHechizos);
			}
			
		}	
	}

	@Override
	public void eliminarHechizo() {
		System.out.println("Seleccione el hechizo a eliminar (Seleccione el número): ");
		for (int i = 0; i < listaHechizos.size(); i++) {
			System.out.println((i + 1) + ") " + listaHechizos.get(i));
		}
		int op = Integer.parseInt(scanner.nextLine());
		while (op > listaHechizos.size()) {
			System.out.println("Número de hechizo inexistente. Intente de nuevo");
			op = Integer.parseInt(scanner.nextLine());
		}
		listaHechizos.remove(op - 1);
		LectorArchivos.modificarTXTHechizo(listaHechizos);	
	}

}
