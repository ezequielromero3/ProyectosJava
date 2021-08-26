package ejercicio2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Alquiler soloSirvoParaOperar = new Alquiler();
		List<Alquiler> alquileres = new ArrayList<>();
		System.out.println("Leyendo el archivo que me mando Larry:");
		try {
			alquileres = soloSirvoParaOperar.bajarAlquileres();
		} catch (IOException e)
		{
			e.printStackTrace();
		}

		System.out.println("En este mes, se registraron " + alquileres.size() + " alquileres.");
		
		Set<Alquiler> unicas = new LinkedHashSet<>(alquileres);
		
		System.out.println("Se alquilaron "+ unicas.size() + " películas distintas.");
		
		Map<String, Integer> mapa = new HashMap<>();
		int cantidad = 0;
		for(Alquiler peli : unicas)
		{
			cantidad = Collections.frequency(alquileres, peli);
			mapa.put(peli.getTitulo_pelicula(), cantidad);
		}
		
		System.out.println(mapa);
		
	}

}
