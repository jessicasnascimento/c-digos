package br.com.estrutura_repeticao_for;

import java.util.Scanner;

public class Divisao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a == 0 || b == 0) {
			System.out.println("Divisão impossível");	
		}
		
		else {
			
			float div = (float) a / b;
			System.out.printf("%.1f%n", div);
		}
		
		
		}
		
			
		sc.close();

	}

}
