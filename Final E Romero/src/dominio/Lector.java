package dominio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Lector {

	public List<Candidato> leerArchivo() {
		List<Candidato> candidatos = new ArrayList<>();
		
		BufferedReader archivo = null;
		
		try {
			archivo = new BufferedReader(new FileReader("candidatos.csv"));
			
			String linea;
			while ((linea = archivo.readLine()) != null) {
				candidatos.add(crearCandidato(linea));
			}
			
		} catch (IOException e) {
			System.err.println("Error al leer el archivo. " + e.getMessage());
		} finally {
			if (archivo != null) {
				try {
					archivo.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		return candidatos;
	}
	
	private Candidato crearCandidato(String linea) {
		String[] datos = linea.split(",");
		return new Candidato(datos[0], Integer.valueOf(datos[1]), Integer.valueOf(datos[2]));
	}
}
