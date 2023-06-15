package entities;

public class Aluno {
	
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public void passou(double notaf) {
		
		if (notaf >= 60) {
			
			System.out.printf(" %S %n Nota Final: %.2f %n Aprovado", nome,notaf);
			
		}
		else {
			
			double faltou = 60 - notaf;
			System.out.printf(" %S %n Nota Final: %.2f %n Reprovado %n Faltaram %.2f pontos", nome,notaf,faltou);
			
		}
		
		
	}
	
	
	
}
