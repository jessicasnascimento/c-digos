package br.com.estrutura_repeticao_for;

import java.util.Scanner;

public class ValoresImpares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
	for(int i=1; i<=x; i++) {
		if(i % 2 != 0) {
			System.out.println(i);
		}
	}
		
		sc.close();

	}

}
