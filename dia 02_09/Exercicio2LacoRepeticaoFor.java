package ProjetoFamiliaAtividades;

import java.util.Scanner;

public class Exercicio2LacoRepeticaoFor {

/*	
	2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)	
*/	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int contPar=0,contImpar=0,num,i;
		
		Scanner leia = new Scanner(System.in);
		
		for(i=1;i<=10;i++)
		{
			System.out.println("\nDigite o número : ");
			num = leia.nextInt();
			
			if(num % 2 == 0)
			{
				contPar++; // para descobrir quantos são pares
			}
			else
			{
				contImpar++; // para descobrir quantos são impares
			}
		
		}
		System.out.println("\nQuandtidade de Pares : "+contPar);
		System.out.println("\nQuandtidade de Impares : "+contImpar);
	}

}
