package entities;

public class Retangulo {
	public double largura;
	public double altura;
	
	public double area() {
		
		double area = altura * largura;
		return area;
	}
	
	public double perimetro() {
		
		double perimetro = (altura * 2) + (largura * 2);
		return perimetro;
	}
	
	public double diagonal() {
		
		double diagonal = Math.sqrt(altura * altura + largura * largura);
		return diagonal;
		
	}
	
}
