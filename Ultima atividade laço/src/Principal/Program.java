package Principal;
import java.util.Scanner;
public class Program
{

public static void main(String[] args) 
			{
		  
           
		                 Scanner sc = new Scanner(System.in);
		                 System.out.println("Digite a operação (soma, subtração, multiplicação, divisão): ");
		                 String operacao = sc.nextLine();
		                 System.out.println("Digite o número: ");
		                 int num = sc.nextInt();
		                 for (int i = 1; i <= 10; i++) 
		                 {
		                 
		                  if (operacao.equals("soma")) 
		                  	{
		                      System.out.println(num + " + " + i + " = " + (num + i));
		                  	}
		                  else if (operacao.equals("subtração")) 
		                  	{
		                	  System.out.println((num + i) + " - " + num + " = " + i);
		                    }
		                  else if (operacao.equals("multiplicação")) 
		                     {
		                      System.out.println(num + " * " + i + " = " + (num * i));
		                     } 
		                  else if (operacao.equals("divisão"))
		                     {
		                	  System.out.println((num * i) + " / " + num + " = " + i);	                                       
		                     }		                                                     
		                 }	                            	        
		       sc.close();
		   }
	
}
