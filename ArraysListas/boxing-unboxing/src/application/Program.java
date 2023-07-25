package application;

public class Program {

	public static void main(String[] args) {
		//Boxing - É o processo de conversão de um objeto tipo valor para um objeto tipo referência compatível.
		// É o processo de conversão de um objeto tipo refência para um objeto tipo valor compativel
		
		int x = 20;
		Object obj = x;
		
		System.out.println(obj);
		
		int y = (int) obj;
		
		System.out.println(y);

	}

}
