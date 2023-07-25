package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/* Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
		- Imprimir todos os elementos do vetor
		- Mostrar na tela a soma e a média dos elementos do vetor*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int qnt = sc.nextInt();
		
		double[] vetor = new double[qnt];
		
		for (int i=0;i<qnt;i++) {
			
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextDouble();
			
		}
		
		System.out.print("Valores: ");
		
	    for (int i=0; i<qnt; i++) {
	    	
	    	System.out.printf("%.1f  ", vetor[i]);
	    }
	    
	    double soma = 0;
	    for (int i=0;i<qnt;i++) {
	    	
	    	soma = soma + vetor[i];
	    	
	    }
	    System.out.println();
		System.out.printf("Soma: %.2f%n", soma);
		
		double media = soma / vetor.length;
		
		System.out.printf("Média: %.2f%n",media);
	    
		sc.close();
		

	}

}
