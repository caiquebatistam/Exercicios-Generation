package Polimorfismo;

public class Catioro extends Animal {

	public Catioro()
	{
		super("Mel","12");
	}
	@Override
	public void som(String som)
	{
		System.out.println("\nDog AU AU AU");
	}
	@Override
	public void acao(String acao)
	{
		System.out.println("\nO catioro está amimir");
	}
	
	
}
