/*1)	Elabore um algoritmo que leia 10 números inteiros e armazene em um vetor. 
 * Em seguida, mostre na tela:
 
●	Todos os elementos dos índices ímpares do vetor 
●	Todos os elementos do vetor que são números pares
●	A Soma de todos os elementos do vetor
●	A Média de todos os elementos do vetor, armazenada em uma variável do tipo real*/

package Arrays;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int[] vet= new int[10];
		double soma=0, media=0;
		media=soma/10;
		
		for (int i=0; i<10; i++) {
			vet[i]=sc.nextInt();
			soma+=vet[i];
			media=soma/10;
		}
		System.out.println("Elementos nos indices impares: ");
		for (int i=0; i<10; i++) {
			if(i%2==1) {
				System.out.print(vet[i]+" ");
			}
		}
		System.out.println("\nElementos pares: ");

		for (int i=0; i<10; i++) {
			if(vet[i]%2==0) {
				System.out.print(vet[i]+" ");
			}
		}
		System.out.println("\nSoma: "+soma);
		System.out.println("media: "+media);




		
		
		sc.close();
	}

}
