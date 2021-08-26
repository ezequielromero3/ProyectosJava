package objetos;
import interfaz.Secable;

public class Mantel extends Tela implements Secable {
	
	private String uso;
	
	public Mantel (String color ,String uso)
	{
		super("Mantel", color);
		this.uso = uso;
	}
	
	public void cubrirMesa (String lugar)
	{
		System.out.println("Cubriendo la mesa de "+ lugar +".");
	}
	
	
	
	@Override
	public String toString() {
		return super.toString()+ ", uso=" + uso + ".";
	}

	@Override
	public void secarPorTiempo (int minutos)
	{
		System.out.println("Secando el mantel por "+ minutos + " minutos.");
	}

}
