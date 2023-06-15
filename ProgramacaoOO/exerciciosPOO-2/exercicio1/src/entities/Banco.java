package entities;

public class Banco {
	
	private int nConta;
	private String nome;
	private double saldo;
	
	
	public Banco(int nConta, String nome) {
		
		this.nConta = nConta;
		this.nome = nome;
		
	}
	
	public Banco(int nConta, String nome, double quantia) {
		
		this.nConta = nConta;
		this.nome = nome;
		deposito(quantia);		
	}
	

	//Getters e setters*************************
	public int getnConta() {
		return nConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposito(double saldo) {
		
		this.saldo += saldo;
	}
	public void saque(double saldo) {
		
		this.saldo = this.saldo - saldo - 5.00;
	}
	//******************************************

	public String toString() {
		return "Conta: " + nConta + ", " + "Titular: "+ nome + ", " + "Saldo: $" + String.format("%.2f", saldo);
	}
	

}
