package ExerciciosEntrega13_09;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionList {
	
	public static void main(String[] args) {
	
	/*
	Crie uma um programa para trabalhar com estoque de uma loja, o programa dever� trabalhar com Collection do tipo List do Java
	para manipular os dados desse estoque, o programa dever� atender as seguintes funcionalidades:
		-Armazenar dados da List
		-Remover dados da list;
		-Atualizar dados da list.
		-Apresentar todos os dados da list.
	*/
	
	int op;
	Scanner leia = new Scanner(System.in);
	ArrayList<String> estoqueLoja = new ArrayList();
	
	
	do
	{
		System.out.println("\n\t\tLista de op��es: ");
		System.out.println("\n(1)- Deseja adicionar produtos ao estoque ");
		System.out.println("\n(2)- Deseja remover alguem produto do  estoque ?");
		System.out.println("\n(3)- Deseja atualizar produtos do estoque ");
		System.out.println("\n(4)- Deseja mostrar todos os produtos do estoque ");
		System.out.println("\n(0)- Deseja encerrar o programa ? ");
		System.out.println("\nQual a sua op��o ?");
		op = leia.nextInt();
	
		
		switch(op)
		{
		case 1:
			leia.nextLine();//limpando o cash de mem�ria
			System.out.println("\nDigite o produto para adicionar ao estoque");
			String produto = leia.nextLine();
			estoqueLoja.add(produto);
			break;
		case 2:
			leia.nextLine();//limpando o cash de mem�ria
			System.out.println("\nDigite o produto para remover do estoque: ");
			String produtor = leia.nextLine();
			if(estoqueLoja.contains(produtor))//contains -> verificar se o produto que o user digitou existe
			{
				estoqueLoja.remove(produtor);//caso exista, ele � removido
			}
			else // caso n�o exista  
			{
				System.out.println("\nProduto n�o existe !");
			}
			System.out.println(estoqueLoja);
			break;
		case 3: // atualizando produto do meu estoque
			// quando fa�o a att do produto, ele entra em outra posi��o, como se fosse uma pilha
			System.out.println("\nDigite o produto que quer atualizar: ");
			String verifica = leia.nextLine();
			System.out.println("\nDigite o nome do produto que entrar� no lugar do produto "+verifica+" : ");
			String novo = leia.nextLine(); // criando variavel novo
			
			if(estoqueLoja.contains(verifica))// se o produto digitado existir
			{
				estoqueLoja.remove(verifica);// � atualizado
				estoqueLoja.add(novo);
			}
			else
			{
				System.out.println("\nProduto n�o existe ! ");
			}
			System.out.println(estoqueLoja);
			break;
		case 4:
			System.out.println("\nOs produtos do estoque s�o : ");
			System.out.println(estoqueLoja);
			break;
			default:
				System.out.println("\nOp��o invalida!");
	}
		
		
		
		}while(op != 0);
	
	
	
}

}
