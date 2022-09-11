package br.com.carro2;

public class CarroTeste {

	public static void main(String[] args) {
		CarroDaFran cf = new CarroDaFran();
		cf.setModelo("Fran2.1");
		cf.setPreco(50000);
		CarroDaFran.imprimirCarro(cf);
		cf.acelerar();
		cf.freiar();
		
		System.out.println();

	}

}
