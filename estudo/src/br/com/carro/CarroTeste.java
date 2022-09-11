package br.com.carro;

public class CarroTeste {

	public static void main(String[] args) {
		Carro c1 = new Carro();
		c1.setPreco(55000);
		c1.setModelo("Kwid");
		c1.setCor("Branco");
		c1.getPreco();
		Carro.imprimirCarro(c1);
		c1.acelerar();
		c1.freiar();
		
		Carro c2 = new Carro();
		c2.setPreco(61000);
		c2.setModelo("Sandero");
		c2.setCor("Preto");
		Carro.imprimirCarro(c2);
		
		Carro c3 = new Carro("Fusca", "Azul");
		Carro.imprimirCarro(c3);
		
		Carro c4 = new Carro("New Fusca", "Azul", 51000);
		c4.reparar();
		c4.desvalorizar(10000);
		
		System.out.println();
	}
}
