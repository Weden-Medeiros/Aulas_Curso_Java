package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);

		double nota;
		double nota1;
		double nota2;
		double nota3;
		
		System.out.println("Entre com a nota do primeiro BI:");
		nota = leia.nextDouble();//Campo aonde chama trazer apenas numero.	
		
		
		System.out.println("Entre com a nota do segundo BI:");
		nota1 = leia.nextDouble();//Campo aonde chama trazer apenas numero.	
		
		
		System.out.println("Entre com a nota do terceiro  BI:");
		nota2 = leia.nextDouble();//Campo aonde chama trazer apenas numero.	
		
		
		System.out.println("Entre com a nota do quarto  BI:");
		nota3 = leia.nextDouble();//Campo aonde chama trazer apenas numero.	
		
		System.out.print("A media é:"+(nota+nota1+nota2+nota3)/4 );
		leia.close();
	}

}
