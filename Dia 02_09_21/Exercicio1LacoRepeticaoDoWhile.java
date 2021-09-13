package ProjetoFamiliaAtividades;

import java.util.Scanner;	

public class Exercicio1LacoRepeticaoDoWhile {
	
/*
 5- Crie um programa que leia um número do teclado até que encontre um
    número igual a zero. No final, mostre a soma dos números
    digitados.(DO...WHILE) 	
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num,somaNum=0,x=1;
		
		Scanner leia = new Scanner(System.in);
		
		do
		{
			System.out.println("\nDigite um número : ");
			num = leia.nextInt();
			somaNum += num;
		}
		while(num !=0 );
		
		System.out.println("\nA somatória dos números é : "+somaNum);

	}

}
