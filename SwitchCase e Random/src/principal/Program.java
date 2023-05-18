package principal;

import java.util.Random;

public class Program
{

	public static void main(String[] args)
	{
		Random randon = new Random();
	
		int opcao = randon.nextInt(7)+1;
		//String opcao = "Sexta-Feira";
		//int opcao2 = 4;

		
		System.out.println(opcao);
		
		
		
		switch (opcao)
		{
			case 1:
				System.out.println("Domingo");
				break;
				
			case 2:
				System.out.println("Segunda");
				break;
				
			case 3:
					System.out.println("Terça");
				break;
			case 4:
				System.out.println("Quarta");
			break;
			
			case 5:
				System.out.println("Quinta");
			break;
			
			case 6:
				System.out.println("Sexta");
			break;
			
			case 7:
				System.out.println("Sabado");
			break;
			
			default:
				System.out.println("Não corresponder nenhum dia da semana");
				break;
		}
		
		
		
		
		//if (opcao.equals ("Sexta-Feira"))
		
		/*if (opcao == "Sexta-Feira")
		{
			System.out.println("Sextouuuu");
		
			
		} 
		else 
		{
			System.out.println("Não corresponder nenhum dia da semana");
		}*/
		
		
		
	}

}


