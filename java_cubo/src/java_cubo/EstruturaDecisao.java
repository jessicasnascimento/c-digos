package java_cubo;

import java.util.Scanner;

public class EstruturaDecisao {
	
	public static void main(String[] args) {
		EstruturaAninhada();
			
		}

	private static void EstruturaAninhada () {
		Scanner sc = new Scanner(System.in);
		float nota1, nota2, media;
		int n;
		
		System.out.print("Entre com sua primeira nota: ");
		nota1 = sc.nextFloat();
		System.out.print("Entre com sua segunda nota: ");
		nota2 = sc.nextFloat();
		
		media = (nota1 + nota2) / 2;
		if (media == 10.0) {
			System.out.println("Parabéns! Você foi aprovado com nota máxima");
		}
		else if (media >= 7) {
			System.out.printf("Parabéns! Você foi aprovado. Média: %.1f%n" , media);	
		}
		else if (media < 4){
			System.out.printf("Atenção! Você foi reprovado. Média: %.1f%n" , media);
		}
		else {
			System.out.println("Atenção! Você ficou de RECUPERAÇÃO" );
		}
		
		System.out.println();
		
		System.out.print("Escolha um número até X: ");
        n = sc.nextInt();
		switch (n) {
		case 1:
			System.out.println("Você escolheu o número 1");
			break;
		case 2:
			System.out.println("Você escolheu o número 2");
			break;
		case 3:
			System.out.println("Você escolheu o número 3");
			break;
		case 4:
			System.out.println("Você escolheu o número 4");
			break;
		default: System.out.println("Número inválido");
			break;
		}
	
		sc.close();

		}
		
	}


