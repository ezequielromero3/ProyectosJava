package dominio;

import java.util.Comparator;

public class TiempoComparator implements Comparator<Evaluacion> {

	@Override
	public int compare(Evaluacion emp1, Evaluacion emp2) {
	
		if (emp1.getTiempo() < emp2.getTiempo()) {
			return -1;
		} else if (emp1.getTiempo() > emp2.getTiempo()) {
			return 1;
		} else {
			return 0;	
		}
	}

}
