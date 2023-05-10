package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner leia = new Scanner(System.in);
		
		double Celsius, Fahrenheit; //Consegui colocar o nome de variável mais difícil do mundo! o/

		System.out.print("Conversor de temperatura: Graus Celsios -> Fahrenheit\n\n"); //Pronto, bem mais simples!
		
		System.out.println();
		System.out.print("Digite a temperatura em Celsius: ");
		Celsius = leia.nextDouble();
		
		Fahrenheit = ((Celsius  *1.8)+ 32);

		System.out.print("\n A medida convertida é " + Fahrenheit + "ºF\n");
		
		leia.close();
	}

}
