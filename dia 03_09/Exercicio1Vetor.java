package ProjetoFamiliaAtividades;

import java.util.Scanner;

/*
 1- Fa�a um programa que possua um vetor denominado A que armazene 6 n�meros inteiros. O programa deve executar os seguintes passos: 
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
(b) Armazene em uma vari�vel inteira (simples) a soma entre os valores das posi��es A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
(c) Modifique o vetor na posi��o 4, atribuindo a esta posi��o o valor 100. 
(d) Mostre na tela cada valor do vetor A, um em cada linha.
 */

public class Exercicio1Vetor {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int somaValor;
		int[] arrayA= {1,0,5,-2,-5,7};
		
		somaValor = arrayA[0]+arrayA[1]+arrayA[5];
		System.out.println("\nA soma do vetor arrayA nas posi��es 0,1 e 5 �  :  "+arrayA[0]+" + "+arrayA[1]+" + "+arrayA[5]+" = "+somaValor);
		
		arrayA[4] = 100;
	
		System.out.println("\nOs valores do vetor arrayA em cada posi��o � : "+arrayA[0]+"\n"+arrayA[1]+"\n"+arrayA[2]+"\n"+arrayA[3]+"\n"+arrayA[4]+"\n"+arrayA[5]);
	
		
		
		

		
		
		
		
	}
	
} 
