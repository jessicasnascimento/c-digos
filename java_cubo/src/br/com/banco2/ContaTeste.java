package br.com.banco2;


public class ContaTeste {

	public static void main(String[] args) {
		  Conta cp = new ContaPoupanca();
	      cp.setSaldo(2500);
	      cp.setName("Jéssica");
	      cp.imprimeExtrato(); 	
	      
	   System.out.println();
	   
		Conta cc = new ContaCorrenteTacy();
		cc.setSaldo(5000);
		cc.setName("Tacyana");
		cc.imprimeExtrato();
  
      
	}

}
