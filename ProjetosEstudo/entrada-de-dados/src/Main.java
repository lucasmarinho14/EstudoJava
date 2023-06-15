import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y;
		double z;
		
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		
		System.out.println("Você digitou: " + x );
		System.out.println("Você digitou: " + y );
		System.out.println("Você digitou: " + z );
		
		sc.close();
		
		//sc.next = String, sc.nextInt = inteiro, sc.nextDouble = ponto flutuante(localidade do sistema)
		
	}

}
