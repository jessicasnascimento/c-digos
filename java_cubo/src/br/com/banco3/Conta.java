package br.com.banco3;

public abstract class Conta {
	
  private String name;
  private double saldo;
  
  public String getName() {
	  return name;  
  }
  
  public void setName(String name) {
	  this.name = name;
  }
  
  public double getSaldo() {
	  return saldo;
  }
  
  public void setSaldo(double saldo) {
	  this.saldo = saldo;
	  
  }
  
  
  
  public abstract void imprimeExtrato();
  
  
  
}