package Polimorfismo;

public abstract class Animal { 

	private String nome;
	private String idade;
	abstract public void som(String som);//cria��o dos m�todos abstratos
	abstract public void acao(String acao);

	public Animal(String nome, String idade)
	{
		this.nome = nome;
		this.idade = idade;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getSom(String som)
	{
		return som;
	}
	
	public String getAcao(String acao)
	{
		return acao;
	}
	
}
