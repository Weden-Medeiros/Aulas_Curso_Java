package entities;

public class Produto {
	
   

	private String descricao;
    private int quantidade;
    private double preco;
   // private double valorTotalEmEstoque;
    
    
  
   
    
    public String getDescricao() {
        return descricao;
    }
    
  

	public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
  
    
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public double getPreco() {
        return preco;
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
    
   public double ValorTotalEmEstoque() {
        return quantidade * preco;
    }
    
    /*public void atualizarValorTotalEmEstoque() {
        valorTotalEmEstoque = quantidade * preco;
    }*/
    
    /*public void adicionarProduto(int quantidade) {
        this.quantidade += quantidade;
        atualizarValorTotalEmEstoque();
    }*/
    
    public void removerProduto(int quantidade) {
        this.quantidade -= quantidade;
    }
    
    @Override
    public String toString() {
        return "Produto: " + descricao +
               "\nQuantidade: " + quantidade +
               //"\nPreço: " + preco +
               "\nValor total em estoque: "+ String.format("%.2f", ValorTotalEmEstoque());
    }
}