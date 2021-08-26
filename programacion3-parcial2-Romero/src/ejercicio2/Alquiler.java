package ejercicio2;

import java.io.Serializable;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Alquiler implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int cod_alquiler;
	private String titulo_pelicula;
	private int cantidad_alquileres;
	
	public Alquiler ()
	{
		
	}
	
	public Alquiler (int codigo, String titulo)
	{
		this.cod_alquiler = codigo;
		this.titulo_pelicula = titulo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getCod_alquiler() {
		return cod_alquiler;
	}

	public String getTitulo_pelicula() {
		return titulo_pelicula;
	}

	public int getCantidad_alquileres() {
		return cantidad_alquileres;
	}

	public void setCantidad_alquileres(int cantidad_alquileres) {
		this.cantidad_alquileres = cantidad_alquileres;
	}
	
	public List<Alquiler> bajarAlquileres() throws IOException {
		List<Alquiler> alquileres = new ArrayList<>();
		
		BufferedReader in = null;
		
		try {
			in = new BufferedReader(new FileReader("resumen_alquileres.csv"));
			String linea;
			Alquiler alq;
			while ((linea = in.readLine()) != null) {
				alq = crearAlquiler(linea);
				alquileres.add(alq);
			}
			return alquileres;
		} finally
		{
			if (in != null) {
				in.close();
			}
		}
	}
	
	private Alquiler crearAlquiler (String linea)
	{
		String nombre;
		int codigo;
		
		String []atributos = linea.split(",");
		codigo = Integer.parseInt(atributos[0]);
		nombre = atributos[1];
		
		return new Alquiler(codigo, nombre);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj != null && obj instanceof Alquiler) {
			Alquiler otro = (Alquiler) obj;
			if (this.titulo_pelicula.equals(otro.getTitulo_pelicula())) {
				return true;
			}
		}
		
		return false;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((titulo_pelicula == null) ? 0 : titulo_pelicula.hashCode());
		return result;
	}
}
