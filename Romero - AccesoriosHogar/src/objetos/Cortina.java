package objetos;

public class Cortina extends Tela {

	private int ancho;
	private int alto;
	
	public Cortina (String color, int ancho, int alto)
	{
		super("Cortina", color);
		this.ancho = ancho;
		this.alto = alto;
	}
	
	public void oscurecerSala (String sala)
	{
		System.out.println("Oscureciendo "+ sala +".");
	}

	@Override
	public String toString() {
		return super.toString()+", ancho=" + ancho + ", alto=" + alto + ".";
	}
	
	
	
	
	
}
