package objetos;
import interfaz.Secable;

public class Toalla extends Tela implements Secable{

	private int grosor;
	private String tipo;
	
	public Toalla (String color, int grosor, String tipo)
	{
		super("Toalla", color);
		this.grosor = grosor;
		this.tipo= tipo;
	}
	
	public void secar (String queSeco)
	{
		System.out.println("Secando "+queSeco + ".");
	}
	
	
	@Override
	public String toString() {
		return super.toString() +", grosor=" + grosor + ", tipo=" + tipo + ".";
	}

	@Override
	public void secarPorTiempo (int minutos)
	{
		System.out.println("Secando la toalla por "+ minutos + " minutos.");
	}
}
