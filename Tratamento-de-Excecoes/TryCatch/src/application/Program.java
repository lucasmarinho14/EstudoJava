package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/* 
		 * Bloco Try = Contem o codigo que representa a exxecução normal do trecho
		 * de codigo que pode acarretar em uma exceção
		 * 
		 * Block catch = Contem o código a ser executado caso uma ecveção ocorra
		 * Deve ser especificado o tipo da exceção a ser tratada (upcasting é permitido)
		 * */
		
		method1();
		System.out.println("Fim do Programa");
		
		
	}
	public static void method1() {
		
		System.out.println("***METHOD2 START***");
		method2();
		System.out.println("***METHOD2 END***");
	}
	
	public static void method2(){
		
		System.out.println("***METHOD2 START***");
		Scanner sc = new Scanner(System.in);
		
		try {
			
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Invalid position!");
			//mostra toda chamada de metodos que acarretou em uma exceção
			e.printStackTrace();
			
		}
		catch(InputMismatchException e){
			System.out.println("Input Error");
		}
		
		System.out.println("***METHOD2 END***");
		sc.close();
		
	}

}
