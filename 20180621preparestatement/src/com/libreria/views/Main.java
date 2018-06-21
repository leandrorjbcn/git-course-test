package com.libreria.views;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.libreria.entities.Libro;
import com.libreria.entitiesBO.LibroBO;

public class Main {

	public static void main (String[] args) {
		
		LibroBO libroBO = new LibroBO();
		//libroBO.createTable();
		Scanner scanner = new Scanner(System.in);
		
		int op = 0;
		boolean continuar = true;
		
		while(continuar) {
			
			System.out.println("\n      BOOK'S REGISTER \n");
			System.out.println(" [1] - Registrar libro.");
			System.out.println(" [2] - Eliminar libro.");
			System.out.println(" [3] - Actualizar libro.");
			System.out.println(" [4] - Consultar libro por id.");
			System.out.println(" [5] - Consultar libros.");
			System.out.println(" [6] - Salir.");
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
				System.out.println("Nuevo titulo: ");
				String tituloN = scanner.next();
				System.out.println("Nuevo Isbn: ");
				String isbnN = scanner.next();
				System.out.println("Nuevo precio: ");
				float precioN = scanner.nextFloat();
				System.out.println("Nuevo código: ");
				double codigoN = scanner.nextDouble();
				
				libroBO.update(id3, idN, tituloN, isbnN, precioN, codigoN);
				break;
				
			case 4:
				System.out.println("Id del libro: ");
				int id4 = scanner.nextInt();
				
				List<Libro> libro = libroBO.readOne(id4);
				
				Iterator<Libro> it = libro.iterator();
				while(it.hasNext()) {
					Libro l = it.next();
					
					System.out.println(l);
				}
				break;
				
			case 5:
				List<Libro> libros = libroBO.read();
				
				Iterator<Libro> it2 = libros.iterator();
				while(it2.hasNext()) {
					Libro libro2 = it2.next();
					
					System.out.println(libro2);
				}
				break;
				
			case 6:
				System.out.println("Hasta Luego!");
				continuar = false;
				break;
				
			default:
				System.out.println("Introduzca una opción válida!");
				break;
			}
			
		}
		
		
	}
	
}
