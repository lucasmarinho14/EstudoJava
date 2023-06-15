import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		//Altera a linguagem do sistema
		Locale.setDefault(Locale.US);
		
		//System.out.print = mensagem sem quebra de linha
		//System.out.println =  mensagem com quebra de linha
		System.out.print("Olá mundo!");
		System.out.println("Boa Tarde!");
		
		//****************************************************
		int y = 20;
		double x = 10.35784;
		
		System.out.println(y);
		System.out.println(x);
		
		//System.out.printf("%.2f%n", x); = Formata a exibição de numeros flutuantes. no ex: 2 numeros + quebra de linha
		
		System.out.printf("%.2f%n", x);
		
		//testando concatenação
		System.out.println("Resultado = " + x + " Metros");
		System.out.printf("Resultado = %.2f metros%n", x);
		
		
		//*****************************************************
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		//Concatenação usando vários elementos
		System.out.printf("%s tem %d anos, e ganha R$: %.2f reais%n", nome, idade,renda);
		

	}

}
