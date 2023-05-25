package principal;

import java.util.Scanner;

public class Program 
{

	public static void main(String[] args)
	{
		
		
		
		
		int[] numeros = new int [5];
		int[] numeros2 = {100 , 250, 02, 25, 88};
		
		
		numeros [0] = 10;
		numeros [1] = 25;
		numeros [2] = 1;
		numeros [3] = 99;
		numeros [4] = 33;
		
		System.out.println(numeros [4]);
		System.out.println(numeros2 [2]);
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Quantos nomes deseja salvar na memoria? ");
		int qtd = sc.nextInt();
		sc.nextLine();///vai para proxima linha//
		
		String[] nomes = new String[qtd];
		
		///// For para inserir os dados ////
		for(int contador = 0; contador < nomes.length; contador++)
		{
			System.out.println("Entre com o nome");
			nomes[contador] = sc.nextLine();
		}
		
		/// For para ixibir os dados ///
		for(int contador = 0; contador < nomes.length; contador++)
		{								
		System.out.println(nomes[contador]);
		}
		
		for(String nome : nomes)
		{
			System.out.println(nome);
		}
	
		
		
		String verificar = "Weden";
		if (nomes[0].equals(verificar)) 
		{
			System.out.println("E igual");
		}
		
		/*String nome1 = new String ("Weden");
		String nome2 = new String ("Weden");
		String nome3 = "Weden";
		
		System.out.println(nome1.contentEquals(nome2));*/
			
		
		
		
		sc.close();

	}

}
