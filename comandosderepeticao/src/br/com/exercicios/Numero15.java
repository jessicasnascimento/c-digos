package br.com.exercicios;

/* 15) Escreva um algoritmo que leia uma sequência de números do usuário e realize a 
soma desses números. Encerre a execução quando um número negativo for digitado  */

import java.util.Scanner;

public class Numero15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero = 0;
		int soma = 0;
		
		while (numero >= 0) {
		System.out.println("Entre com um número: ");	
		numero = sc.nextInt();
			
		if (numero > 0) {
			soma += numero;
		}	
   }			
		System.out.println("Soma total dos números: " + soma);
	
		sc.close();

	}

}
