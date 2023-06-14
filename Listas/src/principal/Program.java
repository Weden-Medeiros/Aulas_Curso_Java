package principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {

	public static void main(String[] args) 
	{
		List<String> nomes = new ArrayList<>();
		
		nomes.add("Weden");
		nomes.add("Maria");
		nomes.add("Grogu");
		nomes.add("Reri poti");
		
		//mostrar os dados da lista		
		for (String nome : nomes)
		{
			System.out.println("Nome: " + nome);
		}
		/// remove os dados da lista 
		//nomes.remove(2);
		
		for (String nome : nomes)
		{
			System.out.println("Nome: " + nome);
		}
		//// obtem o dado da lista por indice (posição na memoria
			System.out.println(nomes.get(3));
			
		
			String dado = nomes.stream().filter(x ->x == "Wedens").findFirst().orElse(null);
			
		
			Collections.sort(nomes);
			System.out.println("imprimindo em ordem alfabetica");
			for (String nome : nomes) 
				{
					System.out.println("Nome1: " + nome);
				}
			System.out.println(dado);
	}
}
