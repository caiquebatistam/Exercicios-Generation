package Animal;

public class Animal {

	// criação dos atributos class
	private String  nome;
	private String  som;
	private float idade;
	
	
	// construtor
	
	public Animal(String nome,String som, float idade)
	{
		super();
		this.nome = nome;
		this.som = som;
		this.idade = idade;
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSom() {
		return som;
	}
	public void setSom(String som) {
		this.som = som;
	}
	public float getIdade() {
		return idade;
	}
	public void setIdade(float idade) {
		this.idade = idade;
	}

}
