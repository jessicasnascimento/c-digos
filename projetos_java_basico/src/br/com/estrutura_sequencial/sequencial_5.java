package br.com.estrutura_sequencial;

import java.util.Scanner;

public class sequencial_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cd1 = sc.nextInt();
		int qtd1 = sc.nextInt();
		float vlr1 = sc.nextFloat();
		
		int cd2 = sc.nextInt();
		int qtd2 = sc.nextInt();
		float vlr2 = sc.nextFloat();
		
		float total = qtd1 * vlr1 + qtd2 * vlr2;
		
	    System.out.printf("Valor a pagar: %.2f%n" , total);
	    
		sc.close();
		
	}

}
