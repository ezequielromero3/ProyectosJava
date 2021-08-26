package dominio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class Simulador {

	private List<Candidato> candidatos;
	
	public void prepararSimulacion()
	{
		Lector lct = new Lector();
		
		candidatos = lct.leerArchivo();
		
		
	}
	
	public Candidato realizarSimulacionRepartidores(List<Candidato> candidatos)
		throws NingunCandidatoSeleccionadoException
		{
			List<Thread> hilos = new ArrayList<>();
			List<Resultado> resultados = new ArrayList<>();
			//String ayuda, ayudin;
			
			for(Candidato cnd : candidatos)
			{
				hilos.add(new Thread(new Corriendo(cnd)));
			}
			for (Thread hilo : hilos) {
				hilo.start();
			}
			
			for (Thread hilo : hilos) {
				try {
					hilo.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}	
			
			resultados.sort(new TiempoComparator());
			//ayuda = resultados.get(0).getNombre();
			System.out.println("Resultados por tiempo:");
			System.out.println(resultados);
	
			System.out.println("\n\n");
			
			resultados.sort(new PuntosComparator());
			//ayudin = resultados.get(0).getNombre();
			System.out.println("Resultados por puntos:");
			System.out.println(resultados);
			
			//if(ayuda == ayudin)
			// no pude comparar los primeros de cada comparacion. hasta ahi llegue
			// con un pobre intento de comparar strings
			
			return null;
			
		
		
		}

	public List<Candidato> getCandidatos() {
		return candidatos;
	}
}
