package dominio;

import java.util.*;


public class Juego {

	private ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
	private ArrayList<Ficha> fichas = new ArrayList<Ficha>();
	private Scanner teclado = new Scanner(System.in);
	
	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}

	public ArrayList<Ficha> getFichas() {
		return fichas;
	}
	
	
	public void ensureCapacity(int minCapacity)
	{
		fichas.ensureCapacity(minCapacity);
	}
	
	public void configurarJugadores(int j)
	{
		String nm;
		for(int i=0; i<j; i++)
		{
			System.out.println("Ingrese el nombre del jugador "+(i+1));
			nm=teclado.nextLine();
			jugadores.add(new Jugador(nm));
		}
	}
	public void llamarFichero()
	{
		for(Jugador j: jugadores)
		{	
			System.out.println(j+". "+"Tiene las fichas:");
			j.mostrarFichas();
			System.out.println("\n");
		}

	}
	
	public void mostrarValor()
	{
		for (Jugador j: jugadores)
		{
			System.out.println(j+". "+ "Tiene "+j.calcularValorFichas()+" puntos en su fichero");
			System.out.println("\n");
		}

	}		
	
	public void generarFichas()
	{
		String abecedario= "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
		int tamanio = abecedario.length();
		int puntos;
		char letra;
		Random r1 = new Random();
		Random r2 = new Random();
		for (int i=0; i<100; i++)
		{
			letra = (abecedario.charAt(r1.nextInt(tamanio)));
			puntos = 1+ r2.nextInt(3);
			fichas.add(new Ficha(letra, puntos));
		}
	}
	
	public void asignarFichas()
	{
		Random rnd = new Random();
		int fichin = 0;
		for (Jugador j: jugadores)
		{
			
			
			for (int i=0; i<7; i++)
			{
				fichin= rnd.nextInt(fichas.size()); 
				j.getFichero().add(fichas.get(fichin));
				fichas.remove(fichin);
			
			}
		}
	}
	



	public void cerrarTeclado()
	{
		teclado.close();
	}
	
	
}
