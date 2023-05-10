package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	
		
		
		Scanner leia = new Scanner (System.in);

		double horatrabalhada;
		double quantidadepormes;
		
		
		System.out.println("Quanto você ganha por hora trabalhada:");
		horatrabalhada = leia.nextDouble();//Campo aonde chama trazer apenas numero.	
		
		System.out.println("Quanto:");
		quantidadepormes = leia.nextDouble();//Campo aonde chama trazer apenas numero.
		
		
		
		
		System.out.print("A hora trabalhada :"+(horatrabalhada *quantidadepormes));
		leia.close();
		
	}

}
