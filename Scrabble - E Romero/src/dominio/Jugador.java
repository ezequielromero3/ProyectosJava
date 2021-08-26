package dominio;

import java.util.*;
public class Jugador {

	private String nombre;
	private int id;
	private static int contador=0;
	private ArrayList<Ficha> Fichero = new ArrayList <Ficha>();
	
	public Jugador (String nombre)
	{
		
		this.nombre = nombre;

		this.id=obtenerProximoId();
	}
	
	private static int obtenerProximoId()
	{
		contador++;
		return contador;
		
	
		
	}
	
	public ArrayList<Ficha> getFichero() {
		return Fichero;
	}
	
	public int calcularValorFichas()
	{
		int valor=0;
		for(Ficha f : Fichero)
		{
			valor+=f.getPuntos();
		}
		return valor;
	}
	
	public void mostrarFichas()
	{
		for(Ficha f: Fichero)
		{
			System.out.println(f);
		}
	}

	@Override
	public String toString() {
		return "Jugador: " + nombre + ", id:" + id;
	}

}
