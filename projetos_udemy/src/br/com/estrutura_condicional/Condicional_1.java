package br.com.estrutura_condicional;

import java.util.Scanner;

public class Condicional_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		if (N >= 0) {
			System.out.println("Não Negativo");
		}
		else {
			System.out.println("Negativo");
		}
		
		sc.close();
	}
}
