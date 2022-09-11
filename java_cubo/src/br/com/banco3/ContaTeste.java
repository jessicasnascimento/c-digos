package br.com.banco3;

public class ContaTeste {

	public static void main(String[] args) {
		
		ContaFran cf = new ContaFran();
		cf.setName("Fran");
		cf.setSaldo(2000);
		cf.imprimeExtrato();
		
		System.out.println("------------------");
		
		ContaJessica cj = new ContaJessica();
		cj.setName("Fran");
		cj.setSaldo(2000);
		cj.imprimeExtrato();
		
		
		

	}

}
