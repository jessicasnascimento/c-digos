package br.com.exercicios;

/* 15) Escreva um algoritmo que leia uma sequ�ncia de n�meros do usu�rio e realize a 
soma desses n�meros. Encerre a execu��o quando um n�mero negativo for digitado  */

import java.util.Scanner;

public class Numero15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero = 0;
		int soma = 0;
		
		while (numero >= 0) {
		System.out.println("Entre com um n�mero: ");	
		numero = sc.nextInt();
			
		if (numero > 0) {
			soma += numero;
		}	
   }			
		System.out.println("Soma total dos n�meros: " + soma);
	
		sc.close();

	}

}
