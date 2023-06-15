package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		
		/* Nesse exemplo foi adicionado um método na classe triangulo para calcular a sua área, a vantagem disso
		 é delegar a responsabilidade deste calculo para a própria classe, tornando o código mais logico,
		  e melhor estruturado */
		
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
		
		
		double areaX = x.area();
		
		double areaY = y.area();
		
		System.out.printf("Área do triangulo X: %.4f%n", areaX);
		System.out.printf("Área do triangulo Y: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("O triângulo X tem a maior área");
		}
		else {
			System.out.println("O triângulo Y tem a maior área");
		}
		
		sc.close();
	}

}
