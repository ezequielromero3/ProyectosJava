package programa;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;


import dominio.Listas;
import dominio.Escritor;

public class Main {

	public static void main(String[] args) {
		Listas miLista = new Listas();
		Listas otraLista = new Listas();
		
		miLista.cargarLista();
		System.out.println("Esta es la lista generada en miLista:");
		miLista.mostrarListaOrdenada();
		
		otraLista.cargarLista();
		System.out.println("\n\nEsta es la lista generada en otraLista:");
		otraLista.mostrarListaOrdenada();
		
		
		Set<Integer> setUnico = new LinkedHashSet<>(miLista.getSoyUnaLista());
		setUnico.addAll(otraLista.getSoyUnaLista());
		System.out.println("\n\n"+setUnico +"\nCantidad de números unicos en las dos listas: " 
				+ setUnico.size());
		
		Set<Integer> setDuplicado = new HashSet<>(miLista.getSoyUnaLista());
		setDuplicado.retainAll(otraLista.getSoyUnaLista());
		System.out.println("\n\n"+ setDuplicado +
				"\nCantidad de números duplicados en las dos listas: " + setDuplicado.size());
		
		Integer cantidad = 0;
		
		Map<Integer, Integer>soyUnMapa = new HashMap<>();
		for(Integer unico : setUnico){
			cantidad =  Collections.frequency(miLista.getSoyUnaLista(), unico);
			cantidad += Collections.frequency(otraLista.getSoyUnaLista(), unico);
			soyUnMapa.put(unico, cantidad);
		}
		//Aca tengo dudas si los pares que se piden son número - apariciones. O si es 
		//la cantidad de números pares.
		System.out.println("\n\nHay " + soyUnMapa.size() + " pares en el mapa.\n" + soyUnMapa);
		
		Escritor esc = new Escritor();
		esc.escribirArchivo(soyUnMapa);
	}

}
