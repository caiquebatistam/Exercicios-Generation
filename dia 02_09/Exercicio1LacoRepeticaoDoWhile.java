package ProjetoFamiliaAtividades;

import java.util.Scanner;	

public class Exercicio1LacoRepeticaoDoWhile {
	
/*
 5- Crie um programa que leia um n�mero do teclado at� que encontre um
    n�mero igual a zero. No final, mostre a soma dos n�meros
    digitados.(DO...WHILE) 	
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num,somaNum=0,x=1;
		
		Scanner leia = new Scanner(System.in);
		
		do
		{
			System.out.println("\nDigite um n�mero : ");
			num = leia.nextInt();
			somaNum += num;
		}
		while(num !=0 );
		
		System.out.println("\nA somat�ria dos n�meros � : "+somaNum);

	}

}
