package ProjetoFamiliaAtividades;

import java.util.Scanner;

/*
4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.
*/

public class Exercicio4EstruturaDecisao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double num,raizQuadrada=0.0,numQuadrado=0.0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o primeiro número : ");
		num = leia.nextDouble();
		
		
		if (num%2==0)  %
		{
			raizQuadrada=Math.sqrt(num);
			System.out.println("\nO número é Par"+raizQuadrada);
		}
		else 
			numQuadrado=Math.pow(num,2);
			System.out.println("\nO número é Impar, e sua raiza quadrada é :  "+numQuadrado);
		

	}

}
