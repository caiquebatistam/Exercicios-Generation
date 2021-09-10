package Animal;


public class Catioro extends Animal {

	private String correr;

	public Catioro(String nome, String som, float idade, String correr) {
		super(nome, som, idade);
		this.correr = correr;
	}

	public void exibirCatioro()
	{
		System.out.println("\nNome do doguin: "+getNome()+"\nQual é o som ?"+getSom()+"\nIdade do bixin : "+getIdade()+"\nEle corre ? "+correr);
	}
	
	public String getCorrer() 
	{
		return correr;
	}

	public void setCorrer(String correr) 
	{
		this.correr = correr;
	}
	
	

	
	
}
