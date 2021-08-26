package ejercicio3;

import java.util.ArrayList;
import java.util.List;





public class Main {

	public static void main(String[] args) {
		List<Cajero> cajeros = obtenerCajeros();
		List<Thread> hilos = new ArrayList<>();
		
		
		for(Cajero caj : cajeros)
		{
			hilos.add(new Thread(new Simulacion(caj)));
		}
		
		System.out.println("Inicio de la simulación:");
	
	for(Thread hilo : hilos)
	{
		hilo.start();
	}
	
	for(Thread hilo : hilos)
	{
		try {
			hilo.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	System.out.println("Finalizó la simulación.");

	}
	private static List<Cajero> obtenerCajeros ()
	{
		List<Cajero> cajeros = new ArrayList<>();
		cajeros.add(new Cajero(1));
		cajeros.add(new Cajero(2));
		cajeros.add(new Cajero(3));
		cajeros.add(new Cajero(4));
		
		return cajeros;
	}
}
