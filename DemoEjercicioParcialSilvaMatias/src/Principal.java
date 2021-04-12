import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class Principal {
	static ArrayList<Alumno> listAlumnos = new ArrayList<Alumno>();
	static Alumno esteAlumno;
	static GenerarAlumnos generaAlumnos = new GenerarAlumnos();
	static ArrayList<Catedra> listCatedra = new ArrayList<Catedra>();
	static Catedra estaCatedra;
	static Scanner sn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Generando Arrylist alumnos

		GenAlumnos();
		GenerarCatedras();
		Menu();

	}

	private static void Menu() {
		// TODO Auto-generated method stub
		
		boolean salir = false;
		int opcion; // Guardaremos la opcion del usuario
		while (!salir) {
			System.out.println("1. Agregar Cátedra");
			System.out.println("2. Mostrar la lista de Cátedras");
			System.out.println("3. Ordenar y Mostrar");
			System.out.println("4. Salir");
			try {
				System.out.println("Escribe una de las opciones");
				opcion = sn.nextInt();
				switch (opcion) {
				case 1:
					System.out.println("Has seleccionado la opcion 1");
					AgregarCatedra();
					break;
				case 2:
					System.out.println("Has seleccionado la opcion 2");
					MostrarCatedras();
					break;
				case 3:
					System.out.println("Has seleccionado la opcion 3");
					MenuOrdenar();
					break;
				case 4:
					salir = true;

					break;
				default:
					System.out.println("Solo números entre 1 y 4");
				}
			} catch (InputMismatchException e) {
				System.out.println("Debes insertar un número");
				sn.next();
			}
		}
		sn.close();

	}

	private static void AgregarCatedra() {
		// TODO Auto-generated method stub
		Scanner sn2 = new Scanner(System.in);

		try {
			System.out.println("Ingrese el nombre de la cátedra");
			String catedra = sn2.nextLine();
			System.out.println("Ingrese el nro. de aula");
			int nroAula = sn2.nextInt();
			estaCatedra = new Catedra(catedra, nroAula);
			int numero = (int) (Math.random() * 29);
			for (int i = numero; i < numero + 10; i++) {
				esteAlumno = (Alumno) listAlumnos.get(i);
				estaCatedra.AddAlumno(esteAlumno);
			}
			listCatedra.add(estaCatedra);
		} catch (InputMismatchException e) {
			System.out.println("Debes insertar un número");
			sn2.next();
		}
		//sn2.close();
	}

	private static void MostrarCatedras() {
		// TODO Auto-generated method stub
		Iterator<Catedra> iT = listCatedra.iterator();
		while (iT.hasNext()) {
			estaCatedra = (Catedra) iT.next();
			System.out.println(estaCatedra.toString());
		}
	}

	private static void MenuOrdenar() {
		// TODO Auto-generated method stub
		
		boolean salir = false;
		int opcion; // Guardaremos la opcion del usuario
		while (!salir) {
			System.out.println("1. Por nombre de Cátedra");
			System.out.println("2. Por nro. de aula");
			try {
				System.out.println("Escribe una de las opciones");
				opcion = sn.nextInt();
				switch (opcion) {
				case 1:
					System.out.println("Has seleccionado la opcion 1");
					Collections.sort(listCatedra);
					MostrarCatedras();
					salir = true;
					break;
				case 2:
					System.out.println("Has seleccionado la opcion 2");
					Collections.sort(listCatedra, new CatedraXAula());
					MostrarCatedras();
					salir = true;
					break;
				default:
					System.out.println("Solo números entre 1 y 2");
				}
			} catch (InputMismatchException e) {
				System.out.println("Debes insertar un número");
				sn.next();
			}
		}
		//sn.close();
	}

	private static void GenAlumnos() {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 40; i++) {
			listAlumnos.add(generaAlumnos.generaAlumno());
		}
	}

	private static void GenerarCatedras() {
		// TODO Auto-generated method stub
		int numero = (int) (Math.random() * 29);
		estaCatedra = new Catedra("Matematica", 125);
		for (int i = numero; i < numero + 10; i++) {
			esteAlumno = (Alumno) listAlumnos.get(i);
			estaCatedra.AddAlumno(esteAlumno);
		}
		listCatedra.add(estaCatedra);

		numero = (int) (Math.random() * 29);
		estaCatedra = new Catedra("Lab 3", 120);
		for (int i = numero; i < numero + 10; i++) {
			esteAlumno = (Alumno) listAlumnos.get(i);
			estaCatedra.AddAlumno(esteAlumno);
		}
		listCatedra.add(estaCatedra);

		numero = (int) (Math.random() * 29);
		estaCatedra = new Catedra("Prog 3", 19);
		for (int i = numero; i < numero + 10; i++) {
			esteAlumno = (Alumno) listAlumnos.get(i);
			estaCatedra.AddAlumno(esteAlumno);
		}
		listCatedra.add(estaCatedra);

	}

}
