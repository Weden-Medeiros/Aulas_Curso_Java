package Principal;
import java.util.Random;
public class Program {
	

	public static void main(String[] args) {
		
		
		

	
		  
		        Random aleatorio = new Random();
		        int dado1 = aleatorio.nextInt(6) + 1;
		        int dado2 = aleatorio.nextInt(6) + 1;
		        int dado3 = aleatorio.nextInt(6) + 1;
		        int soma = dado1 + dado2 + dado3;
		        int bonus = 0;
		        if (dado1 == dado2 && dado2 == dado3) 
		        {
		            bonus = 6;
		            System.out.println("Voc� � muito sortudo!");
		        } else if (dado1 == dado2 || dado2 == dado3 || dado1 == dado3) 
		        {
		            bonus = 2;
		        }
		        int total = soma + bonus;
		        System.out.println("N�mero do dado 1: "+ dado1+ " Pontos");
		        System.out.println("N�mero do dado 2: "+ dado2+ " Pontos");
		        System.out.println("N�mero do dado 2: "+ dado3+ " Pontos");
		        System.out.println("Soma dos n�meros: "+ soma+ " Pontos");
		        System.out.println("B�nus: " + bonus+ " Pontos" );
		        System.out.println("Total: " + total+ " Pontos");
		        if (total < 15) {
		            System.out.println("Lamento, mas voc� perdeu.");
		        } else {
		            System.out.println("Parab�ns! Voc� ganhou!");
		        }
		    }
	
		
		
		
		
		
		
		

	}


