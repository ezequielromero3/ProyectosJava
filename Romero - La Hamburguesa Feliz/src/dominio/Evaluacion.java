package dominio;

public class Evaluacion {

	private String nombre;
	private int tiempo;
	
	public Evaluacion(String nombre, int tiempo) {
		this.nombre = nombre;
		this.tiempo = tiempo;
	}

	@Override
	public String toString() {
		return nombre + " tardó " + tiempo +" segundos";
	}

	public String getNombre() {
		return nombre;
	}

	public int getTiempo() {
		return tiempo;
	}
}
