package entities;

public class Pessoa 
{
	String nome;
	int idade;
	
	
	public Pessoa(String nome, int idade) 
	{
		super();		
		this.nome = nome;
		this.idade = idade;
	}


	public String getNome() 
		{
			return nome;
		}


	public void setNome(String nome) 
		{
			this.nome = nome.toUpperCase();
		}


	public int getIdade() 
		{
			return idade;
		}


	public void setIdade(int idade)
		{
			this.idade = idade;
		}


	@Override
	public String toString() 
		{
			return "Nome: "+ nome+
					"\nIdade: "+ idade;
		}
	
	

}
