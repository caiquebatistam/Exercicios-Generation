package Animal;

public class PrincipalTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Catioro catioro = new Catioro("Mel","Latido,AU AU AU AU!!!",12,"Verdadeiro");
		Cavalo cavalo = new Cavalo("Carpeado","Relincha,iiirrrr�",6,"Verdadeiro");
		Preguica preguica = new Preguica("Pregui�osa","Barulhos de alta frenquencia",5,"Verdadeiro");
		
		catioro.exibirCatioro();
		cavalo.exibirCavalo();
		preguica.exibirPreguica();
		
	}

}
