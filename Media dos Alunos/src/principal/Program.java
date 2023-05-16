package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner leia = new Scanner(System.in);
		
		double mediaAluno;
		
		System.out.println("Entre com a primeira nota");
		double nota1 = leia.nextDouble();
		
		System.out.println("Entre com a segunda nota");
		double nota2 = leia.nextDouble();
		
		System.out.println("Entre com a terceira nota");
		double nota3 = leia.nextDouble();
		
		System.out.println("Entre com a quarta nota");
		double nota4 = leia.nextDouble();
		
		mediaAluno = ((nota1 + nota2 + nota3 + nota4)/4);
		
		if(mediaAluno < 6) {
			System.out.println("Aluno reprovado " + mediaAluno);
		}
		else if (mediaAluno >= 6 && mediaAluno <= 7) {
			System.out.println("Aluno de recuperação " + mediaAluno);
		}
		else if(mediaAluno > 7 && mediaAluno < 10) {
			System.out.println("Aluno de aprovado " + mediaAluno);
		}
		else {
			System.out.println("Aluno aprovado com Honras " + mediaAluno);
		}
		
		leia.close();
	}

}
