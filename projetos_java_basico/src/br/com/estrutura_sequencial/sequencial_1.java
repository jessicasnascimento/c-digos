package br.com.estrutura_sequencial;

import java.util.Scanner;

public class sequencial_1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int primeiraEntrada = sc.nextInt();
		int segundaEntrada  = sc.nextInt();
		
		int total = primeiraEntrada + segundaEntrada;
		
		System.out.println("SOMA = " + total);
		
		sc.close();
}

}
