package br.com.exercicios;

/* 5) Escreva um algoritmo que leia 10 n�meros do usu�rio e calcule a soma desses 
n�meros. */

import java.util.Scanner;

public class Numero5 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        System.out.println("Digite a quantidade de n�meros que deseja inserir: ");
		
		int n = sc.nextInt();
		int [] vect = new int[n];
		
		System.out.println("Digite os n�meros em seguida: ");
		
		for (int i=0; i<n; i++) {
			vect[i] = sc.nextInt();
		}
		
		int sum = 0;
		for(int i=0; i<n; i++) {
			sum += vect[i];
		}
		
		System.out.println("Soma total dos n�meros = " + sum);		
			
		sc.close();
		
		}	
   }



