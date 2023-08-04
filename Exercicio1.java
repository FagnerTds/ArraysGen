/*Dado um vetor contendo 10 números inteiros não ordenados e não repetidos, 
construa um algoritmo que consiga pesquisar dados no vetor, onde o usuário irá digitar um número e o 
programa deve exibir na tela a posição deste número no vetor. Caso o número não seja encontrado, 
a mensagem: “Não foi encontrado!” deve ser exibida na tela.*/

package Arrays;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner sc = new Scanner(System.in)) {
			int[]vet ={2,5,1,3,4,9,7,8,10,6};
			int i;
			boolean e=false;
			
			System.out.print("Digite o número que você deseja encontrar");
			int loc=sc.nextInt();
			
			for( i=0; i<10;i++) {
				if(vet[i]==loc) {
					System.out.println("o número "+loc+" está localizado na posição "+i);
					e=true;
					break;
				}
			}if(!e) {
				System.out.println("Numero não localizado");
			}
			
			
			
			sc.close();
			
		}
	}

}
