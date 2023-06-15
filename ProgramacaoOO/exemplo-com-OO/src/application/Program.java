package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		
		/* Exemplo de código usando OO. A Classe Triangulo esta resolvendo o excesso de variáveis do codigo anterior,
		tornando-o mais limpo e legivel, a classe triangulo pode tambem ser reutilizada caso seja necessário criar 
		um novo objeto do tipo triangulo */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Insira as medidas do triângulo X");
		
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Insira as medidas do triângulo Y");
		
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double p = (x.a + x.b + x.c) / 2.0;
		double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
		
		 p = (y.a + y.b + y.c) / 2.0;
		double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));
		
		System.out.printf("Área do triangulo X: %.4f%n", areaX);
		System.out.printf("Área do triangulo Y: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("O triângulo X tem a maior Área");
		}
		else {
			System.out.println("O triângulo Y tem a maior Área");
		}
		
		sc.close();
	}

}
