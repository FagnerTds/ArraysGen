/*Elabore um algoritmo que leia uma Matriz 3x3 de números inteiros e em seguida, 
mostre na tela:
●	Todos os elementos da Diagonal Principal
●	Todos os elementos da Diagonal Secundária
●	A Soma de todos os elementos da Diagonal Principal
●	A Soma de todos os elementos da Diagonal Secundária*/


package Arrays;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		int [][] mat = new int[3][3];
		int somaP=0, somaS=0;
		
		for(int j=0; j<3; j++) {
			for(int i=0; i<3; i++) {
				System.out.print("Elementos ["+j+","+i+"]");
				mat[j][i]=sc.nextInt();
			}
		}
		System.out.println("Elementos da diagonal principal");
		for(int i=0; i<3; i++) {
			System.out.print(mat[i][i]+" ");
			somaP+=mat[i][i];
		}
		System.out.println("\nElementos da diagonal secundária");
		for(int i=0; i<3; i++) {
			System.out.print(mat[i][3-1-i]+" ");
			somaS+=mat[i][3-1-i];
		}
		System.out.println("\nSoma dos elementos da diagonal Principal: "+somaP);
		System.out.println("\nSoma dos elementos da diagonal Secundária: "+somaS);	
			
		
		
		
		
		
		sc.close();

	}

}
