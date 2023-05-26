package principal;
import java.util.Random;
import java.util.Scanner;
public class Program 

{
	public static void main(String[] args)
	{

		        Scanner sc = new Scanner(System.in);
		        String[] pessoas = new String[10];
		        
		        for (int i = 0; i < 10; i++) 
		        	{
		        		System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
		        		pessoas[i] = sc.nextLine();
		        	}
		        
		        Random rand = new Random();
		        int vencedor = rand.nextInt(10);
		        
		        System.out.println("O vencedor é: " + pessoas[vencedor]);
		    
	
		        sc.close();
	}
			    
}
