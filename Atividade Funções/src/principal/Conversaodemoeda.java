package principal;
import java.util.Scanner;
public class Conversaodemoeda 
{

	public static void main(String[] args) 
	{
		

	
		        double taxaDeCambio = 5.012; // taxa de câmbio fixa dia 29/05/2023
		        double valor, valorConvertido;
		        int opcao;

		        Scanner entrada = new Scanner(System.in);

		        System.out.print("Valor a ser convertido: ");
		        valor = Double.parseDouble(entrada.nextLine());

		        System.out.println("\n1. Converter de Real para Dólar");
		        System.out.println("2. Converter de Dólar para Real");
		        System.out.print("Sua opção: ");
		        opcao = Integer.parseInt(entrada.nextLine());

		        if (opcao == 1) 
		        {
		            valorConvertido = converterRealParaDolar(valor, taxaDeCambio);
		            System.out.printf("O valor convertido para Dólar é: $ %.2f", valorConvertido);
		        } 
		        else if (opcao == 2) 
		        {
		            valorConvertido = converterDolarParaReal(valor, taxaDeCambio);
		            System.out.printf("O valor convertido para Real é: R$ %.2f", valorConvertido);
		        } else {
		            System.out.println("Opção inválida.");
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
