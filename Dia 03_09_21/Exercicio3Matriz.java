package ProjetoFamiliaAtividades;

import java.util.Scanner;

/*
3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
*/



public class Exercicio3Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int linha=2,coluna=3;
		int numeros[][] = new int[3][3];
		int contMenos10=0;
		
		Scanner leia = new Scanner(System.in);
	
		for(int l = 0 ;l < linha;l++) 
		{
			for(int c = 0;c < coluna;c++)
			{
				System.out.println("Digites os valores, primeiro da linha, em seguida coluna em suas respectivas posições : ");
				numeros[l][c] = leia.nextInt();
					
				if(numeros[l][c] <10)
				{	
						contMenos10++;
				}	
		
			}
		}
			System.out.println("\nDigite quantos números dentro da matriz são menores que Dez ? : "+contMenos10);
		
	}

}
