/*Elabore um algoritmo que leia as notas de uma classe com 10 participantes durante 4 bimestres 
de um ano. As 4 notas de cada participante serão armazenadas em uma linha de uma matriz de números 
reais, logo cada linha da matriz serão as notas de um participante. 
Em um vetor de números reais, armazene as médias de cada participante e exiba as médias de cada um 
na tela.*/

package Arrays;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		double[][] mat= new double[10][4];
		double[] vet = new double[10];
		double soma=0;
		int i,j;
		
		for(j=0; j<10; j++) {
			System.out.println("Aluno "+(j+1));
			for (i=0; i<4; i++) {
				mat[j][i]=sc.nextDouble();
				soma+=mat[j][i];
			}
			vet[j]=soma/4;
			soma=0;
		}
		
		for (j=0; j<10; j++) {
			System.out.printf("%.2d",vet[j]);
			}
			
		}
		
		
	}


