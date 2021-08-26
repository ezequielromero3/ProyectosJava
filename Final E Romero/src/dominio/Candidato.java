package dominio;

public class Candidato {

	private String nombre;
	private int demora_minima;
	private int demora_maxima;
	
	public Candidato (String nom, int min, int max)
	{
		nombre= nom;
		demora_minima = min;
		demora_maxima = max;
	}

	@Override
	public String toString() {
		return nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public int getDemora_minima() {
		return demora_minima;
	}

	public int getDemora_maxima() {
		return demora_maxima;
	}
	
	
}
