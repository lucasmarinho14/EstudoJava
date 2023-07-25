package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		/* Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
		tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
		bem como os nomes dessas pessoas caso houver. */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas?");
		int qnt = sc.nextInt();
		
		Pessoa[] vetor = new Pessoa[qnt];
		
		for (int i = 0;i<qnt; i++) {
			
			
			System.out.printf("Dados da %d pessoa: %n",i+1);
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			
			vetor[i] = new Pessoa(nome,idade,altura);
			
		}
		
		double nmenores = 0;
		double soma=0;
		for (int i=0;i<qnt;i++) {
			
			if (vetor[i].getIdade() < 16) {
	            nmenores++;
	        }
			soma = soma + vetor[i].getAltura();
		}
		
		double altmedia = soma / vetor.length;
		
		System.out.printf("Altura média: %.2f%n", altmedia);
		
		double percentualMenores = (nmenores/vetor.length) * 100;
		
		 System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);
		

		for(int i=0; i<qnt; i++) {
			if (vetor[i].getIdade() < 16) {
				System.out.printf("%s\n", vetor[i].getNome()); 
			 }
		}
		    
		sc.close();

	}

}
