package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		//Exemplo de código simples sem o uso de Orientação a Objetos
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double xA, xB, xC, yA, yB, yC;
		
		System.out.println("Insira as medidas do triângulo X");
		
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		
		System.out.println("Insira as medidas do triângulo Y");
		
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		double p = (xA + xB + xC) / 2.0;
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
		
		 p = (yA + yB + yC) / 2.0;
		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
		
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
