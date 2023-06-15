package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Banco;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o numero da conta: ");
		int nConta = sc.nextInt();
		
		System.out.print("Insira o nome do Titular: ");
		sc.nextLine();
		String nome = sc.nextLine();
		
		System.out.print("Deseja fazer um deposito inicial?(y/n): ");
		char opcao = sc.next().charAt(0);
		
		Banco banco;
		
		double quantia;
		
		if (opcao == 'y') {
			
			System.out.print("Digite o valor do deposito Inicial: ");
			quantia = sc.nextDouble();
			
			banco = new Banco(nConta, nome, quantia);
		}
		else {	
			
			banco = new Banco(nConta, nome);
		}
		
		System.out.println();
		System.out.println("Dados da conta: ");
		System.out.println(banco.toString());
		
		System.out.println();
		System.out.print("Digite o valor do Deposito: ");
		quantia = sc.nextDouble();
		
		banco.deposito(quantia);
		
		System.out.println();
		System.out.println("Dados da conta: ");
		System.out.println(banco.toString());
		
		System.out.println();
		System.out.print("Digite o Valor do Saque: ");
		quantia = sc.nextDouble();
		
		banco.saque(quantia);
		
		System.out.println("Dados da conta: ");
		System.out.println(banco.toString());
		
		
		
		sc.close();

	}

}
