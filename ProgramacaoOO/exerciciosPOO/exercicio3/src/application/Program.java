package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno a1 = new Aluno();
		
		System.out.print("Digite o nome do Aluno: ");
		a1.nome = sc.nextLine();
		
		System.out.println("Digite suas 3 notas trimestrais");
		a1.nota1 = sc.nextDouble();
		a1.nota2 = sc.nextDouble();
		a1.nota3 = sc.nextDouble();
		
		double notaf = a1.nota1 + a1.nota2 + a1.nota3;
		
		a1.passou(notaf);
		
		sc.close();

	}

}
