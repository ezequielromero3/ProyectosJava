package dominio;

import java.util.Random;

public class Candidato {
	private String nombre;
	private int minAtencion;
	private int maxAtencion;
	private int pedidosPreparados = 0;
	
	private Random r = new Random();
	
	public Candidato(String nombre, int minAtencion, int maxAtencion) {
		this.nombre = nombre;
		this.minAtencion = minAtencion;
		this.maxAtencion = maxAtencion;
	}

	public String getNombre() {
		return nombre;
	}

	public int getMinAtencion() {
		return minAtencion;
	}
	
	public int getPedidosPreparados() {
		return pedidosPreparados;
	}
	public int getMaxAtencion() {
		return maxAtencion;
	}

	@Override
	public String toString() {
		return nombre;
	}
	
	public int prepararPedido()
	{
		int tiempo = r.nextInt(maxAtencion - minAtencion +1) + minAtencion;
		pedidosPreparados++;
		return tiempo;
	}
	
	

}
