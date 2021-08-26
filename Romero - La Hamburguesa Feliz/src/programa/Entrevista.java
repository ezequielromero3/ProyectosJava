package programa;
import java.util.ArrayList;
import java.util.List;

import dominio.*; 

public class Entrevista {

	public static void main(String[] args) {
	List <Candidato> candidatos = obtenerCandidatos();
	List <Thread> hilos = new ArrayList<>();
	List <Evaluacion> resultado = new ArrayList<>();
	
	for(Candidato entrevistado : candidatos)
		{
			hilos.add(new Thread(new Preparacion(entrevistado, resultado)));
		}
	
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
	
		System.out.println(resultado);
		resultado.sort(new TiempoComparator());
		System.out.println(resultado.get(0).getNombre()+ " es el nuevo empleado. Felicitaciones!!!");
	}

	private static List<Candidato> obtenerCandidatos ()
	{
		List<Candidato> candidatos = new ArrayList<>();
		candidatos.add(new Candidato("Rocky", 5, 9));
		candidatos.add(new Candidato("Director Brown", 10, 12));
		candidatos.add(new Candidato("Richard Watterson", 7, 14));
		
		return candidatos;
	}
}
