package principal;
import java.util.Scanner;
import entites.AreaTerreno;


public class Program
{

	public static void main(String[] args) 
	{
	  
		        Scanner sc = new Scanner(System.in);
		        AreaTerreno terreno = new AreaTerreno();

		        System.out.println("Entre com a largura do terreno: ");
		        double largura = sc.nextDouble();
		        System.out.println("Entre com o comprimento do terreno: ");
		        double comprimento = sc.nextDouble();

		        terreno.retornaArea(largura, comprimento);
		        System.out.println("A �rea do terreno �: " + terreno.area+ " m�");

		        sc.close();
		    }
}
