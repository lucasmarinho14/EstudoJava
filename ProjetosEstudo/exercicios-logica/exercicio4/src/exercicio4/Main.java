package exercicio4;
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
		//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
		//decimais.
		
		Locale.setDefault(Locale.US);
		int numero;
		double horasTrabalhadas, valorPorHoras, salario;
		
		System.out.println("Digite o numero do funcionário: ");
		Scanner sc = new Scanner(System.in);
		numero = sc.nextInt();
		System.out.println("Digite as horas trabalhadas, e a remuneração por horas ");
		horasTrabalhadas = sc.nextDouble();
		valorPorHoras = sc.nextDouble();
		
		salario = horasTrabalhadas * valorPorHoras;
	
		System.out.printf("Numero do Funcionario: %d%n" + "Seu Salário é: %.2f%n", numero, salario);
		
		sc.close();

	}
}
