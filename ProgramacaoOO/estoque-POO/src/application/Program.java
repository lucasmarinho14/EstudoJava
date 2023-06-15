package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
	/* Toda classe em Java é uma subclasse da classe Object
	 Object possui os seguintes metodos:
	 getClass = retorna o tipo do objeto
	 equals = compara se o objeto é igual a outro
	 hashCode = retorna um código hash do objeto
	 toString = converte o objeto para string */

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Insira os dados do Produto: ");
		
		System.out.print("Nome: ");
		product.name = sc.nextLine();
		
		System.out.print("Preço: ");
		product.price = sc.nextDouble();
		
		System.out.print("Quantidade em estoque: ");
		product.quantity = sc.nextInt();
		
		System.out.println();
		System.out.println("Dados do Produto: " + product);
		
		System.out.println();
		System.out.print("Insira o numero de produtos a serem adicionados ao estoque: ");
		
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Dados atualizados: " + product);
		
		System.out.println();
		System.out.print("Insira o numero de produtos a serem removidos do estoque: ");
		
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Dados atualizados: " + product);
		
		sc.close();
	}

}
