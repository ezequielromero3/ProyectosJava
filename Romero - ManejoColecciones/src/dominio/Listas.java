package dominio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Listas {
	private List<Integer> soyUnaLista = new ArrayList<>();
	private Random r1 = new Random();
	private Integer numero;
	public Listas ()
	{
		
	}
	
	public void mostrarListaOrdenada()
	{
		Collections.sort(soyUnaLista);
		System.out.println(soyUnaLista);
	}
	
	public void cargarLista ()
	{
		
		for (int i=0; i<100; i++)
		{
			numero = (Integer) (r1.nextInt(50) +1);
			soyUnaLista.add(numero);
		}
	}

	public List<Integer> getSoyUnaLista() {
		return soyUnaLista;
	}

	public Integer getNumero() {
		return numero;
	}
}
