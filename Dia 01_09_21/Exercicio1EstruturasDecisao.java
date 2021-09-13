package ProjetoFamiliaAtividades;

import java.util.Scanner;

/*
1- Faça um programa que receba três inteiros e diga qual deles é o maior.
*/

public class Exercicio1EstruturasDecisao {
	
	public static void main(String[] args) {
		
		int num1,num2,num3,maiorNum=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o valor de num1 : ");
		num1 = leia.nextInt();
		System.out.println("\nDigite o valor de num2 : ");
		num2 = leia.nextInt();
		System.out.println("\nDigite o valor de num3 : ");
		num3 = leia.nextInt();
		
		
		if(num1 > num2 && num1 > num3)
		{
			maiorNum = num1;
		}
		if(num2 > num1 && num2 > num3)
		{
			maiorNum = num2;
		}
		if(num3 > num1 && num3 > num2)
		{
			maiorNum = num3;
		}
		
		System.out.println("\nO maior NUM : "+maiorNum);
	}
	

}
