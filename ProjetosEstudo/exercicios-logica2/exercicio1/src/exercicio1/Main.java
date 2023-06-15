package exercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
		
		int numero;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		numero = sc.nextInt();
		
		if (numero < 0){
			System.out.println("Seu número é Negativo");			
		}
		else {
			System.out.println("Seu número não é negativo");
		}
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
