package br.com.estrutura_sequencial;

import java.util.Scanner;

public class sequencial_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double raio, area, pi = 3.14159;
		raio = sc.nextDouble();
		area = pi * Math.pow(raio, 2.0);
		System.out.printf("A= %.4f%n" ,area);
		
		sc.close();
		}

}
