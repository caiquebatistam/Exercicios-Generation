package Animal;

public class Preguica extends Animal {
	
	private String sobeArvore;

	public Preguica(String nome, String som, float idade, String sobeArvore) {
		super(nome, som, idade);
		this.sobeArvore = sobeArvore;
	}

	
	public void exibirPreguica()
	{
		System.out.println("\nNome da preguiça: "+getNome()+"\nQual é o som ?"+getSom()+"\nIdade do bixin : "+getIdade()+"\nEle sobe em arvore ? "+sobeArvore);
	}
	
	public String getSobeArvore() 
	{
		return sobeArvore;
	}

	public void setSobeArvore(String sobeArvore) 
	{
		this.sobeArvore = sobeArvore;
	}
	
	
	
	
	

}
