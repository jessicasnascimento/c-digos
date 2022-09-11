package br.com.estrutura_condicional;

import java.util.Scanner;

public class Condicional_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		int horaInicial, horaFinal, horaMaxima, duracao;
		
		horaInicial = sc.nextInt();
		horaFinal = sc.nextInt();
		horaMaxima = 24;
		
		if (horaFinal > horaInicial) {
			duracao = horaFinal - horaInicial;	
		}
		else {
			duracao = horaMaxima + (horaFinal - horaInicial);
		}
		
		System.out.println("O Jogo durou " + duracao + " hora(s)" );
		sc.close();

	}

}
