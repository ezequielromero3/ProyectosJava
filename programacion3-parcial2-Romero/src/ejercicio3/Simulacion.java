package ejercicio3;

import java.util.Random;

public class Simulacion implements Runnable{

	private Cajero caj;
	
	private Random r1 = new Random();
	
	public Simulacion (Cajero cajero)
	{
		this.caj = cajero;
	}
	
	@Override
	public void run() {
		int descanso = 0;
		int productos = 1+r1.nextInt(15);
		System.out.println("Arranca el " + caj + " con "+ productos + " productos.");
		int i=1;
		do {
			System.out.println("\t"+caj + " -> Producto " + i);	
			productos--;
			i++;
			descanso = r1.nextInt((50-30)+1) + 30;
			
			try {
				Thread.sleep(descanso);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			
				
		} while (productos>0);
		System.out.println("Finalizó el "+ caj);
	}

}
