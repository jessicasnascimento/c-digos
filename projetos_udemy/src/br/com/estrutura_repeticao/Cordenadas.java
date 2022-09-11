package br.com.estrutura_repeticao;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Cordenadas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y;
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		while ((x != 0) && (y != 0)) {
			if (x > 0 && y > 0) {
				System.out.println("Primeiro");
			}
			else if (x > 0 && y < 0) {
				System.out.println("Quarto");
			}
			else if (x < 0 && y < 0) {
				System.out.println("Terceiro");	
			}
			else if (x < 0 && y > 0) {
				System.out.println("Segundo");	
			}
			
			x = sc.nextInt();
			y = sc.nextInt();	
		}
		
		sc.close();
	}
}
