package ProjetoFamiliaAtividades;

/*
	3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
		21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
		idade for =-99. (WHILE)
*/

import java.util.Scanner;

public class Exercicio1LacoRepeticaoWhile {

	public static void main(String[] args) {
		
		int idade=0,contMenor21=0,contMaior50=0;
		
		Scanner leia = new Scanner(System.in);
		
		while(idade != -99)
		{
			System.out.println("\nDigite a idade : ");
			idade = leia.nextInt();

			if(idade<21)
			{
				contMenor21 += idade;
			}
			else
			{
				contMaior50 += idade;
			}
		}
		System.out.println("\nPessoas com menos de 21 anos : ");
		System.out.println("\nPessoas com mais de 50 anos : ");
	}
}
