package br.com.exercicios;

import java.util.Scanner;

/* 12) Escreva um algoritmo que leia 20 n�meros do usu�rio e exiba quantos n�meros s�o 
pares */

public class Numero12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de n�meros que deseja inserir: ");
		
		int n = sc.nextInt();
		int [] vect = new int[n];
		
		System.out.println("Digite os n�meros em seguida: ");
		
		for (int i=0; i<n; i++) {
			vect[i] = sc.nextInt();
		}
		
		int cont = 0;
		for (int i=0; i<n; i++) {
			if(vect[i] % 2 ==0){
				cont++;	
			}
		}
		
		System.out.println(cont + " n�mero(s) Par(es)");
		
		sc.close();
	}
}
