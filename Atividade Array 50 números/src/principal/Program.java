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
		            System.out.print("Digite o número " + (i) + ": ");
		            numeros[i] = sc.nextInt();
		        }
		        
		        
		        for (int i = 1; i < 51; i++) 
		        {
		            if (numeros[i] % 2 == 0) 
		            {
		                System.out.println("Número par é o " + numeros[i]+ ", Posição " +(i));
		            }		        	    
		        }	
		      
		        		        

		            // Parte Aleatório de escolher os numeros //
		               /* Random randon = new Random();
		                int[] numeros = new int[50];
		                
		                for (int i = 1; i < 50; i++) {
		                    numeros[i] = randon.nextInt(50); // Gera um número aleatório entre 0 e 50
		                }
		                
		                System.out.println("Números pares e suas posições:");
		                for (int i = 1; i < 50; i++) {
		                    if (numeros[i] % 2 == 0) {
		                        System.out.println(numeros[i] + " está na posição " + i);
		                    }
		                }	*/	           		        
sc.close();	        
		        
	}
}
