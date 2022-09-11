package br.com.estrutura_condicional;

import java.util.Scanner;

public class Condicional_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
	   if (N % 2 == 0) {
		   System.out.println("Par");
	   }
	   else {
		System.out.println("Ímpar");
	}
		
		sc.close();
	}
}
