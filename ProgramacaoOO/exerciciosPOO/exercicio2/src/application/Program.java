package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario fun = new Funcionario();
		
		System.out.print("Digite o Nome do Funcionario: ");
		fun.nome = sc.nextLine();
		
		System.out.print("Digite o salario: ");
		fun.salarioBruto = sc.nextDouble();
		
		System.out.print("Digite o imposto: ");
		fun.imposto = sc.nextDouble();
		
		System.out.println();
		System.out.println("Funcionario: " + fun);
		
		System.out.print("Qual a porcentagem incrementar ao salário? ");
		double porcentagem = sc.nextDouble();
		fun.aumentarSalario(porcentagem);
		
		System.out.println();
		
		System.out.println("Dados atualizados: " + fun);
		
		
		
		sc.close();

	}

}
