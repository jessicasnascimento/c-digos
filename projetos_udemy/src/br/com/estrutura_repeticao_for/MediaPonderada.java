package br.com.estrutura_repeticao_for;

import java.util.Locale;
import java.util.Scanner;

public class MediaPonderada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			
			float a = sc.nextFloat();
			float b = sc.nextFloat();
			float c = sc.nextFloat();
			
			float media = (a * 2.0f + b * 3.0f + c * 5.0f) / 10.0f;
			
			System.out.printf("%.1f%n", media);
			
		}
		
		
		sc.close();

	}

}
