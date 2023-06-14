package entities;

public class Livro 

/*
 * Ordem seguerida a seguir na classe;
 * 1� atributos da classe
 * 2� contrutores
 * 3� metodos get e set
 * 4� demais metodos
 */
{
    private String titulo;
    private String edicao;
    private double valor;

    public Livro(String titulo, String edicao, double valor) 
	    {
	        this.titulo = titulo;
	        this.edicao = edicao;
	        this.valor = valor;
	    }

   
    public double getValor() 
		    {
		       
		            return valor;
		    }	    
    public void setValor(double valor) 
	    {
    	 if (valor> 100) 
		        {
	    		 	this.valor += (valor * 0.3);
		        }
    		 else	            
	       { 	        
	        this.valor = valor;
	       }
	    }
	@Override
	public String toString() {
		return "Nome do livro: "+ titulo 
				+"\nEdic��o: " 	+ edicao 
				+"\nValor: " 	+ valor;
	}
}

