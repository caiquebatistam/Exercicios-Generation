package ProjetoFamiliaAtividades;

import java.util.Scanner;

public class Exercicio2LacoRepeticaoFor {

/*	
	2- Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)	
*/	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int contPar=0,contImpar=0,num,i;
		
		Scanner leia = new Scanner(System.in);
		
		for(i=1;i<=10;i++)
		{
			System.out.println("\nDigite o n�mero : ");
			num = leia.nextInt();
			
			if(num % 2 == 0)
			{
				contPar++; // para descobrir quantos s�o pares
			}
			else
			{
				contImpar++; // para descobrir quantos s�o impares
			}
		
		}
		System.out.println("\nQuandtidade de Pares : "+contPar);
		System.out.println("\nQuandtidade de Impares : "+contImpar);
	}

}
