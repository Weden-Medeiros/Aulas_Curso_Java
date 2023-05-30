package principal;
import java.util.Scanner;
public class Conversaodemoeda 
{

	public static void main(String[] args) 
	{
		

	
		        double taxaDeCambio = 5.012; // taxa de c�mbio fixa dia 29/05/2023
		        double valor, valorConvertido;
		        int opcao;

		        Scanner entrada = new Scanner(System.in);

		        System.out.print("Valor a ser convertido: ");
		        valor = Double.parseDouble(entrada.nextLine());

		        System.out.println("\n1. Converter de Real para D�lar");
		        System.out.println("2. Converter de D�lar para Real");
		        System.out.print("Sua op��o: ");
		        opcao = Integer.parseInt(entrada.nextLine());

		        if (opcao == 1) 
		        {
		            valorConvertido = converterRealParaDolar(valor, taxaDeCambio);
		            System.out.printf("O valor convertido para D�lar �: $ %.2f", valorConvertido);
		        } 
		        else if (opcao == 2) 
		        {
		            valorConvertido = converterDolarParaReal(valor, taxaDeCambio);
		            System.out.printf("O valor convertido para Real �: R$ %.2f", valorConvertido);
		        } else {
		            System.out.println("Op��o inv�lida.");
		        }
		        entrada.close();	             
	}	
	public static double converterRealParaDolar(double valor, double taxaDeCambio) 
	{
		      	return valor / taxaDeCambio;	    
	}

	public static double converterDolarParaReal(double valor, double taxaDeCambio)
	{
		        return valor * taxaDeCambio;	    	
	}	
}
