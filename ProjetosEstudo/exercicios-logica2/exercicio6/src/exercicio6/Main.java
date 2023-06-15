package exercicio6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
		//seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
	    //nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
		
		double numero;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número");
		numero = sc.nextDouble();
		
		if (numero >= 0 && numero <= 25) {
			
			System.out.println("Seu numero está no intervalo entre 0 e 25!");
		}
		else if (numero > 25 && numero <= 50) {
			
			System.out.println("Seu numero está no intervalo entre 25 e 50!");
			
		}
		else if (numero > 50 && numero <= 75) {
			
			System.out.println("Seu numero está no intervalo entre 50 e 75!");
			
		}
		else if (numero > 75 && numero <= 100) {
			
			System.out.println("Seu numero está no intervalo entre 75 e 100!");
		}
		else {
			System.out.println("Seu número está fora de intervalo!");
		}
		
		
		sc.close();

	}

}
