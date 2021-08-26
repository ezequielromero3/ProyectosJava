package dominio;

public class Ficha {
	
	private char letra;
	private int puntos;
	
	public Ficha (char let, int puntos)
	{
		letra = let;
		this.puntos = puntos;
	}

	public char getLetra() {
		return letra;
	}

	public int getPuntos() {
		return puntos;
	}

	@Override
	public String toString() {
		return "Ficha " + letra + " vale " + puntos +" puntos";
	}
	
	

}
