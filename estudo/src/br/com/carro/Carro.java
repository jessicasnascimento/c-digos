package br.com.carro;

public class Carro implements CarroAcoesImpl{
	
	private String modelo;
	private String cor;
	private double preco;
	
	public Carro() {
		System.out.println("Entrou");
	}
	
	public Carro(String modelo) {
		this.modelo = modelo;
	}
	
	public Carro(String modelo, String cor) {
		this.modelo = modelo;
		this.cor = cor;
	}
	
	public Carro(String modelo, String cor, double preco) {
		if(preco > 50000) {
			this.modelo = modelo;
			this.cor = cor;
			this.preco = preco;
		}
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getCor() {
		return cor;
	}
		
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void reparar() {
		System.out.println("Carro REPARADO COM SUCESSO.");
	}
	
	public void desvalorizar(double valor) {
		preco = preco - valor;
	}
	
	public static void imprimirCarro(Carro carro) {
		System.out.println("------INFORMAÇÕES------");
		System.out.println("Modelo: " + carro.getModelo());
		System.out.println("Cor: " + carro.getCor());
		System.out.println("Preco: " + carro.getPreco());
	}

	@Override
	public void acelerar() {
		System.out.println("VRRRRUMMMM");
	}

	@Override
	public void freiar() {
		System.out.println("FREIANDOO");
	}
	
}
