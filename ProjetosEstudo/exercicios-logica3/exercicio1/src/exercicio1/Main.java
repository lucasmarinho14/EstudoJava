package exercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
		//incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
		//impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002
		
		int senhaC,senhaI;
		
		senhaC = 2002;

		
		Scanner sc = new Scanner(System.in);
		senhaI = 0;
		
		while (senhaC != senhaI) {
			
			System.out.println("Digite sua senha");
			senhaI = sc.nextInt();
				if (senhaC != senhaI) {
					
					System.out.println("Senha Inválida");
				}
				else {
					System.out.println("Acesso Permitido");
				}
			
		}
		
		sc.close();
	}

}
