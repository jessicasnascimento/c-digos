package br.com.exercicios;
import java.util.Scanner;

/* 7) Leia a idade de 20 pessoas e exiba a média das idades. */

public class Numero7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de idades que deseja inserir: ");
		
		int n = sc.nextInt();
		int [] vect = new int[n];
		
		
		
		for (int i=0; i<n; i++) {
			System.out.println((i+1) + "-" + "Digite as idades em seguida: ");
			vect[i] = sc.nextInt();
		}
		
		int sum = 0;
		for(int i=0; i<n; i++) {
			sum += vect[i];
		}
		
		double media =(double) sum / n;
		
		System.out.printf("Média total das idades = %.2f%n" , media);
		
		sc.close();

	}

}
