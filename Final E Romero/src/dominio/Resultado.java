package dominio;

public class Resultado {

	private String nombre;
	private int tiempo;
	private int puntos;
	
	public Resultado (String nom, int tmp, int pnt)
	{
		nombre = nom;
		tiempo = tmp;
		puntos = pnt;
	}

	@Override
	public String toString() {
		return nombre + " demoró " + tiempo + " minutos y obtuvo " + puntos + " puntos.";
	}

	public String getNombre() {
		return nombre;
	}

	public int getTiempo() {
		return tiempo;
	}

	public int getPuntos() {
		return puntos;
	}
	
	
}
