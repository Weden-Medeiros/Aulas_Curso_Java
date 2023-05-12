package principal;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//uma constante é quando seu valor não pode mudar
		final double PI = 3.1415;
		int valor1 = 50;
		int valor2 = 65;
		
		//realiza a potencia
		System.out.println(Math.pow(2, 2));
		
		//passagem de 2 numeros como parametro
		//retorna o maior deles
		System.out.println(Math.max(5, 20));
		
		// é o inverso do max, pega o minimo
		System.out.println(Math.max(5, 20));
		
		
		//retorna a raiz quadrada de um numero 
		System.out.println(Math.sqrt(18));
		
		
		//retorna o numero (para mais ou menos) 
		System.out.println(Math.round(25.6578));

		
		//podemos realizar calculos com valores
		//retornados pelo calculo de math.
		System.out.println(2+ Math.sqrt(18));

		Scanner leia = new Scanner (System.in);
		Locale ponto = new Locale("en", "us"); //Comando para usar somente . na tela do usuario.
				
		System.out.println("Entre com o valor do dolar:");
		double dolar = leia.useLocale (ponto).nextDouble();
		
		
		System.out.println("Valor dolar digitado:" + dolar);
		
		String nome = "Weden de Medeiros";
		char sexo = 'M';
		int idade = 30;
		double altura = 1.8333;
		
		System.out.printf("O meu nome é %s, sou do sexo %c, tenho %d anos, minha altura é: %.2f", nome, sexo, idade, altura);
		//para imprimir 2 casa deciamais ai mais você coloca .2, como no %.2f
		
		/*
		 *operadores de comparação 
		 * >  maior que
		 * <  menor que
		 * >= mairo ou igual a
		 * <= menor ou igual a
		 * != diferente de 
		 * == igual a
		 */
		
		/*
		 * operadores lógicos
		 * && = e
		 * || = ou
		 * !  =   negação
		 */
			
		
		leia.close();
			
			
	}

}
