package ahorcado2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

	static char [] palabraHastaAhora;
	static String palabraSecreta;
	static boolean exito = false;
	
	public static void main(String[] args) {

			String [] palabrasSecretas = {"gato", "perro", "vaca", "buey", "elefante", "mono", "caballo", "tigre", "pantera", "oso"};
			Random randomGenerator = new Random();
			palabraSecreta = palabrasSecretas[randomGenerator.nextInt((int)(palabrasSecretas.length))];
			palabraHastaAhora = new char[palabraSecreta.length()];
			System.out.println("");
			pintarPalabra();
			
			try {
				
				do {
					System.out.println("");
					System.out.println("Introduzca una letra, por favor: ");
					BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
					char letraEvaluada = in.readLine().charAt(0);
					evaluaLetra(letraEvaluada);
					pintarPalabra();
				}while(exito != true);
				System.out.println("");
				System.out.println("Juego completado!");
				
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	
	public static void evaluaLetra(char letraEvaluada) {
		for(int i=0; i<palabraSecreta.length(); i++) {
			if(palabraSecreta.charAt(i)==letraEvaluada) {
				palabraHastaAhora[i] = letraEvaluada;
			}
		}
	}
	
	public static void pintarPalabra() {
		char letra;
		boolean todasBien = true;
		for(int i=0; i<palabraSecreta.length(); i++) {
			letra = palabraSecreta.charAt(i);
			if(letra == palabraHastaAhora[i]) {
				System.out.println(letra);
			}else {
				todasBien = false;
				System.out.println("_ ");
			}
		}
		if(todasBien == true) {
			exito=true;
		}
	}
}
