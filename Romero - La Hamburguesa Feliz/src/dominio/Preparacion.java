package dominio;

import java.util.List;

public class Preparacion implements Runnable {
	
	private Candidato candidato;
	private int tiempo = 0;
	private List<Evaluacion> resultado;
	

	public Preparacion(Candidato candidato, List<Evaluacion> result)  {
		this.candidato = candidato;
		this.resultado = result;
	}



	@Override
	public void run() {
		 int pedidos = 0;
		do{
			pedidos = candidato.getPedidosPreparados();
			tiempo += candidato.prepararPedido();
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		} while (pedidos<20);
		
		synchronized (resultado)
		{
			resultado.add(new Evaluacion(candidato.getNombre(), tiempo));
		}
	}



	public int getTiempo() {
		return tiempo;
	}

}
