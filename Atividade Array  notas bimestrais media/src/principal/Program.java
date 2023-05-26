package principal;
import java.util.Scanner;
public class Program 
{

	public static void main(String[] args) 
	{
		
		
		    
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Entre com o nome do aluno: ");
		        String nomeAluno = sc.nextLine();
		        
		        double[] notas = new double[4];
		        double soma = 0;
		        
		        for (int i = 0; i < 4; i++) 
		        	{
		        		System.out.print("Entre com a nota " + (i + 1) + ": ");
		        		notas[i] = sc.nextDouble();
		        		soma += notas[i];
		        	}
		        
		        double media = soma / 4;
		        System.out.println(nomeAluno + ", a media: " + media);		   	
		        sc.close();
	}


}
