package programa;
import objetos.*;
import java.util.Scanner;

import interfaz.Secable;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Programa {

	public static void main(String[] args) {
		
		
			Scanner teclado = new Scanner(System.in);
			List <Tela> accesorios = new ArrayList<>();
			Secable[] cosasSecables = new Secable [6];
			
			String color, uso, tipo;
			int ancho, alto, grosor, alpha;
			
			
			for (int i=1; i<=6; i++)
			{
				switch(i)
				{	
					case 1:
						System.out.println("Ingrese el color de la cortina: ");
						color = teclado.nextLine();
						System.out.println("Ingrese el ancho de la cortina: ");
						ancho = teclado.nextInt();
						System.out.println("Ingrese el alto de la cortina: ");
						alto = teclado.nextInt();
						accesorios.add(new Cortina(color, ancho, alto));
					break;
					 case 2:
						teclado.nextLine();
						System.out.println("Ingrese el color de la cortina: ");
						color = teclado.nextLine();
						System.out.println("Ingrese el ancho de la cortina: ");
						ancho = teclado.nextInt();
						System.out.println("Ingrese el alto de la cortina: ");
						alto = teclado.nextInt();
						accesorios.add(new Cortina(color, ancho, alto));
					break;
					case 3: case 4:
						teclado.nextLine();
						System.out.println("Ingrese el color del mantel: ");
						color = teclado.nextLine();
						System.out.println("Presione 1 si es de uso diario, cualquier otra tecla para"
								+" ocasiones especiales: ");
						alpha = teclado.nextInt();
						if (alpha == 1)
						{
							uso = "uso diario";
							accesorios.add(new Mantel(color, uso));
						} else
						{
							uso = "ocasiones especiales";
							accesorios.add(new Mantel(color, uso));
						}
					break;
					case 5: case 6:
						teclado.nextLine();
						System.out.println("Ingrese el color de la toalla: ");
						color = teclado.nextLine();
						System.out.println("Ingrese el grosor de la toalla: ");
						grosor = teclado.nextInt();
						System.out.println("Presione 1 si la toalla es de mano, 2 si es de tocador,"
								+" cualquier otra tecla si es de ducha: ");
						alpha = teclado.nextInt();
						if(alpha ==1)
						{
							tipo = "de mano";
							accesorios.add(new Toalla(color, grosor, tipo));
						} else if(alpha == 2)
						{
							tipo = "de tocador";
							accesorios.add(new Toalla(color, grosor, tipo));
						} else
						{
							tipo = "de ducha";
							accesorios.add(new Toalla(color, grosor, tipo));
						}
					break;
					default:
						break;
				
				}
			}
			System.out.println("\n\n");
			for(Tela t : accesorios)
			System.out.println(t);
			
			teclado.nextLine();
			teclado.nextLine();
			
			System.out.println("\n\n");
			Random rnd = new Random();
			for (int j=0; j<6; j++)
			{
				cosasSecables[j]= (Secable) (accesorios.get(2+rnd.nextInt(4)));
			}
			
			
			for(Secable te: cosasSecables)
			{
				te.secarPorTiempo(1+rnd.nextInt(30));
			}
			teclado.nextLine();
			
			teclado.close();
			

	}

}
