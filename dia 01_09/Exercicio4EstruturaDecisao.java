package ProjetoFamiliaAtividades;

import java.util.Scanner;

/*
4- Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.
*/

public class Exercicio4EstruturaDecisao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double num,raizQuadrada=0.0,numQuadrado=0.0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o primeiro n�mero : ");
		num = leia.nextDouble();
		
		
		if (num%2==0)  %
		{
			raizQuadrada=Math.sqrt(num);
			System.out.println("\nO n�mero � Par"+raizQuadrada);
		}
		else 
			numQuadrado=Math.pow(num,2);
			System.out.println("\nO n�mero � Impar, e sua raiza quadrada � :  "+numQuadrado);
		

	}

}
