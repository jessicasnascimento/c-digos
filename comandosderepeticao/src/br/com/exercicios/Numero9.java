package br.com.exercicios;
/* 9) Leia o nome e a idade de 10 pessoas e exiba o nome da pessoa mais nova. */

import java.util.Scanner;

public class Numero9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Digite a quantidade de pessoas que deseja inserir: ");
		
		int n = sc.nextInt();
		
		String[] nomes = new String[n];
		int[] idades = new int[n];
		
		int idadeNova = 99;
		String nomeNova = "";
		
		for (int i = 0; i < 3; i++) {
		System.out.println("Digite o nome da " + (i+1) + "°" + "pessoa");
		nomes[i] = sc.next();
		System.out.println("Digite a idade:");
		idades[i] = sc.nextInt();
		}

		for (int i = 0; i < 3; i++) {
			
		if (idades[i] < idadeNova) {
		idadeNova = idades[i];
		nomeNova = nomes[i];
		}
	}
		System.out.println("Nome pessoa mais nova: " + nomeNova);	
				
		sc.close();

	}
}
