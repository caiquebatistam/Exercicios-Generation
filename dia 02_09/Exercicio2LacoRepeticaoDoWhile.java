package ProjetoFamiliaAtividades;


import java.util.Scanner;

/*
6- Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)
*/


public class Exercicio2LacoRepeticaoDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num, somaMult=0,mediaNum=0,contNum=0;
		
		Scanner leia = new Scanner(System.in);
		
		
		do
		{
			System.out.println("\nDigite um n�mero inteiro : ");
			num = leia.nextInt();
			
			if(num % 3 == 0 && num !=0 )
			{
				somaMult+=num;
				contNum++;
			}
		}
		while(num != 0 );
		
		mediaNum = somaMult / contNum;
		
		System.out.println("\nA M�dia dos n�meros multiplos de 3 � : "+mediaNum);
	}

}
