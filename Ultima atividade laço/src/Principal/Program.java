package Principal;
import java.util.Scanner;
public class Program
{

public static void main(String[] args) 
			{
		  
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Digite o tipo de opera��o (soma, divis�o, multiplica��o, subtra��o): ");
		        String operacao = sc.nextLine();
		        System.out.print("Digite o n�mero: ");
		        int num = sc.nextInt();
		        
		        for (int i = 1; i <= 10; i++)
		        {
		            if (operacao.equals("soma"))
		            	{
		                	System.out.println(num + " + " + i + " = " + (num + i));
		            	} 	
		            else if (operacao.equals("divis�o")) 
		            	{
		            		System.out.println(num + " / " + i + " = " + ((double) num / i));
		                
		            	} 	
		            else if (operacao.equals("multiplica��o")) 
		            	{
		                	System.out.println(num + " * " + i + " = " + (num * i));
		            	} 			
		            else if (operacao.equals("subtra��o"))
		            	
		            	{
		            		System.out.println(num + " - " + i + " = " + (num - i));
		            	}
		        }
		        sc.close();
		    }
	
}
