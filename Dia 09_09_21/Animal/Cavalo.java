package Animal;

public class Cavalo extends Animal{
	
	private String correr;

	public Cavalo(String nome, String som, float idade, String correr) {
		super(nome, som, idade);
		this.correr = correr;
	}

	
	public void exibirCavalo()
	{
		System.out.println("\nNome do Cavalo: "+getNome()+"\nQual é o som ?"+getSom()+"\nIdade do bixin : "+getIdade()+"\nEle corre ? "+correr);
	}
	
	
	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}

}
