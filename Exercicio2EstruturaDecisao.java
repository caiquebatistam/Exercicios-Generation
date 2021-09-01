package ProjetoFamiliaAtividades;

import java.util.Scanner;

/*
2- Faça um programa que entre com três números e coloque em ordem crescente.
*/

public class Exercicio2EstruturaDecisao {

	public static void main(String[] args) {
		
		int num1,num2,num3;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o valor de num 1 : ");
		num1 = leia.nextInt();
		System.out.println("\nDigite o valor de num 2 : ");
		num2 = leia.nextInt();
		System.out.println("\nDigite o valor de num 3 : ");
		num3 = leia.nextInt();
		
		if(num1 <= num2 && num2 <= num3);
		{
				System.out.println("\nA ordem crescente:\n"+num1+num2+num3);
		}
		if (num1 <= num3 && num3 <= num2)
	    {
				System.out.println("A ordem crescente:\n"+num1+num3+num2);
	    }
		if (num2 <= num1 && num1 <= num3)
	    {
				System.out.println("A ordem crescente: \n"+num2+num1+num3);
	    }
		if (num2 <= num3 && num3 <= num1) 
	    {
				System.out.println("A ordem crescente: \n"+num2+num3+num1);
	    }
		if (num3 <= num1 && num1 <= num2) 
	    {
				System.out.println("A ordem crescente: \n"+num3+num1+num2);
	    }
		else /* n3 <= n2 && n2 < n1 */
	    {
				System.out.println("A ordem crescente: \n"+num3+num2+num1);
	    }

		
			
	 
		
		
		
		
		
	}
	
	
}
