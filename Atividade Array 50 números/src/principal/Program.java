package principal;
import java.util.Scanner;
import java.util.Random;
public class Program
{

	public static void main(String[] args) 
	{
		// Parte de escolher os numeros //
		        Scanner sc = new Scanner(System.in);
		        int[] numeros = new int[51];
		        
		        for (int i = 1; i < 51; i++) 
		        {
		            System.out.print("Digite o n�mero " + (i) + ": ");
		            numeros[i] = sc.nextInt();
		        }
		        
		        
		        for (int i = 1; i < 51; i++) 
		        {
		            if (numeros[i] % 2 == 0) 
		            {
		                System.out.println("N�mero par � o " + numeros[i]+ ", Posi��o " +(i));
		            }		        	    
		        }	
		      
		        		        

		            // Parte Aleat�rio de escolher os numeros //
		               /* Random randon = new Random();
		                int[] numeros = new int[50];
		                
		                for (int i = 1; i < 50; i++) {
		                    numeros[i] = randon.nextInt(50); // Gera um n�mero aleat�rio entre 0 e 50
		                }
		                
		                System.out.println("N�meros pares e suas posi��es:");
		                for (int i = 1; i < 50; i++) {
		                    if (numeros[i] % 2 == 0) {
		                        System.out.println(numeros[i] + " est� na posi��o " + i);
		                    }
		                }	*/	           		        
sc.close();	        
		        
	}
}
