package br.com.exercicios;

/* 6) Leia a idade de 20 pessoas e exiba a soma das idades. */

import java.util.Scanner;

public class Numero6 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de idades que deseja inserir: ");
		
		int n = sc.nextInt();
		int [] vect = new int[n];
		
		System.out.println("Digite as idades em seguida: ");
		
		for (int i=0; i<n; i++) {
			vect[i] = sc.nextInt();
		}
		
		int sum = 0;
		for(int i=0; i<n; i++) {
			sum += vect[i];
		}
		
		System.out.println("Soma total das idades = " + sum);

		sc.close();
	}
}
