package principal;

/**
 * @author Aluno Noite
 *
 */
public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 variaveis s�o espa�o alocados na memoria que salva uma informa��o (um dado)
		 
		 int armazena numero inteiros int s�o numeros: 1,2,3,10,150.. 
		 double que s�o numeros com casas decimais exemplo 10.50.25..99...
		 Char � o tipo qie armazena um caractere � um tipo "literal" e a sua inicializa��o � feita
		 aspas simples
		 String � um classe do java utilizada para armazenar cadeias de caracteres (frases por exemplo)
		 sua inicializa��o � feita com aspas duplas exemplo de String: nomes, locais...	 
		*/
		int numero = 10;
		double precoDaCamisa = 20.52;
		String nome = "Weden de Medeiros";
		char sexo = 'M';
		
		int num1 = 5;
		int num2 = 10;
		int resultado = num1+num2;
		
		
		String nomeDoAluno = "Weden de Medeiros";
		int idade = 30;
		double saldoConta = 9.50;
		
		
		System.out.println(numero);
		System.out.println(precoDaCamisa);
		System.out.println(nome);
		System.out.println(sexo);
		
		
		precoDaCamisa = 50.65;
		System.out.println(precoDaCamisa);
		System.out.println();
		System.out.println();
		
		System.out.print(nome);
		System.out.print(sexo);
		System.out.print(precoDaCamisa);
		System.out.println();
		System.out.println();
		
		
		System.out.print(nome+" "+ sexo +" "+ precoDaCamisa);
		System.out.println();
		
		 //concatena��o //
		System.out.print(nome + " comprou uma camisa com o valor de: " + precoDaCamisa);
		System.out.println();
		System.out.println();
		 //concatena��o Atividade//
		nome = "Weden e janaina";
		precoDaCamisa = 50.99;
		System.out.print(nome + " Novo pre�o: " + precoDaCamisa);
		System.out.println();
		System.out.println(2+ 2);
		
		
		/* Criando variavel com soma e um resultado*/
		System.out.println(num1+num2);
		System.out.println("O resultado �:"+resultado );
		System.out.println("O resultado �:" + (+num1+num2) );
		System.out.println();
		
		
		/*
		  Crie uma variavel com seu nome
		  Crie uma variavel com sua idade
		  Crie uma variavel com um saldo da conta
		  mostre na tela a frase
		  Luan muruk tem 32 anos e possui 5 reais na conta
		   */
		
		
		System.out.println();
		System.out.print(nomeDoAluno +" tem " + idade + " anos e possui " + saldoConta+"reais");
		System.out.println();
		
		
		}
	
}
