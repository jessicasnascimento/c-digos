package br.com.banco;


public class ContaTeste {
	public static void main(String[] args) {
		Conta cp = new ContaPoupanca();
		cp.setSaldo(2500);
		cp.imprimeExtrato();
		
		Conta cc = new ContaCorrente();
		cc.setNome("Jéssica Nascimento");
		cc.setSaldo(15000);
		cc.imprimeExtrato();
		
	}

}
