package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args)
	{
		
		
		for (int i = 0; i <10; i++)
			{
				System.out.println(i);
			}
		
		
		//For usando quando sabemos a quantidades de vezes que irá repetir//
		System.out.println("////////////////////////");
		
			int i= 0;
			while(i <10)
				{
					System.out.println(i);
				i++;
				}
		//While usamos quando não sabemos a quantidade de vezes que iremos repetir//
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Deseja continuar? ");
			char opcao =  sc.next()	.charAt(0);	
			int j = 0;
			while(opcao =='s')
				{
					j++;
					System.out.print("Deseja continuar? ");
					opcao = sc.next().charAt(0);
	
				}
			System.out.println("Entrou no while: " + j);
			
			//do while, ele garante que sera excutado o bloco do codigo pelo menos 1 vez
			
			
			int k = 0;
			do 				
			{
				System.out.print("Deseja continuar? ");
				opcao = sc.next().charAt(0);
				k++;
			}
			while (Character.toUpperCase(opcao) == 'S');
			System.out.println("Entrou no while: " + k);
			
			
			
			
			
			
			
			
			sc.close();
				
	}

}
