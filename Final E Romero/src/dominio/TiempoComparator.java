package dominio;

import java.util.Comparator;

public class TiempoComparator implements Comparator<Resultado> {

	@Override
	public int compare(Resultado res1, Resultado res2) {
		if (res1.getTiempo() < res2.getTiempo()) {
			return -1;
		} else if (res1.getTiempo() > res2.getTiempo()) {
			return 1;
		} else {
			return 0;	
		}
	

	}
}