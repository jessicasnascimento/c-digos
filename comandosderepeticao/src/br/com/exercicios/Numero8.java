package br.com.exercicios;

import java.util.Scanner;

/* 8) Leia a idade de 20 pessoas e exiba quantas pessoas são maiores de idade */

public class Numero8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        System.out.println("Digite a quantidade de idades que deseja inserir: ");
		
        int soma = 0;
		int idade = 0;
		
		
		for (int i=1; i<=20; i++) {
			System.out.println("Entre com a idade: ");
			idade = sc.nextInt();
			
			if (idade >= 18) {
				soma++;
			}
		}
       
		System.out.println(soma + " pessoa(s) com 18 anos ou mais");
			
		sc.close();
	}
}
