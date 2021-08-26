package programa;

import dominio.Ficha;
import dominio.Juego;
import dominio.Jugador;
import java.util.*;
public class Scrabble {

	public static void main(String[] args) {
		

		Scanner teclado = new Scanner(System.in);
		
		Juego jg = new Juego();
		jg.ensureCapacity(100);
		jg.generarFichas();
		
		int cantJugadores;
		
		do {
		System.out.println("Ingrese cuántos jugadores van a jugar:");
		cantJugadores = teclado.nextInt();
		} while (cantJugadores >4 || cantJugadores<2 );
		jg.configurarJugadores(cantJugadores);
		
		jg.asignarFichas();
		
		
		jg.llamarFichero();
		
		
		System.out.println("Presione ENTER para continuar.");
		teclado.nextLine();
		teclado.nextLine();
	
		jg.mostrarValor();
		
		System.out.println("Presione ENTER para continuar.");
		teclado.nextLine();
		
		
		teclado.close();
		jg.cerrarTeclado();

	}
	
}
