package dominio;


import java.util.List;
import java.util.Random;

public class Corriendo implements Runnable {

	private Candidato cand;
	private Random r1 = new Random();
	private List<Resultado> resultados;
	
	public Corriendo(Candidato cnd) {
		cand = cnd;
	}

	@Override
	public void run() {
		int tiempo = 0;
		int puntos = 0;
		int pedidos = 0;
		
		while(pedidos <10) {
			
			tiempo+= r1.nextInt(cand.getDemora_maxima()-cand.getDemora_minima())+ cand.getDemora_minima();
			puntos+=r1.nextInt(10)+1;
			
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			pedidos++;
		}
		
		synchronized (resultados)
		{
			resultados.add(new Resultado(cand.getNombre(), tiempo, puntos));
		}
		
		
		

	}

}
