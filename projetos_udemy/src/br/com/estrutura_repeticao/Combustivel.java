package br.com.estrutura_repeticao;

import java.util.Scanner;

public class Combustivel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tipo, alcool, gasolina, diesel;
		
		alcool = 0;
		gasolina = 0;
		diesel = 0;
		
		System.out.println("Qual combustível você abasteceu?");
		tipo = sc.nextInt();
		
		
			while (tipo != 4) {
				if (tipo == 1) {
					alcool = alcool + 1;	
				}
				else if (tipo == 2){
					gasolina = gasolina + 1;
				}
				else if (tipo == 3) {
					diesel = diesel + 1;
				}

				tipo = sc.nextInt();

			}
			
		
		System.out.println("Muito Obrigado");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		
		sc.close();
	}

}
