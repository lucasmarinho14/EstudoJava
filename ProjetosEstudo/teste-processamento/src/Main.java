
public class Main {

	public static void main(String[] args) {
		
		int x, y;
		
		x = 5;
		y = 2 * x;
		
		System.out.println(x);
		System.out.println(y);
		
		//******************************************************************
		//Codigo para calculo da área de um trapézio
		
		double b, B, h, area;
		
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		area = (b + B) / 2.0 * h;
		
		System.out.println("A área do trapézio é: " + area);
		
		
		//******************************************************************
		//Resultado de operação aritimética com ponto flutuate obrigatório
		
		int n1, n2;
		double resultado;
		
		n1 = 5;
		n2 = 2;
		
		resultado = (double) n1 / n2;
		
		System.out.println(resultado);
		//caso não fosse usado o "(double)", a variável resultado retornaria um valor inteiro sem os decimais.
		
		//******************************************************************
		
		
		
		
		
				
	}

}
