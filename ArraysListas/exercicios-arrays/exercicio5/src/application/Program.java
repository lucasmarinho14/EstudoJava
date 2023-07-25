package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
		o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
		considerando a primeira posição como 0 (zero). */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros voce vai digitar? ");
		int qnt = sc.nextInt();
		
		int[] vetor = new int[qnt];
		
		for (int i = 0; i < qnt; i++) {	
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();			
		}
		
		int maior = vetor[0];
	    int posmaior = 0;
	    
	    for (int i=1; i<qnt; i++) {
	        if (vetor[i] > maior) {
	            maior = vetor[i];
	            posmaior = i;
	        }
	    }
		
	    System.out.printf("MAIOR VALOR = %.1f\n", maior);
	    System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posmaior);
		
		sc.close();
	}

}
