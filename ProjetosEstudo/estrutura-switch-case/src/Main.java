import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int x;
		String dia;
		
		System.out.println("Insira o dia");
		
		x = sc.nextInt();
		
		switch (x) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "terça";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6:
			dia = "sext";
			break;
		case 7:
			dia = "sábado";
			break;
		default:
			dia = "dia inválido";
			break;
		}
		 System.out.println("Dia da semana: " + dia);
		
		
		sc.close();
	}
}
