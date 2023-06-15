package exercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
		
		int numero,resto;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		numero = sc.nextInt();
		
		resto = numero % 2;
		
		if (resto > 0) {
			
			System.out.println("Seu número é Impar");
			
		}
		else {
			System.out.println("Seu número é Par");
			
		}
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
