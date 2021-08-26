package dominio;

import java.util.Comparator;

public class PuntosComparator implements Comparator<Resultado> {

	@Override
	public int compare(Resultado res1, Resultado res2) {
		if (res1.getPuntos() < res2.getPuntos()) {
			return -1;
		} else if (res1.getPuntos() > res2.getPuntos()) {
			return 1;
		} else 
		return 0;
	}

}
