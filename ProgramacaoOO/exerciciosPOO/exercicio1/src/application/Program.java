package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo r = new Retangulo();
		
		System.out.println("Digite a largura e a altura do retangulo: ");
		
		r.largura = sc.nextDouble();
		r.altura = sc.nextDouble();
		
		System.out.printf("Área do Retangulo: %.2f%n", r.area());
		System.out.printf("Perimetro do Retangulo: %.2f%n", r.perimetro());
		System.out.printf("Diagonal do Retangulo: %.2f%n", r.diagonal());
		
		sc.close();
	}

}
