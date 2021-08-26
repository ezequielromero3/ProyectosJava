package dominio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

public class Escritor {

	public void escribirArchivo (Map<Integer, Integer> base)
	{
		PrintWriter archivo = null;
		
		try {
			archivo = new PrintWriter(new FileWriter("frecuencias.csv"));

			for (Map.Entry<Integer, Integer> entrada : base.entrySet()) {
				archivo.println(entrada.getKey() + "," + entrada.getValue());
			}
		} catch (IOException e) {
			System.err.println("Error al escribir el archivo. " + e.getMessage());
		} finally {
			if (archivo != null) {
				archivo.close();
			}
		}
	}
}
