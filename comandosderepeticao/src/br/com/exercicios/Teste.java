package br.com.exercicios;

import java.util.Scanner;


public class Teste {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite a quantidade de pessoas que deseja inserir: ");
	
	int n = sc.nextInt();
	
	String[] nomes = new String[n];
	int[] idades = new int[n];
	
	int idadeNova = 99;
	String nomeNova = "";
	
	for (int i = 0; i < 3; i++) {
	System.out.println("Digite o nome: ");
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
	

