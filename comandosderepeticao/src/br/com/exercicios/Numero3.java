package br.com.exercicios;

/* 3) Leia o nome do usuário e escreva o nome dele na tela 10 vezes.  */

import java.util.Scanner;

public class Numero3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nomeUsuario = sc.next();
		
		for (int i =1; i<=10; i++) {
			
		System.out.println(i + ("-") + nomeUsuario);		
		}
		
		
		sc.close();

	}

}
