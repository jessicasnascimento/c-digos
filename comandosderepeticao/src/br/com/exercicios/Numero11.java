package br.com.exercicios;

import java.util.Scanner;

/* 11) Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são 
maiores do que 8. */

public class Numero11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de números que deseja inserir: ");
		
		int cont = 0;
		int n = sc.nextInt();
		int [] vect = new int[n];
		
		System.out.println("Digite os números em seguida: ");
		
		for (int i=0; i<n; i++) {
			vect[i] = sc.nextInt();
		}
		
		for (int i=0; i<n; i++) {
			if (vect[i] > 8) {
				cont++;
			}	
		}
		
		System.out.println(cont + " número(s) > 8");		
		
		sc.close();

	}

}
