package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/* Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
		e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos. */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos Números voce vai digitar?");
		
		int  qnt = sc.nextInt();
		
		if (qnt > 10) {
			System.out.println("O número maximo é 10, digite novamente.");
			qnt = sc.nextInt();
		}
		
		int[] vetor = new int[qnt];
		
		for (int i=0;i<qnt;i++) {		
	    	System.out.print("Digite um numero: ");
	        vetor[i] = sc.nextInt();	
		}
		
		System.out.println("Numeros negativos:");
		for (int i=0;i<qnt;i++) {
			
			if (vetor[i]<0) {
				
				System.out.println(vetor[i]);	
			}
		}
		
		
		sc.close();
		

	}

}
