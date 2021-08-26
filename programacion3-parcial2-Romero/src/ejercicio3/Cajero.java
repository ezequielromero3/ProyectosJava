package ejercicio3;

public class Cajero {
	private int numero;
	
	public Cajero (int numero)
	{
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	@Override
	public String toString() {
		return "Cajero " + numero;
	}
	
	
}
