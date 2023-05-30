package principal;
import java.util.Scanner;
public class SomaDosArgumentos
{

	public static void main(String[] args) 
	{		   
		        Scanner entrada = new Scanner(System.in);

		        System.out.print("Digite o primeiro número: ");
		        double numero1 = entrada.nextDouble();

		        System.out.print("Digite o segundo número: ");
		        double numero2 = entrada.nextDouble();

		        System.out.print("Digite o terceiro número: ");
		        double numero3 = entrada.nextDouble();

		        double resultado = somar(numero1, numero2, numero3);
		        System.out.println("A soma de " + numero1 + ", " + numero2 + " e " + numero3 + " é: " + resultado);
		        entrada.close();
	}
	public static double somar(double numero1, double numero2, double numero3)
	{
		        return numero1 + numero2 + numero3;
	}
}
