package objetos;


public  abstract class Tela{
	private String clase;
	private String color;
	
	public Tela (String clase, String color)
	{
		this.clase = clase;
		this.color = color;
	}
	
	

	@Override
	public String toString() {
		return clase + ", color=" + color +" ";
	}
	
	
}
