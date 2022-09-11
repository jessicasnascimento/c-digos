package br.com.banco2;

public abstract class Conta {
	
	private double saldo;
	private String name;
	
	public Conta() {
		
	}
	
	public double getSaldo() {
		return saldo;
		
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void imprimeExtrato();
	


}
