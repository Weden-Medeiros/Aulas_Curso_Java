package principal;

import java.util.Scanner;

import entities.Livro;

public class Program {

	    public static void main(String[] args) 
	    {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Digite o título do livro: ");
	        String titulo = sc.nextLine();

	        System.out.print("Digite a edição do livro: ");
	        String edicao = sc.nextLine();

	        System.out.print("Digite o valor do livro: ");
	        double valor = sc.nextDouble();

	       Livro livro = new Livro(titulo, edicao, valor);
	       livro.setValor(valor);
	       
	       System.out.println(livro);
	       
	        sc.close();
	    }
	}