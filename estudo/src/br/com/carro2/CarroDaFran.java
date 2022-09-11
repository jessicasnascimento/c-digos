package br.com.carro2;

import br.com.carro.Carro;

public class CarroDaFran implements CarroImpl{

	private String modelo;
	private double preco;
	

	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public void acelerar() {
		System.out.println("VRUUUM");
	}

	@Override
	public void freiar() {
		System.out.println("FREIAAAANDO");
		
	}
	
	public static void imprimirCarro(CarroDaFran c) {
		System.out.println("------INFORMAÇÕES------");
		System.out.println("Modelo: " + c.getModelo());
		System.out.println("Preco: " + c.getPreco());
		
	}

}
