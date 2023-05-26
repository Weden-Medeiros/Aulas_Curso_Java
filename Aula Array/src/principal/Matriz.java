package principal;

public class Matriz 
{

	public static void main(String[] args) 
	{
					
		int[][] numeros = new int[3][3];
		int contador = 1;

		for (int i = 0; i < numeros.length; i++) 
		{
		    for (int j = 0; j < numeros.length; j++) 
		    {
		        numeros[i][j] = contador;
		        System.out.print(numeros [i][j]+ "\t");
		        contador++;
		    }
		    	System.out.println();
		}
				System.out.println();
		for (int i = 0; i < numeros.length; i++) {
		    for (int j = 0; j < i; j++) {
		        System.out.print("        ");
		    }
		    System.out.println(numeros[i][i]);
		}
		
		
		
					
		
		
	}

}
