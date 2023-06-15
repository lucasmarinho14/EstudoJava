import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// (condição) ? valor_se_verdadeiro : valor_se_falso
		
		Scanner sc = new Scanner(System.in);
		double preco = 34.5, desconto;		
		
		if (preco < 20.0) {
			desconto = preco * 0.1;
		}
		else {
			desconto = preco * 0.05;
		}
		
		System.out.println(desconto);
		
		
		//Opção com expressao condicional ternaria
		desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		
		System.out.println(desconto);
		
		
		sc.close();

		
	}

}
