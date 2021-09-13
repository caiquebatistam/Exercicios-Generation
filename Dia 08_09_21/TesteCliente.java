package OrientadoObjetos;

public class TesteCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente [] infos = new Cliente[3];
		
		infos[0] = new Cliente("Radalberto Flinflon","Rua dois",39050505);
		infos[1] = new Cliente("Felismena Tarkovick","Rua jump",39252502);
		infos[2] = new Cliente("Amado Amoroso","Rua Biscoito",2345678);	
		
		for(Cliente roda:infos)//  : pois é uma sintaxe
			// chama o array infos
		{
			roda.imprimir();
		}
		System.out.println("\n");
		
	
	}
	
}
