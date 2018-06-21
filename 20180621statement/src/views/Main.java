package views;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import entities.Libro;
import entitiesBO.LibroBO;

public class Main {

	
	public static void main(String[] args) {
		
		LibroBO libroBO = new LibroBO();
		Scanner scanner = new Scanner(System.in);
		
		int op = 0;
		
		boolean continuar = true;
		
		while(continuar) {
			System.out.println("\n      BOOK'S REGISTER\n");
			System.out.println("[1] - Registrar libro.");
			System.out.println("[2] - Eliminar libro.");
			System.out.println("[3] - Actualizar libro.");
			System.out.println("[4] - Listar libros.");
			System.out.println("[5] - Salir.");
			System.out.println("\n Introduzca una opción: ");
			op = scanner.nextInt();
			
			switch(op) {
			
			case 1:
				System.out.println("Id: ");
				int id = scanner.nextInt();
				System.out.println("Titulo: ");
				String titulo = scanner.next();
				System.out.println("Isbn: ");
				String isbn = scanner.next();
				System.out.println("Precio: ");
				float precio = scanner.nextFloat();
				System.out.println("Código: ");
				double codigo = scanner.nextDouble();
				
				libroBO.create(id, titulo, isbn, precio, codigo);
				break;
				
			case 2:
				System.out.println("Delete id: ");
				int id2 = scanner.nextInt();
				
				libroBO.delete(id2);
				break;
				
			case 3:
				System.out.println("Actualizar Id: ");
				int id3 = scanner.nextInt();
				System.out.println("Nuevo id: ");
				int idN = scanner.nextInt();
				System.out.println("Nuevo Titulo: ");
				String tituloN = scanner.next();
				System.out.println("Nuevo Isbn: ");
				String isbnN = scanner.next();
				System.out.println("Nuevo Precio: ");
				float precioN = scanner.nextFloat();
				System.out.println("Nuevo código: ");
				double codigoN = scanner.nextDouble();
				
				libroBO.update(id3, idN, tituloN, isbnN, precioN, codigoN);
				break;
				
			case 4:
				
				List<Libro> libros = libroBO.read();
				
				Iterator<Libro> it = libros.iterator();
				while(it.hasNext()) {
					Libro libro = it.next();
					System.out.println(libro);
				}
				break;
				
			case 5:
				System.out.println("Hasta luego!");
				continuar = false;
				break;
				
			default:
				System.out.println("Introduzca una opción válida!");
				break;
			}
			
			
		}
	}
	
}






















