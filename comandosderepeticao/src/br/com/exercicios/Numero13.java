package br.com.exercicios;

import java.util.Scanner;

/*  13) Fa�a um algoritmo que leia 20 n�meros e, ao final, escreva quantos est�o entre 0 e 
100. */

public class Numero13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cont = 0;
		System.out.println("Digite a quantidade de n�meros que deseja inserir: ");
		int n = sc.nextInt();
		int [] vect = new int[n];
		
		System.out.println("Digite os n�meros em seguida: ");
		
		for (int i=0; i<n; i++) {
			vect[i] = sc.nextInt();
		}
		
		for (int i=0; i<n; i++) {
			if(vect[i] > 0 && vect[i] < 100 ){
				cont++;	
			}
		}
		
		System.out.println(cont + " n�mero(s) entre 0 e 100 ");
		
		sc.close();

	}

}
