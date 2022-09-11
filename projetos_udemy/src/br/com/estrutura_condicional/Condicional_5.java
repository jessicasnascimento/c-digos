package br.com.estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Condicional_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int cd = sc.nextInt();
		int qtd = sc.nextInt();
		
		float total = 0;
		
		if (cd == 1) {
			total = qtd * 4.0f;
		}
		else if (cd == 2){
			total = qtd * 4.50f;
		}
		else if (cd == 3){
			total = qtd * 5.0f;
		}
		else if (cd == 4){
			total = qtd * 2.0f;
		}
		else if (cd == 5){
			total = qtd * 1.50f;
		}
		
		System.out.printf("Valor total R$: %.2f%n " , total);
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
