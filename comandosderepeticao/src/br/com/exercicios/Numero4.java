package br.com.exercicios;

/*  4) Leia o nome um n�mero do usu�rio um n�mero N e escreva o nome dele na tela N 
vezes. */

import java.util.Scanner;

public class Numero4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva um n�mero:");
		int n = sc.nextInt();
		System.out.println("Escreva um nome:");
		String nome = sc.next();
		
		
		for(int i=0; i<=n; i++) {
			System.out.println((i+1) + ": " + nome);
		}
		
		sc.close();
	}

}
