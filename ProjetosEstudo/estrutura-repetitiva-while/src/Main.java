import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número");
		
		int x = sc.nextInt();
		
		int soma = 0;
		
		while (x != 0) {
			soma += x;
			System.out.println("Digite um número");
			x = sc.nextInt();
			
		}
		
		System.out.println("A soma dos numeros deu: " + soma);
		

		sc.close();
	}

}
