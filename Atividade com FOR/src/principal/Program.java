package principal;

public class Program 
{

	public static void main(String[] args)
	{
		
		//mais utilizada quando ja sabemos
		// a quantidade de vezes que precisamos 
		//repetir os comandos
		/*
		 * sitaxe do for
		 * 1º variavel que inicia o contador:
		 * 2º condicao que deve ser aceita;
		 * 3º incremeto
		 */
		
		/*for(int contador = 0; contador <10; contador ++)
		{
			System.out.println("valor de contador; "+ contador);
		}*/
		
		
		
		   
		       		int soma = 0;
		        	for (int contador = 1; contador <= 25; contador += 2) 
			        {
			            System.out.println(contador);
			            soma += contador;
			        }
			        System.out.println("Soma dos numeros: " + soma);
			        for (int i = 1; i <= 25; i += 2) {
			            System.out.print(i + " ");
			        }
			        
							
			        int soma1 = 0;
			        for (int contador = 1; contador <= 25; contador += 2)
			        {
			        	System.out.print(contador + " ");
			        	soma1 += contador;
			        }
			        	System.out.println("Soma dos numeros: " + soma1);
			        	
		        //////               Exemplo do professor                 /////
			    /*int soma2 = 0;
			    for(int contador1 =  0; contador1 <=25; contador1 ++)
		        
		        	if(contador1 %2 !=0)
		        	{
		        		System.out.println(contador1 + "\t");
		        		soma2 +=contador1;
		        
		        	}
			    		System.out.println("\nA soma dos numeros impares:" + soma2);
			    		*/
		
		
	}

}
