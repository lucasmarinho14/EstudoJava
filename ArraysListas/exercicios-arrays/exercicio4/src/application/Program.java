package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/* Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
		tela todos os números pares, e também a quantidade de números pares.*/

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar?");
		int qnt = sc.nextInt();
		int[] vetor = new int[qnt];
		
		for (int i=0; i<qnt;i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();
			
		}
		
		int qtdpares = 0;
		System.out.println("Numeros Pares: ");
		for (int i=0;i<vetor.length; i++) {
			
			if (vetor[i] % 2 == 0) {
				System.out.printf("%d ", vetor[i]);
				qtdpares++;
			}			
		}
		System.out.printf("\n\nQUANTIDADE DE PARES = %d\n", qtdpares);
		sc.close();
	}

}
