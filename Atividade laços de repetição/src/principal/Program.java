package principal;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		

		
		    //////////////////             Primeira Parte                  ////////////////////////////////////////
		        Scanner sc = new Scanner(System.in);
		        double somaAltura = 0;
		        for (int i = 0; i < 5; i++) {
		            System.out.print("Digite a altura da pessoa " + (i + 1) + ": ");
		            double altura = sc.nextDouble();
		            somaAltura += altura;
		        }
		        double mediaAltura = somaAltura / 5;
		        System.out.printf("A média de altura entre as 5 pessoas é:%.2f %n ",  mediaAltura);
		    
		
		
		  ///////////////////////////       Segunda Parte                  ////////// ///////////////////////

		        
		            
		                Scanner sc2 = new Scanner(System.in);
		                int contador = 0;
		                int opcao;
		                do {
		                    System.out.print("Digite 1 para sim e 0 para não: ");
		                    opcao = sc2.nextInt();
		                    if (opcao == 1) {
		                        contador++;
		                    }
		                } while (opcao != 0);
		                System.out.println("O contador foi incrementado " + contador + " vezes.");
		            
		       				
             
		  ////////////////////////////////     Terceira Parte    ///////////////////////////////////////////        
		                
		                
		                        Scanner sc3 = new Scanner(System.in);
		                        double somaAltura2 = 0;
		                        int i = 0;
		                        while (i < 5) {
		                            System.out.print("Digite a altura da pessoa " + (i + 1) + ": ");
		                            double altura = sc3.nextDouble();
		                            somaAltura2 += altura;
		                            i++;
		                        }
		                        double mediaAltura2 = somaAltura2 / 5;
		                        System.out.println("A média de altura entre as 5 pessoas é: " + mediaAltura2);
		                
		//////////////////////////////// Parte do professor  /////////////////////////////////
		
		                       /* Scanner sc = new Scanner(System.in);
		                        double somaAltura = 0;
		                        double altura = 0;
		                        int contador = 1;
		                        
		                        /*for (int contador = 1; contador <=5; contador ++) 
		                        {
		                        	System.out.println("Insira a altura; ");
		                        	altura = sc.nextDouble();
		                        	somaAltura += altura;
		                        }*/
		                        //System.out.println("A media das alturas é: " + somaAltura /5);
		                        /*int contador1 = 0;
		                        while(contador <5)
		                        {
		                        	System.out.println("Insira a altura: ");
		                        	altura = sc.nextDouble();
		                        	somaAltura += altura;
		                        	System.out.println(contador1);
		                        	
		                        }
		                        System.out.println(contador1);
		                        System.out.println("A media das alturas é; " + somaAltura /contador1);*/
		                        
		
		                        
		                        		
		                        
		                        
		                        
		                        
		                        
		                        
		                        
		                        
		                        
		                        
		
		
		                        sc.close();
	}

}
