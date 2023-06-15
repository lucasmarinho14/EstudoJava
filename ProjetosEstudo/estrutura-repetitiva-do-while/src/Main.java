import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		//Bloco de comandos é executado pelo menos uma vez.
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		char resp;
		
		do {
			
			System.out.println("Digite a temperatura em Celsius: ");
			double C = sc.nextDouble();
			double F = 9.0 * C / 5.0 + 32.0;
			
			System.out.printf("O equivalente em Fahrenheit: %.1f%n", F);
			
			System.out.print("Deseja repetir (s/n)?");
			resp = sc.next().charAt(0);
			
		} while (resp != 'n');
		
		sc.close();

	}

}
