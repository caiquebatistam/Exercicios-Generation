package Polimorfismo;

public class Preguica extends Animal {
	
	public Preguica()
	{
		super("Animada","2");
	}
	
	@Override
	public void som(String som)
	{
		System.out.println("\nO preguica faz o som: Ol� gateeenha");
	}
	@Override
	public void acao(String acao)
	{
		System.out.println("\nA preguica est� a mirmir");
	}
	
	

}
