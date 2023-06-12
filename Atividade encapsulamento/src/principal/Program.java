package principal;

import java.util.Scanner;

import entities.Produto;

public class Program 

{
	
	
	    public static void main(String[] args) 
	    {
	        Produto produto = new Produto();
	        Scanner sc = new Scanner(System.in);
	        
	        ///       Produto     ////
	        System.out.println("Produto Exemplo: ");	        
	        produto.setDescricao(sc.nextLine());
	        
	        ///       Quantidade  ////
	    
	        System.out.println("Quantidade: ");        
	        produto.setQuantidade(sc.nextInt());
	        
	        ///       Pre�o      ////
	        System.out.println("Pre�o: ");        	      
	        produto.setPreco(sc.nextDouble());
	        
	        System.out.println(produto);
	       
	        System.out.println("Quantidade a ser removida");
	        produto.removerProduto(sc.nextInt());
	        System.out.println(produto);
	        
	        System.out.println(produto);
	        
	        /*
	        /// Dados do estoque ///
	        produto.atualizarValorTotalEmEstoque();
	        
	        System.out.println("Dados iniciais:");
	        System.out.println(produto);
	        
	        produto.adicionarProduto(5);
	        System.out.println("Dados ap�s inser��o:");
	        System.out.println(produto);
	        
	        produto.removerProduto(3);
	        System.out.println("Dados ap�s venda:");
	        System.out.println(produto);*/
	        sc.close();
	    }
	    
}

