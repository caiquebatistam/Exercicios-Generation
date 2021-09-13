package Polimorfismo;

public class Cavalo extends Animal {

	public Cavalo()
	{
		super("Carpeado","16");
	}
	@Override
	public void som(String som)
	{
		System.out.println("\nO cavalo faz o som: Pocotó pocotó");
	}
	@Override
	public void acao(String acao)
	{
		System.out.println("\nO cavalo está comendo grama");
	}
	
	
	
	
}
