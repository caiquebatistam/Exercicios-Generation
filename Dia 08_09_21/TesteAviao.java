package OrientadoObjetos;

public class TesteAviao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aviao [] infos = new Aviao[1];
		
		infos[0] = new Aviao("Douglas DC-3","Boeing 274","Branca","1935",28,2000,447);

		
		
		for(Aviao roda:infos)
		{
			roda.exibirAviao();
		}
		System.out.println("\n");
	
	}

}
