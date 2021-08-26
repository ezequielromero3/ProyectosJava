package programa;
import dominio.*;


public class Main {

	public static void main(String[] args) {

		Simulador matrix = new Simulador();
		
		matrix.prepararSimulacion();
		
		try {
			System.out.println(matrix.realizarSimulacionRepartidores(matrix.getCandidatos())
					+ "es el nuevo ayudante de Larry!");
		} catch (NingunCandidatoSeleccionadoException e) {
			System.out.println("No se ha seleccionado ningún candidato");
		}
	}

}
